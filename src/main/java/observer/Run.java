package observer;

import org.junit.jupiter.api.Test;

public class Run {

    @Test
    public void run() {

        Observer sub1 = new Subscribers("123", "Po", "1");
        Observer sub2 = new Subscribers("345", "Jo", "2");
        Observer sub3 = new Subscribers("567", "Ro", "3");
        Observer sub4 = new Subscribers("789", "Ny", "4");

        Message message = new Message();
        message.addObserver(sub1);
        message.addObserver(sub2);
        message.addObserver(sub3);
        message.addObserver(sub4);

        message.addMessage("Первое сообщение");
        message.addMessage("Второе ссобщение");
        message.addMessage("Третье сообщение");
        message.addMessage("Четвертое сообщение");

        message.removeMassage("Второе ссобщение");

        message.removeObserver(sub2);
    }
}
