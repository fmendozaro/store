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
        String menuChoice = "y";

        out.println("Welcome to the Pinnacles Store");

        while(menuChoice.equalsIgnoreCase("y")){
            showMenu(out);
            out.println("Continue? (y/n)");
            menuChoice = in.nextLine();
        }



    }

    public static void showMenu(PrintStream out){
        out.println("Please select an option:");
        out.println("A) Sale");
        out.println("B) Print receipt");
        out.println("C) Exit");
    }
}
