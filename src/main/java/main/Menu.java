package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import manager.Manager;
import validate.Validation;

public class Menu {
    
     
    private static String[] ops = {
       "Calculate Superlative Equation",
       "Calculate Quadratic Equation",
        "Exit"
    };
    private static int getChoice(){
      Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ops.length;  i++) {
            System.out.println((i+1)+ ". " +ops[i]);
        }
         return Validation.getInt("Your Choice:  ",1, ops.length);
    }
    public static void display(){
        Manager m = new Manager();
        int choice;
       
        do{
            System.out.println("========================Worker Management========================");
            choice = getChoice();
            switch(choice){
                case 1:
                     System.out.println("------------------------Add Worker------------------------");
                    m.superLative();
                    break;
                case 2:
                    System.out.println("------------------------Up/Down Salary------------------------");
             
                     break;
                case 3:
                   
                     break;
              
            }
        }
        while(choice != 3);
    
    }
}