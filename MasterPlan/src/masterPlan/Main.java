package masterPlan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter the name");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        AbezerHouse.etv();
        AbezerHouse.sleep();
        MelakHouse.eat();
        MelakHouse.sleep();

        GenzebHouse Gb = new  GenzebHouse();
        Gb.etv();
        Gb.setName(name);
        System.out.println(Gb.getName());


    }
}
