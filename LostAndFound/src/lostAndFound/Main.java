package lostAndFound;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Item> myLyst = new ArrayList<Item>();
    static  Item items = new Item();
    static  Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        System.out.println("What do you want to do Add/Delete/List");

        String selected = sc.next();
        if (selected.equalsIgnoreCase("Add")){
            int itemId = sc.nextInt();
            add();

        }else if(selected.equalsIgnoreCase("Delete")){
            delete();
            sc.nextLine();
        }else if(selected.equalsIgnoreCase("List")){
            list();
            sc.nextLine();
        }
    }

    private static void add(int id, String name, String category) {
        System.out.println("Enter Item id : ");



    }

    private static void delete() {
        System.out.println("Enter item to delete ");
        String itemName = sc.next();

    }

    private static void list() {


        System.out.println(myLyst);
        String itemCategory = sc.next();
    }
}
