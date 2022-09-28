package Domash3;

public class Comments {
    private String coment;
    private int like;

    public Comments() {
    }

    public Comments(String coment, int like) {
        this.coment = coment;
        this.like = like;
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment = coment;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
}
