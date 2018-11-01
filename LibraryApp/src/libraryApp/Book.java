package libraryApp;

public class Book {
    private String title;
    private String auther;
    private String year;
    private int books;

  Book(String person, String name){
        person = "Introdcution to Geometry";
        name = "Elis";
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void addBook(String title, String autho, int year, int numBook){
        books+=numBook;
    }
}
