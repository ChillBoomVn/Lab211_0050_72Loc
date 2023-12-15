/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vuatr
 */
public class Validation {

    private static Scanner sc = new Scanner(System.in);
    private static List<Integer> list = new ArrayList<>();

    public static int getInt(String msg, int min, int max) {
        int n;
        while (true) {
            try {
                System.out.println(msg);
                n = Integer.parseInt(sc.nextLine());
                if (n >= min && n <= max) {
                    break;
                }
                throw new NumberFormatException();
            } catch (NumberFormatException ex) {
                System.err.println("Enter again ");
            }

        }
        return n;
    }

    public static double getDouble(String msg, double min, double max) {
        double n;
        while (true) {
            try {
                System.out.println(msg);
                n = Double.parseDouble(sc.nextLine());
                if (n >= min && n <= max) {
                    break;
                }
                throw new NumberFormatException();
            } catch (NumberFormatException ex) {
                System.err.println("Enter again ");
            }

        }
        return n;
    }
    //-----------------------------------------------------------//
    private static List<Double> listOdd = new ArrayList<>();
    private static List<Double> listEven = new ArrayList<>();
     private static List<Double> listSquare = new ArrayList<>();

    public static void checkEvenOdd(double n) {
        if (n % 2 == 0) {

            listEven.add(n);
        } else if (n % 2 == 1) {

            listOdd.add(n);
        }

    }

    public static void printResult() {
        // In ra danh sách số chẵn mà không có dấu ngoặc vuông
        if (listEven.isEmpty()) {
            System.out.println("Even Number: 0");
        } else {
            System.out.print("Even Number: ");
            printList(listEven);
        }

        if (listOdd.isEmpty()) {
            System.out.println("Odd Number: 0");
        } // In ra danh sách số lẻ mà không có dấu ngoặc vuông
        else {
            System.out.print("Odd Number: ");
            printList(listOdd);
        }
        if (listSquare.isEmpty()) {
            System.out.println("Square Number: 0");
        } // In ra danh sách số lẻ mà không có dấu ngoặc vuông
        else {
            System.out.print("Square Number: ");
            printList(listSquare);
        }
    }

    // Hàm in danh sách mà không có dấu ngoặc vuông
    private static void printList(List<Double> myList) {
        for (double number : myList) {
            System.out.print(number + " ");
        }
        System.out.println();  // Xuống dòng để ngăn cách với dòng tiếp theo
    }

    public static void checkSquareNumber(double n) {
        if ((int) Math.sqrt(n) * (int) Math.sqrt(n) == n) {
            listSquare.add(n);
        }
    }
    

}
