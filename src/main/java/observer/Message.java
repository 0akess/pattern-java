package observer;

import java.time.Clock;
import java.util.*;

public class Message implements Observed {

    private List<String> messages = new LinkedList<>();
    private List<Observer> subscribers = new ArrayList<>();

    public void addMessage(String message) {
        messages.add(Clock.systemDefaultZone().instant()
                + "\n===============\n" + message + "\n");
        notifyObservers();
    }

    public void removeMassage(String message){
        messages.remove(message);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        for (Observer observer: subscribers) {
            observer.handleEvent(messages);
        }
    }
}
