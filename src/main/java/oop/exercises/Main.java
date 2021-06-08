package oop.exercises;
import java.util.Scanner;
import java.util.Calendar;
/*
 * UCF cop3330 Summer 2021 Assignment 1 solutions
 * Copyright 2021 Keondez Robinson
 */

public class Main
{
    public static void main(String[] args)
    {
        int currentAge, retireAge, ageDiff, retireYear, currentYear;
        Scanner input;
        Calendar calendar = Calendar.getInstance();
        currentYear = calendar.get(Calendar.YEAR);

        input = new Scanner(System.in);

        System.out.print("What is your current age? ");
        currentAge = input.nextInt();
        System.out.print("At what age would you like to retire? ");
        retireAge = input.nextInt();

        ageDiff = retireAge - currentAge;
        retireYear = ( currentYear + ageDiff );
        System.out.println("You have " + ageDiff + " Years left until you can retire.");

        System.out.println("It's " + currentYear + ", " + "so you can retire in " + retireYear + "." );




    }
}
