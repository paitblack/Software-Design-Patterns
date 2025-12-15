package Iterator;

import java.util.Iterator;
import java.util.ArrayList;
public class PancakeHouseMenu implements Menu{
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public PancakeHouseMenu(){
        addItem("Breakfast","Egg,Cheese,Tea",false,3);
        addItem("Waffles","Chocolate,Banana",true,5);
    }

    public void addItem(String name,String description, boolean vegetarian, double price){
        MenuItem item = new MenuItem(name,description,vegetarian,price);
        menuItems.add(item);
    }

    public Iterator<MenuItem> iterator(){
        return menuItems.iterator();
    }
    @Override
    public String getName(){
        return "Breakfast";
    }
}
