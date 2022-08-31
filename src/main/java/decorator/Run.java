package decorator;

import decorator.components.Cheese;
import decorator.components.ChickenSteak;
import decorator.components.Olives;
import decorator.subs.Chicken;
import decorator.subs.ItalianBMT;
import decorator.subs.Sub;
import org.junit.jupiter.api.Test;

public class Run {

    @Test
    public void run(){
        Sub sub = new ItalianBMT();

        sub = new Cheese(sub, 1);
        sub = new ChickenSteak(sub, 1);
        sub = new Olives(sub, .4);
        sub = new Cheese(sub, 6);
        sub = new ChickenSteak(sub, 2);
        sub = new Olives(sub, .2);
        sub = new Cheese(sub, 1);

        System.out.println(sub.cost());
        System.out.println(sub.getDescription());

        Sub sub2 = new Chicken();

        sub2 = new Cheese(sub2, 12);
        sub2 = new ChickenSteak(sub2, 1);
        sub2 = new Olives(sub2, .4);
        sub2 = new Cheese(sub2, 4);
        sub2 = new ChickenSteak(sub2, 2);
        sub2 = new Olives(sub2, .2);

        System.out.println(sub2.cost());
        System.out.println(sub2.getDescription());
    }
}
