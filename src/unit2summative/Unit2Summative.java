/*
 * This project is a rock paper scissors game.
 * This game askes for user input and stores that in an array.
 * then the computer makes its disicion based on a random number bettween 1 and 3.
 * since there is no truly random numbers in computer generation, there is no way to become strategy 
 * risistant, so it is possible to to get the same sequence, but it is scarce.
 * there can be 2 outcomes win or loss per game at the end of the game 
 * it prints how many times each disicion was made by the computer and by the person
 * and weather they won or lost overall.
 */

package unit2summative;

import java.util.Scanner;
import java.util.Random;



/**
 *
 * @author joham3169
 */
public class Unit2Summative {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create Scanner obj
       Scanner UserInput = new Scanner(System.in);
        
        // generate random number
        Random rand = new Random(1);
        int RN = rand.nextInt(4);
        String RNG = String.valueOf(RN);
        
        
        
        
        // Ask for user input 
        System.out.println("Welcome to Rock, Paper, Scissors");
        System.out.println("");
        System.out.println("In This Game There are Three Options, Rock, Paper, and Scissors");
        System.out.println("");
        System.out.println("ps you Must Enter a Number, Hit Enter then Hit Enter Again");
        System.out.println("");
        System.out.println("Please Make Your First Choice, 1. Rock, 2. Paper or 3. Scissors");
        System.out.println(RN);
        System.out.println("");
        
        // parse scanner for array
        int RPS = Integer.parseInt(UserInput.nextLine()); 
        
        // creating array
        int input[] = new int[RPS];
        
        // storing user discion in an array
        for (int i = 0; i < input.length; i++)
        {
            input[i] = UserInput.nextInt();
        }
       
        // sorting user disicion
        if (input.equals("1") && RN == 2)
        {
        // All three Options For Rock
         
        
            System.out.println("You Chose Rock");
            System.out.println("The Computer Chose Paper");
            System.out.println("You Lost");
            System.out.println(RN);
            System.exit(0);
        
        }
        if (input.equals("1") && RN == 1) 
        {
            System.out.println("You Chose Rock");
            System.out.println("The Computer Chose Rock");
            System.out.println("Draw");
            System.out.println(RN);
            System.exit(0);
        }
        if (input.equals("1") && RN == 3)
        {
            System.out.println("You Chose Rock");
            System.out.println("The Computer Chose Scissors");
            System.out.println("Congratualations You Won");
            System.out.println(RN);
            System.exit(0);
        }
        // All Options For Paper
        if (input.equals("2") && RN == 1)
        {
            
            System.out.println("You Chose Paper");
            System.out.println("The Computer Chose Rock");
            System.out.println("ConGratulations You Won");
            System.out.println(RN);
            System.exit(0);
            
        }
         if (input.equals("2") && RN == 2)
        {
            
                System.out.println(RN);
            System.out.println("You Chose Paper");
            System.out.println("The Computer Chose Paper");
            System.out.println("Draw");
            System.exit(0);
            
        }
          if (input.equals("2") && RN == 3)
        {
           
            System.out.println("You Chose Paper");
            System.out.println("The Computer Chose Scissors");
            System.out.println("You Lost");
            System.exit(0);
            
        }
          // All Options for Scissors+
        if (input.equals("3") && RN == 1)
        {
           
            System.out.println("You Chose Scissors");
            System.out.println("The Computer Chose Rock");
            System.out.println("Sorry You Lost");
            System.exit(0);
            
        }
        if (input.equals("3") && RN == 2)
        {
           
            System.out.println("You Chose Scissors");
            System.out.println("The Computer Chose Paper");
            System.out.println("Congratulations You Won");
            System.exit(0);
            
        }
        if (input.equals("3") && RN == 3)
        {
            
            System.out.println("You Chose Scissors");
            System.out.println("The Computer Chose Scisssors");
            System.out.println("Draw");
            System.exit(0);
            
        }  
    }
}
