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
        String menuChoice = "y", receipt = "", item = "";
        double total = 0, price = 0;
        int qty, itemNo = 1;


        out.println("Welcome to the Pinnacles Store");

        while(menuChoice.equalsIgnoreCase("y")){

            showMenu(out);
            switch (getMenuOption(in, out)){
                case 1:
                    item = askItem(in, out);
                    price = askPrice(in, out);
                    qty = askQty(in, out);
                    receipt += "\n" + itemNo + ". " + qty + " x " + item + " " + currency(price);
                    total += qty * price;
                    itemNo++;
                    break;
                case 2:
                    out.println("\n****************");
                    out.println("\nThanks for your shopping at Fer-Mart");
                    out.println("Your items:");
                    out.println(receipt);
                    out.println("\n\nTotal: " + currency(total));
                    break;
                case 3:
                    System.out.println("Exiting");
                    System.exit(0);
                default:
                    System.out.println("invalid option");
            }

            out.println("Return to the main menu? (y/n)");
            menuChoice = in.nextLine();
        }

        System.out.println("Good bye amigou!");

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
        out.println("What's the price?");
        return in.nextDouble();
    }

    public static int askQty(Scanner in, PrintStream out){
        out.println("How many?");
        int qty = in.nextInt();
        in.nextLine();
        return qty;
    }

    public static String currency(double number){
        return "$" + String.format("%,.2f", number);
    }


}
