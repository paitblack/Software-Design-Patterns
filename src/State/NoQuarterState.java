package State;

public class NoQuarterState implements State{
    GumballMachine gm;

    public NoQuarterState(GumballMachine gm) {
        this.gm = gm;
    }

    @Override
    public void insertQuarter() {
        gm.setState(gm.getHAS_QUARTER());
        System.out.println(this.getClass().getName() + " Valid Action");

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

    }
}
