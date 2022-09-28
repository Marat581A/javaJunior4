package lesson15;

public class Obzor {
    private String text;
    private String strurl;

    public Obzor() {
    }

    public Obzor(String text, String strurl) {
        this.text = text;
        this.strurl = strurl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStrurl() {
        return strurl;
    }

    public void setStrurl(String strurl) {
        this.strurl = strurl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Obzor obzor = (Obzor) o;

        if (text != null ? !text.equals(obzor.text) : obzor.text != null) return false;
        return strurl != null ? strurl.equals(obzor.strurl) : obzor.strurl == null;
    }

    @Override
    public int hashCode() {
        int result = text != null ? text.hashCode() : 0;
        result = 31 * result + (strurl != null ? strurl.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Obzor{" +
                "text='" + text + '\'' +
                ", strurl='" + strurl + '\'' +
                '}';
    }
}
