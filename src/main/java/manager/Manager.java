/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import validate.Validation;

/**
 *
 * @author vuatr
 */
public class Manager {
    private static Scanner sc = new Scanner(System.in);
     private static List<Integer> listodd = new ArrayList<>();
     private static List<Integer> listEven = new ArrayList<>();
    /**
     * @param 
     * @param 
     * @param 
     * @param 
     */
    
    public  void superLative(){
      double a = Validation.getDouble("Enter number A: ", Double.MIN_VALUE,  Double.MAX_VALUE);
      double b = Validation.getDouble("Enter number B: ", Double.MIN_VALUE,  Double.MAX_VALUE);
      double x = b/a;
       String formattedNumber = String.format("%.2f", x);
        System.out.println("Solution x: " + formattedNumber);
       double[] inputValue = {a,b,x};
        for (double d : inputValue) {
            Validation.checkEvenOdd(d);
            Validation.checkSquareNumber(d);
        }
       Validation.printResult();
       
    
    }
      public static void quadraticEquation() {
        double a = Validation.getDouble("Enter number A: ", Double.MIN_VALUE,  Double.MAX_VALUE);
       double b = Validation.getDouble("Enter number B: ", Double.MIN_VALUE,  Double.MAX_VALUE);
       double c = Validation.getDouble("Enter number C: ", Double.MIN_VALUE,  Double.MAX_VALUE);
        double delta = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        String formattedNumber = String.format("%.2f", x1);
        String formattedNumber2 = String.format("%.2f", x2);
        System.out.println("Solution x: " + formattedNumber);
      
        double[] inputValue = {a,b,x1,x2};
        for (double d : inputValue) {
            Validation.checkEvenOdd(d);
            Validation.checkSquareNumber(d);
        }
       Validation.printResult();
        
        
}
}
