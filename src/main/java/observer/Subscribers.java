package observer;

import java.util.List;

public class Subscribers implements Observer {

    private String name;
    private String age;
    private String phone;

    public Subscribers(String phone, String name, String age) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public void handleEvent(List<String> messages) {

        for (String message: messages) {
            System.out.println(message);
        }
    }
}