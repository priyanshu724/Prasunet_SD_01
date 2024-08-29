package PrasunetInternship;

import java.util.Scanner;

/* Create a Guessing Game */
public class Task2 {
    public static void main(String[] args) {
        int min =1;
        int max = 100;
    int userguess=0;
    int numOfAttempts =0;
    int numToGuess = (int) (Math.random()*(max - min + 1 ) +min) ;
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");
        Scanner input = new Scanner(System.in);
        while(userguess != numToGuess){
            userguess = input.nextInt();
            numOfAttempts++;

            if(userguess > numToGuess){
                System.out.println("Its too high!");
            } else if (userguess < numToGuess) {
                System.out.println("Its Too Low!");
            }else {
                System.out.println("Congratulations! You've guessed the number!");
                System.out.println("It took you " + numOfAttempts + " attempts to guess the number.");
            }
        }



    }
}
