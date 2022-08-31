package decorator.subs;

public class Chicken extends Sub {

    public Chicken(){
        description = "Саб куриное филе";
    }

    @Override
    public double cost() {
        return 455;
    }
}
