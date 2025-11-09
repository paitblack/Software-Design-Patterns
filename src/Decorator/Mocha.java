package Decorator;

public class Mocha extends CondimentsDecorator{
    Beverage beverage; // An instance variable to hold the beverage we are wrapping.

    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Mocha";
    }

    public double cost(){
        return .20 + beverage.cost();
    }
}
