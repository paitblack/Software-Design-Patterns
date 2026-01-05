package State;

public class TestGumballMachine {

    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(4);

        machine.insertQuarter();
        machine.turnCrank();

        machine.insertQuarter();
        machine.insertQuarter(); // warning
        machine.ejectQuarter();
        machine.turnCrank();  //warning

        machine.insertQuarter();
        machine.turnCrank();

        machine.insertQuarter();
        machine.turnCrank();

        machine.insertQuarter();
        machine.turnCrank();

        machine.insertQuarter();
        machine.turnCrank();


    }
}
