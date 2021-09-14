/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tiffany Thani
 */



import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        String  inputstring;
        Scanner scan = new Scanner (System.in);
        System.out.print("What is the input string?");
        inputstring = scan.next();
        inputstring.length();

        int number = inputstring.length();



        System.out.print(inputstring);
        System.out.print(" has ");
        System.out.print(+number);
        System.out.print(" characters");

    }

}
