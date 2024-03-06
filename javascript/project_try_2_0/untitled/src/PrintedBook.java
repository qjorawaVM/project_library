public class PrintedBook extends Library {
    private String publicationDate;
    private String publisher;

    public PrintedBook(String title, String author, String isbn, String publicationDate, String publisher) {

        super(title, author, isbn);
        this.publicationDate = publicationDate;
        this.publisher = publisher;
    }
    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getPublisher() {
        return publisher;}}