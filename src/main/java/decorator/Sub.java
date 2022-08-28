package decorator;

public abstract class Sub {

    String description = "Sub unknown";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
