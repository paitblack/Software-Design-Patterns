package Iterator;

public class Test {
    public static void main(String... args){

        Waitress w = new Waitress(new PancakeHouseMenu(), new DinerMenu(),new PancakeHouseMenu());
        w.printMenu();
    }
}
