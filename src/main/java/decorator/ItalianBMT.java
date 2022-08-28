package decorator;

public class ItalianBMT extends Sub {

    public ItalianBMT(){
        description = "Итальянский БМТ";
    }

    @Override
    public double cost() {
        return 420.00;
    }
}
