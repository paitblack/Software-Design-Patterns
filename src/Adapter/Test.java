package Adapter;

public class Test {
    public static void main (String... args){
        DuckSimulator sim = new DuckSimulator();

        sim.addDuck(new MallardDuck());
        sim.addDuck(new MallardDuck());

        sim.addDuck(new TurkeyAdapter(new WildTurkey()));


        sim.flyAll();

        sim.quackAll();
    }
}
