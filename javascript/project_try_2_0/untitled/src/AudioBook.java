public class AudioBook extends Library {
    private String narrator;
    private double length;

    public AudioBook(String title, String author, String isbn, String narrator, double length) {
        super(title, author, isbn);
        this.narrator = narrator;
        this.length = length;
    }
    public String getNarrator() {
        return narrator;
    }
    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public String toString() {
        return "Title: " + getTitle() + "\n" +
                "Author: " + getAuthor() + "\n" +
                "ISBN: " + getIsbn() + "\n" +
                "Narrator: " + narrator + "\n" +
                "Length: " + length + " hours";
    }
}