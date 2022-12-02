package telusko;

public class Subscriber {
    private String name;
    private Channel channel =  new Channel();

    public Subscriber(String name){
        super();
        this.name = name;
    }

    public void update()
    {
        System.out.println("Video Uploaded" + name + channel.title);
    }

    public void subscribeChannel(Channel ch){
        channel = ch;
    }
}
