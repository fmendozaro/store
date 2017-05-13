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
        int qty, itemNo = 1;


        out.println("Welcome to the Pinnacles Store");

        while(menuChoice.equalsIgnoreCase("y")){

            showMenu(out);
            switch (getMenuOption(in, out)){
                case 1:
                    receipt += itemNo + ". " + askItem(in, out) + "\n";
                    subtotal += askPrice(in, out);
                    qty = askQty(in, out);
                    total += qty * subtotal;
                    break;
                case 2:
                    receipt += "\n Total: $" + String.format("%,.2f", total);
                    out.println(receipt);
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

    public static String askItem(Scanner in, PrintStream out){
        out.println("Which item you want to take?");
        return in.nextLine();
    }

    public static double askPrice(Scanner in, PrintStream out){
        return 0;
    }

    public static int askQty(Scanner in, PrintStream out){
        return 1;
    }


}
