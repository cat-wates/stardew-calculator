package uk.co.stardewcalculator;

import java.util.Scanner;

public class Player {

    public double farmingLevel;
    public int fertilizerLevel = 0;
    public boolean isTiller = false; //level 5
    public boolean isAgriculturist = false; //level 10
    public int balance;

    public Player(double farmingLevel, int balance) {
        this.farmingLevel = farmingLevel;
        this.balance = balance;
    }

    public void defineProfessions(double farmingLevel) {
        Scanner sc = new Scanner(System.in);
        if (farmingLevel > 4) {
            System.out.println("Have you chosen the tiller profession? ");
            if (sc.nextLine().equalsIgnoreCase("y")) {
                isTiller = true;
            } else {
                isTiller = false;
            }
        }
        if (farmingLevel == 10) {
            System.out.println("Have you chosen the agriculturist profession? ");
            if (sc.nextLine().equalsIgnoreCase("y")) {
                isAgriculturist = true;
            } else {
                isAgriculturist = false;
            }
        }
    }


}
