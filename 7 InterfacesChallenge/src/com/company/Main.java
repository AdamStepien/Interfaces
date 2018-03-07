package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Samochod mojSamochod = new Samochod("x", "y", "z");
	    ArrayList<String> tablica;
	    tablica = mojSamochod.write();
        System.out.println("=========================");
        for (int i = 0; i<tablica.size(); i++) {
            System.out.println(tablica.get(i));
        }
        System.out.println("=========================");
        System.out.println(mojSamochod.toString());
        mojSamochod.read(readValues());
        System.out.println("=========================");
        System.out.println(mojSamochod.toString());

    }




    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
