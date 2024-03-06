import java.io.FileWriter;
import java.io.IOException;


public class Library {
   public String title;
   public String author;
    public String genre;
    public String Isbn;
    public int publicationyear;
    public int pagenumber;
    public String language;
    public String publisher;
    public Library(String title, String author, String genre) {
        this.publicationyear = publicationyear;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pagenumber = pagenumber;
        this.Isbn = Isbn;
        this.language = language;
        this.publisher=publisher;
    }
    public void addBook(AudioBook book) {
        books.add(book);
    }

    public void saveBooksToFile(String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);

        for (Book book : books) {
            writer.write(book.toString());
            writer.write("\n");
        }

        writer.close();
    }}