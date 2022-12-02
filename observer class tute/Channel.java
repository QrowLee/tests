public interface Channel {
    public void update(Object o);

    NewsAgency observable = new NewsAgency();
    NewsChannel observer = new NewsChannel();

    observable.addObserver(observer);
    observable.setNews("news");
    assertEquals(observer.getNews(), "news");
}