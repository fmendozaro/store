package com.store;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by Fer on 5/13/2017.
 */
public class Store {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        String menuChoice = "y", receipt = "";
        double total = 0, subtotal = 0;
        int qty;

        out.println("Welcome to the Pinnacles Store");

        while(menuChoice.equalsIgnoreCase("y")){

            showMenu(out);
            switch (getMenuOption(in, out)){
                case 1:
                    receipt += askItem();
                    subtotal += askPrice();
                    qty = askQty();
                    total += qty * subtotal;
                    break;
                case 2:
                    printReceipt();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Adios amigo!");
            }

            out.println("Continue? (y/n)");
            menuChoice = in.nextLine();
        }

    }

    public static void showMenu(PrintStream out){
        out.println("Please select an option:");
        out.println("1) Sale");
        out.println("2) Print receipt");
        out.println("3) Exit");
    }

    public static int getMenuOption(Scanner in, PrintStream out){
        int option = in.nextInt();
        in.nextLine();
        return option;
    }


}
