package Domash3;

public class WallEnty {
    private String zapis;
    private Comments[] koment =  new Comments[100];

    public WallEnty() {
    }

    public WallEnty(String zapis) {
        this.zapis = zapis;
    }

    public String getZapis() {
        return zapis;
    }

    public void setZapis(String zapis) {
        this.zapis = zapis;
    }

    public Comments[] getComments() {
        return koment;
    }

    public void setComment(Comments comments) {
        int c = 0;
        for (int i = 0; i < this.koment.length; i++) {
            if(this.koment[i] == null){
                this.koment[i] = comments;
                c = i;
                break;
            }
            }if (c == this.koment.length - 1){
            System.out.println("net");

        }

    }public void laiki(){
        for (int i = 0; i < this.koment.length; i++) {


        }
    }
}
