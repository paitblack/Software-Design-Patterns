package Strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.swim();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("--------------------------");

        Duck model = new ModelDuck();
        model.display();
        model.swim();
        model.performQuack();
        model.performFly();

        System.out.println("--------------------------");

        // Enabling model to fly :
        // Use a mutator (setter) method to enable model to fly.

        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();

    }
}
