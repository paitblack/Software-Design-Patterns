package State;

public class SoldState implements State{
    GumballMachine gm;

    public SoldState(GumballMachine gm) {
        this.gm = gm;
    }

    @Override
    public void insertQuarter() {
        System.out.println(this.getClass().getName() + " Invalid Action");
    }

    @Override
    public void ejectQuarter() {
        System.out.println(this.getClass().getName() + " Invalid Action");
    }

    @Override
    public void turnCrank() {
        System.out.println(this.getClass().getName() + " Invalid Action");
    }

    @Override
    public void dispense() {
        System.out.println("Dispensing");
        gm.decrementCount();
        if (gm.getCount() > 0)
            gm.setState(gm.NO_QUARTER);
        else
            gm.setState(gm.SOLD_OUT);
    }

    @Override
    public void refill(int count) {

    }
}
