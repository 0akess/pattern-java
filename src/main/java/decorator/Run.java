package decorator;

import decorator.components.Cheese;
import decorator.components.ChickenSteak;
import decorator.components.Olives;
import org.junit.jupiter.api.Test;

public class Run {

    @Test
    public void run(){
        Sub sub = new ItalianBMT();

        sub = new Cheese(sub, 12);
        sub = new ChickenSteak(sub, 2);
        sub = new Olives(sub, .3);
        sub = new Cheese(sub, 3);

        System.out.println(sub.cost());
        System.out.println(sub.getDescription());
    }
}
