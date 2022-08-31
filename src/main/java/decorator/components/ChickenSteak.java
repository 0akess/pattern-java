package decorator.components;

import decorator.subs.Sub;

public class ChickenSteak extends ComponentsDecorator {

    private Sub sub;
    private double price;
    private static int countChicken;

    public ChickenSteak(Sub sub, int countChickenSteak) {
        this.sub = sub;
        countChicken += countChickenSteak;
        if (sub.getDescription().startsWith("Саб куриное филе")
                && countChicken < 2 && countChickenSteak > 0) {

        } else {
            if (countChickenSteak > 0) {
                this.price = countChickenSteak * 45;
            } else {
                throw new NullPointerException("Введите одну и более колл. Курицы");
            }
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
