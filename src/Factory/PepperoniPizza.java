package Factory;

public class PepperoniPizza extends Pizza {
    @Override
    public void prepare(){
        System.out.println("Pepperoni Pizza is being prepared...");
    }
}
