public class Vedio {
    private int vedioId;
    private String title;
    private int views,likes,totalvedio;
    public void setVedioId(int vId) {
        vedioId = vId;
    }
    public void setTitle(String t) {
        title = t;
    }
    public void setViews(int v) {
        views = v;
    }
    public void setLikes(int l) {
        likes = l;
    }
    public void setTotalvedio(int totalvedio) {
        this.totalvedio = totalvedio;
    }
    public int getVedioId() {
        return vedioId;
    }
    public String getTitle() {
        return title;
    }
    public int getViews() {
        return views;
    }
    public int getLikes() {
        return likes;
    }
    public int getTotalvedio() {
        return totalvedio;
    }
    public static void main(String[] args) {
        Vedio s1 = new Vedio();
        s1.setVedioId(1);
        s1.setTitle("Man mail");
        s1.setLikes(3000);
        System.out.println(s1.getTitle());
    }
}
