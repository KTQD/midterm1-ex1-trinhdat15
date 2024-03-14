import java.lang.Override;
public class Book extends Item {
    private String author;
    private int numberOfPages;
    private String genre;
    public Book(String name, String description, String ID, float price, String author, int numberOfPages, String genre ) {
        super(name, description, ID, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }

    @Override
    public void showInfo() {
        System.out.println("Ten vat pham la: "+name);
        System.out.println("Mo ta vat pham: "+description);
        System.out.println("ID vat pham: "+ID);
        System.out.println("Gia vat pham la: "+price);
        System.out.println("Ten tac gia la: "+author);
        System.out.println("So trang la: "+numberOfPages);
        System.out.println("Loai tac pham la: "+genre);
    }
}

