package grocerapplication;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<ItemInfformation> allInformations = new ArrayList<>();
        String addItem = "";

        do{

              Scanner userInput = new Scanner(System.in);
              ItemInfformation itemInfo = new ItemInfformation();
              System.out.println("Enter the first item Name ");
              String itemName = userInput.nextLine();
              itemInfo.setName(itemName);

              System.out.println("Please enter first item price");
              String itemPrice = userInput.nextLine();
              itemInfo.setPrice(itemPrice);


              System.out.println("Enter first item quantity?");
              String itemQuantity = userInput.nextLine();
              itemInfo.setQuantity(itemQuantity);


//              int itemTotalPrice = (itemPrice*itemQuantity);
//             System.out.println("Enter first item totel price ");
//           //  String itemTotalPrice = userInput.nextLine();
//             itemInfo.setTotalCost(itemTotalPrice);

             System.out.printf("Item Name  %s, Item Price %s, Item quantity %S, total Price %s, \n", itemInfo.getName(), itemInfo.getPrice(), itemInfo.getQuantity(), itemInfo.getTotalCost());


                 System.out.println("Do you want to enter another item?");

                 addItem = userInput.nextLine();
                 allInformations.add(itemInfo);

            System.out.println("Item_Name" + "\t" + "\t" + "Price" + "\t" + "\t" + "Quantity" + "\t" + "Cost" );


        }while (addItem.equalsIgnoreCase("yes"));

                for (ItemInfformation newItem: allInformations){

                    System.out.println( newItem.getName() + " " + "\t" + "\t" + "\t" + newItem.getPrice() + " " + "\t" + "\t" + "\t" + newItem.getQuantity() + " " + "\t" + "\t" + "\t" + newItem.getTotalCost() + " " );
                }


    }
}
