package State;

public class GumballMachine {

    int count;
    final  State SOLD_OUT = new SoldOutState(this);
    final  State NO_QUARTER = new NoQuarterState(this);
    final  State HAS_QUARTER = new HasQuarterState(this);
    final  State SOLD = new SoldState(this);
    final State WINNER = new WinnerState(this);
    State state = SOLD_OUT;


    public GumballMachine(int count){


        this.count = count;
        if (count > 0){
            state = NO_QUARTER;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();

    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public State getSOLD_OUT() {
        return SOLD_OUT;
    }

    public State getNO_QUARTER() {
        return NO_QUARTER;
    }

    public State getHAS_QUARTER() {
        return HAS_QUARTER;
    }

    public State getSOLD() {
        return SOLD;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void decrementCount(){
        count--;
    }

    public void refill(int count){
        state.refill(count);
    }
}
