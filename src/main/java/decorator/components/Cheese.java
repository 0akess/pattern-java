package decorator.components;

import decorator.Sub;

public class Cheese extends ComponentsDecorator {

    private Sub sub;
    private double price;

    public Cheese(Sub sub, int countCheese) {
        this.sub = sub;

        if (countCheese >= 1 && countCheese <= 2) {
        } else if (countCheese > 2) {
            this.price = (countCheese - 2) * 20;
        } else {
            throw new NullPointerException("Укажите количество сыра больше 0");
        }
    }

    @Override
    public String getDescription() {
        return sub.getDescription() +
                "\n*** сыр цена: " + price + " ***";
    }

    @Override
    public double cost() {
        return sub.cost() + price;
    }
}
