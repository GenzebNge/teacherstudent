package libraryApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner userInput = new Scanner(System.in);
    static  Book book = new Book("Elisa", "Goodby");
    static ArrayList<Book> myBookList = new ArrayList<>();

public static void addBook(String title, String auther, String year){
    System.out.println("Do you want to add book ");
    String addNewBook = userInput.next();
    if (addNewBook.equalsIgnoreCase("yes")){
        System.out.println("Enter the book title, auther, and year of puplication");
        String bookTitle = userInput.nextLine();
        book.setTitle(bookTitle);

        String  bookAuther = userInput.next();

        book.setTitle("");
    }
}
    public static void main(String[] args) {
        // write your code here

        System.out.println("Do you want to add book ");
        String addNewBook = userInput.next();
        if (addNewBook.equalsIgnoreCase("yes")) {
            System.out.println("Enter the nooke title ");
            String bookTitle = userInput.nextLine();
            book.setTitle(bookTitle);
            userInput.nextLine();
            System.out.println("Enter the auther name");
        }




    }
}
