package decorator.components;

import decorator.subs.Sub;

public class Cheese extends ComponentsDecorator {

    private Sub sub;
    private double price;
    private static int canUse = 6;

    public Cheese(Sub sub, int countCheese) {
        this.sub = sub;

        if (countCheese > 0) {
            if (countCheese <= canUse && canUse > 0) {
                canUse -= countCheese;
            } else if (countCheese >= canUse && canUse > 0) {
                this.price = (countCheese - canUse) * 20;
                canUse -= countCheese;
            } else if (canUse <= 0) {
                this.price = countCheese * 20;
            }
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
