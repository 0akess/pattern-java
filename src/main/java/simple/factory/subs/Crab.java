package simple.factory.subs;

import simple.factory.ingredient.ComponentsSub;

public class Crab implements Sub {

    @Override
    public void cheese() {
        new ComponentsSub().addCheese();
    }

    @Override
    public void mainIngredient() {
        System.out.println("Добавляем крабовое мясо");
    }

    @Override
    public void vegetables() {
        new ComponentsSub().addVegetables();
    }

    @Override
    public void salt() {
        new ComponentsSub().addSalt();
    }

    @Override
    public void sauce() {
        new ComponentsSub().addSauce();
    }

    @Override
    public void price() {
        System.out.println("С ваc 700 рублей");
    }
}
