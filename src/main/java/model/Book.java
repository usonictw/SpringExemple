package model;


public class Book {

    private int id;
    private String booksTitle;
    private String booksAuthor;
    private double bookprice;

    public Book() {
    }

    public Book(int id, String booksTitle, String booksAuthor, double bookprice) {
        this.id = id;
        this.booksTitle = booksTitle;
        this.booksAuthor = booksAuthor;
        this.bookprice = bookprice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBooksTitle() {
        return booksTitle;
    }

    public void setBooksTitle(String booksTitle) {
        this.booksTitle = booksTitle;
    }

    public String getBooksAuthor() {
        return booksAuthor;
    }

    public void setBooksAuthor(String booksAuthor) {
        this.booksAuthor = booksAuthor;
    }

    public double getBookprice() {
        return bookprice;
    }

    public void setBookprice(double bookprice) {
        this.bookprice = bookprice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (Double.compare(book.bookprice, bookprice) != 0) return false;
        if (!booksTitle.equals(book.booksTitle)) return false;
        return booksAuthor.equals(book.booksAuthor);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = booksTitle.hashCode();
        result = 31 * result + booksAuthor.hashCode();
        temp = Double.doubleToLongBits(bookprice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", booksTitle='" + booksTitle + '\'' +
                ", booksAuthor='" + booksAuthor + '\'' +
                ", bookprice=" + bookprice +
                '}';
    }
}
