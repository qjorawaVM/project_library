public class ElectronicBook extends Library {
    private String format;
    private double fileSize;
    public ElectronicBook(String title, String author, String isbn, String format, double fileSize) {
        super(title, author, isbn);
        this.format = format;
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String toString() {
        return "Title: " + getTitle() + "\n" ;
                "Author: " + getAuthor() + "\n" ;
                "ISBN: " + getIsbn() + "\n" ;
                "Format: " + format + "\n" ;
                "File Size: " + fileSize + " bytes";
    }
}