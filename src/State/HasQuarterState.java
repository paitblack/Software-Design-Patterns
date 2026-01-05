package State;

import java.util.Random;

public class HasQuarterState implements State{
    GumballMachine gm;
    Random random = new Random();

    public HasQuarterState(GumballMachine gm) {
        this.gm = gm;
    }

    @Override
    public void insertQuarter() {
        System.out.println(this.getClass().getName() + " Invalid Action");
    }

    @Override
    public void ejectQuarter() {
        gm.setState(gm.getNO_QUARTER());
        System.out.println(this.getClass().getName() + " Valid Action");
    }

    @Override
    public void turnCrank() {
            int value = random.nextInt(2);
            if (gm.getCount() > 1 && value == 1 ) {
                gm.setState(gm.WINNER);
            }else{
                gm.setState(gm.getSOLD());
            }
        System.out.println(this.getClass().getName() + " Valid Action");
    }


    @Override
    public void dispense() {
        System.out.println(this.getClass().getName() + " Invalid Action");
    }

    @Override
    public void refill(int count) {

    }
}
