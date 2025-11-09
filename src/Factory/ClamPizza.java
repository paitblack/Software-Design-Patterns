package Factory;

public class ClamPizza extends Pizza {
    @Override
    public void prepare(){
        System.out.println("Clam Pizza is being prepared...");
    }
}
