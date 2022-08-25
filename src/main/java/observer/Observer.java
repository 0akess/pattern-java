package observer;

import java.util.HashMap;
import java.util.List;

public interface Observer {
    void handleEvent(List<String> messages);
}
