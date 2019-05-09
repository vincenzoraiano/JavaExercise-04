package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Instanciate an object of type scanner
        Scanner myScanner=new Scanner(System.in);

        //Define a variable of type string for choice.
        String choice;
        //Define a variable of type double for retrive the average.
        double average =0;
        //Defining a variable of type z.
        double z=0;
        //Define a variable of type int .
        int y=0;

        do {
            System.out.println("Enter a number");
            //Storing the variable inside a vaue of type int.
            double x=myScanner.nextDouble();
            //Adding a value x to the z variable.
            z=z+x;
            //Asking for enter a number
            System.out.println("Would you like to put another number? y/n ");
            //Storing the answer inside the string variable.
            choice=myScanner.next();
            //Adding a value for eery iteration of the loop.
            y++;
        }while(choice.equals("y"));
        //Conditional statement
        if(choice.equals("n"));
        //Print the average
        average=z/y;
        //Print out the total of the average.
        System.out.println("YOur average is "+average);

    }
}
