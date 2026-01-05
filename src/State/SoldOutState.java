package State;

public class SoldOutState implements State{
    GumballMachine gm;

    public SoldOutState(GumballMachine gm) {
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
        System.out.println(this.getClass().getName() + " Invalid Action");
    }

    @Override
    public void refill(int count) {
        gm.count += count;
        gm.setState(gm.NO_QUARTER);
    }
}
