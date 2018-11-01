package logInApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here// menu \n1. sign up
//        System.out.println("please select from the option: \n1. Sign up \n2. Add new role " +
//                "\n3. Add role to a user \n4. sign in ");
        ArrayList<User>allUsers = new ArrayList<>();
        ArrayList<Role>allRoles = new ArrayList<>();

        Scanner keyboard = new Scanner(System.in);
        int choice=0;

     do {
         System.out.println("please select from the option: \n1. Sign up \n2. Add new role " +
                 "\n3. Add role to a user \n4. sign in ");

         switch (choice) {
             case 1:
                 User user = new User();
                 System.out.println("SignUp");
                 System.out.println("Enter the user id");
                 long id =keyboard.nextLong();
                 keyboard.nextLine();
                 System.out.println("Enter the user name");
                 String name =keyboard.nextLine();
                 System.out.println("Enter password");
                 String password =keyboard.nextLine();
                 String  newRole ="";

              do{
                  System.out.println("Do you want to add  role ? yesOrNo");
                  newRole = keyboard.nextLine();
                  if(newRole.equalsIgnoreCase("yes")){
                      System.out.println("Enter Role Id");
                      long newRoleId = keyboard.nextLong();
                      keyboard.nextLine();
                      System.out.println("Enter Role Name");
                      String newRoleName = keyboard.nextLine();
                      Role newRoleFound = checkRoleName(newRoleName,newRoleId,allRoles);


//                      if (newRoleFound.getName().equalsIgnoreCase(null))
//                      {
//                          System.out.println("null is not found in allRoles List");
//                      }
//                      else
//                      {
//                          if (!user.getRole().contains(newRoleFound.getName()))
//                          {
//                              user.getRole().add(newRoleFound);
//                              System.out.println(newRoleFound.getName()+ "..."+newRoleFound.getId());
//                              //  break;
//                          }else
//                          {
//                              System.out.println(newRoleFound.getName()+"is already in the user rol list");
//                              // break;
//                          }}
                  }
                  //System.out.println("Do you want to add  role ? yesOrNo");

              }while (newRole.equalsIgnoreCase("yes"));


                 allUsers.add(user);

                 break;
             case 2:
                 System.out.println("Add new role");
                 System.out.println();
                 break;
             case 3:
                 System.out.println("Add role to a user");
                 System.out.println();
                 break;
             case 4:
                 System.out.println("sign in");
                 System.out.println();
                 break;
             case 5:
                 System.out.println("quit");
                 break;
                 default:
                     System.out.println("Sorry, it is wrong option");
         }
         choice = keyboard.nextInt();
         keyboard.nextLine();
     }while(choice!=5);
    }

    private static Role checkRoleName(String newRoleName, long newRoleId, ArrayList<Role> allRoles) {
        Role roleFound = null;
        for(Role eachRole:allRoles){
            if(eachRole.getName().contains(newRoleName)){
                roleFound = eachRole;
                break;

            }
        }
        return  roleFound;
    }
}
