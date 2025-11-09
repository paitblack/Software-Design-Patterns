package Factory;

public class Test {
    public static void main(String[] args) {
        SimplePizzaFactory spf = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(spf);
        store.orderPizza("cheese");

    }
}
