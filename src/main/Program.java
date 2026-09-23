package main;

import java.util.Scanner;

public class Program {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Lap lap = new Lap("P", "Ász");

        System.out.println(lap.megj());
        System.out.println(lap.getSzin());
        System.out.println(lap.getErtek());
    }
}
