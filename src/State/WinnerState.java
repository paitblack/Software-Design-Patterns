package State;

public class WinnerState implements State {
    GumballMachine gm;
    public WinnerState(GumballMachine gumballMachine) {
        this.gm = gumballMachine;
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
        System.out.println("You are the winner");
        gm.decrementCount();
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
