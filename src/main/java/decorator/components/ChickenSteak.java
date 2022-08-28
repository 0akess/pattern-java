package decorator.components;

import decorator.Sub;

public class ChickenSteak extends ComponentsDecorator {

    private Sub sub;
    private double price;

    public ChickenSteak(Sub sub, int countChickenSteak){
        this.sub = sub;
        if (countChickenSteak > 0){
            this.price = countChickenSteak * 45;
        } else {
            throw new NullPointerException("Введите одну и более колл. Курицы");
        }
    }

    @Override
    public String getDescription() {
        return sub.getDescription() +
                "\n*** курица цена: " + price + " ***";
    }

    @Override
    public double cost() {
        return sub.cost() + price;
    }
}
