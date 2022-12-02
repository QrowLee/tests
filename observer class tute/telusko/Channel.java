package telusko;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Channel implements Observable {
    List<Subscriber> subs = new ArrayList<>();
    String title;

    public void subscribe(Subscriber sub){
        subs.add(sub);
    }

    public void unsubscribe(Subscriber sub){
        subs.remove(sub);
    }

    public void notifySubscribers(){
        for(Subscriber sub : subs){
            sub.update();
        }
    }

    public void upload(String title){
        this.title = title;
        notifySubscribers();

    }
}
