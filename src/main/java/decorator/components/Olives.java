package decorator.components;

import decorator.Sub;

public class Olives extends ComponentsDecorator {

    private Sub sub;
    private double price;

    public Olives(Sub sub, double countOlives) {
        this.sub = sub;
        if (countOlives >= 0 && countOlives <= .1) {

        } else if (countOlives >= .1) {
            price = ((countOlives - .1) / .1 * 5);
        } else {
            throw new NullPointerException("Введите правильное значение Оливок");
        }
    }

    @Override
    public String getDescription() {
        if (price == .0) {
            return sub.getDescription() + "\n*** оливки ***";
        } else {
            return sub.getDescription() + "\n*** оливки цена: " + price + " ***";
        }
    }

    @Override
    public double cost() {
        if (price == .0) {
            return sub.cost();
        } else {
            return sub.cost() + price;
        }
    }
}
