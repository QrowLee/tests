import java.net.http.WebSocket.Listener;

import Listener;

public class ONewsChannel implements Listener {

    private String news;

    @Override
    public void update(Listener o, Object news) {
        this.setNews((String) news);
    }

    // standard getter and setter
}
