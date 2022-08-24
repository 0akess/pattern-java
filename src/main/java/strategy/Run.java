package strategy;

import org.junit.jupiter.api.Test;
import strategy.names.Danya;
import strategy.names.Jon;
import strategy.names.Victor;

public class Run {

    @Test
    public void greetingDanya() {
        new AnyPrograms().greeting(new Danya());
    }

    @Test
    public void greetingJon() {
        new AnyPrograms().greeting(new Jon());
    }

    @Test
    public void greetingVictor() {
        new AnyPrograms().greeting(new Victor());
    }
}
