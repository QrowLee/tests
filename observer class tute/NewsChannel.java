public class NewsChannel implements Channel {
    private String news;

    @Override
    public void update(Object news) {
        this.setNews(news);
    }

    private void setNews(Object news2) {
    } 

    // standard getter and setter
}
