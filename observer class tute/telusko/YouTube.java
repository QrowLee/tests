package telusko;

public class YouTube {

    public static void main(String[] args){
        Channel telusko = new Channel();
        Subscriber s1 = new Subscriber("me");
        Subscriber s2 = new Subscriber("mi");
        Subscriber s13= new Subscriber("mo");

        telusko.subscribe(s13);

        s13.subscribeChannel(telusko);

        telusko.upload("hello world");

    }
    
}
