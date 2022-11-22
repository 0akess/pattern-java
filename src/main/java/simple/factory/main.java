package simple.factory;

import simple.factory.factory.SimpleSubFactory;

public class main {

    public static void main(String[] args) {

        new Subway(new SimpleSubFactory()).orderSub();
    }
}
