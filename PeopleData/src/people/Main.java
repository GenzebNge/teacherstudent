package people;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<People> newPeoples = new ArrayList<>();
        String addNewPeople = "";


   do {
       People p = new People();
       System.out.println("Enter Persone name");
       Scanner userInpute = new Scanner(System.in);
       String nameEntered = userInpute.next();
       p.setName(nameEntered);
       userInpute.nextLine();

       System.out.println("Enter email");
       String enteredEmail = userInpute.next();
       p.setEmail(enteredEmail);
       userInpute.nextLine();

       System.out.println("Enter favourite colour");
       String favouriteColour = userInpute.next();
       p.setFavouriteColour(favouriteColour);
       userInpute.nextLine();

       System.out.println("Do you want to add other person");
       newPeoples.add(p);
       addNewPeople = userInpute.nextLine();


       System.out.println("Name" + "\t" + "\t" + "Email" + "\t" + "\t" + " Favourite Colour");

       }  while (addNewPeople.equalsIgnoreCase("yes"));

             for (People pop:newPeoples){
             System.out.println(pop.getName() + "\t" + pop.getEmail()+ "\t" + pop.getFavouriteColour());
     }
    }
}
