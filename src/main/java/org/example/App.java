package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christian Williams
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the input string? ");
        String inputS = input.nextLine();
        int length = inputS.length();

        System.out.println(inputS + " has " + length + " characters.");
    }
}
