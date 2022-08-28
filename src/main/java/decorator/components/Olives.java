package decorator.components;

import decorator.Sub;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Olives extends ComponentsDecorator {

    private Sub sub;
    private double price;

    public Olives(Sub sub, double countOlives) {
        this.sub = sub;
        if (countOlives >= 0 && countOlives <= .1) {

        } else if (countOlives >= .1) {

            this.price = new BigDecimal(countOlives)
                    .subtract(BigDecimal.valueOf(0.1))
                    .divide(BigDecimal.valueOf(.1))
                    .multiply(BigDecimal.valueOf(5))
                    .setScale(0, RoundingMode.DOWN).doubleValue();

        } else throw new NullPointerException("Введите правильное значение Оливок");
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
