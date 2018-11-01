package grading;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.printf("Please enter the number ");
        Scanner scan = new Scanner(System.in);
        int ID = scan.nextInt();

        System.out.println("Enter Name");
        String Name =  scan.next();
        System.out.println("Please Test Scour ");
        int scour = scan.nextInt();

      //  int Scour[] = {34, 45, 46, 48, 48,49,40,42};
        int  grade = (scour*100)/50;

        int cout =0;

        if (grade<=59 && grade<=69)
        {
            System.out.println(" Student Id : \n " + ID + "\n Student Name " + Name + " Score " + scour + " Score in Percent " + grade);
            System.out.println("D");
        }else if (grade>=70 && grade<=79) {
            System.out.println("C");
        }else if (grade<=100 && grade>=90){
               System.out.println("A");
           }else if (grade<=90 && grade>= 80){
               System.out.println("B");
           }else if (grade<=60 && grade>70){
               System.out.println("C");
           }cout++;
        }


    }

