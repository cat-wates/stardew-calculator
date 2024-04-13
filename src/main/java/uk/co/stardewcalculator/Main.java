package uk.co.stardewcalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Stardew Valley profit calculator!");
        Scanner sc = new Scanner(System.in);
        System.out.print("How many seeds do you have? ");
        int seedCount = Integer.parseInt(sc.nextLine());
        System.out.println("Which crop? ");
        String cropType = sc.nextLine().toLowerCase();


    }
}