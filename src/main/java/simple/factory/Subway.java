package simple.factory;

import simple.factory.factory.SimpleSubFactory;
import simple.factory.subs.Sub;

public class Subway {

    SimpleSubFactory factory;

    public Subway(SimpleSubFactory factory){
        this.factory = factory;
    }

    public void orderSub(){
        Sub sub;
        sub = factory.createSub();

        sub.cheese();
        sub.mainIngredient();
        sub.vegetables();
        sub.salt();
        sub.sauce();
        sub.price();
    }
}
