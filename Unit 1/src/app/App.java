package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Cheetah facts, please input a number (1-5).");
        int v = input.nextInt();

        if (v == 1) {
            System.out.println("Cheetahs are the fastest land animal.");
        }

        if (v == 2) {
            System.out.println("The scientific name of cheetah is acinonyx jubatus.");
        }

        if (v == 3) {
            System.out.println("Cheetahs live 10-12 years.");
        }

        if (v == 4) {
            System.out.println("There are only 7,100 cheetahs left alive in the wild.");
        }

        if (v == 5) {
            System.out.println("Cheetahs are the only big cat that can turn mid-air.");
        }

        if (v > 5) {
            System.out.println("Not a valid number, please enter a number (1-5)");
        }

        for (int x = 1; x <= 1000; x = x + 1) {
            System.out.println(x);
        }

        String pass = "Pass123";
        String pass1 = input.nextLine();

        if (pass1.equals(pass)) {
            System.out.println("Password correct, the secret message is apple.");
        } else {
            System.out.println("Please enter password");
        }

        String pass12 = input.nextLine();

        if (pass12.equals(pass)) {
            System.out.println("Password correct, the secret message is apple.");
        } else {
            System.out.println("Password incorrect, 2 attempts remaining");
        }

        String pass2 = input.nextLine();

        if (pass2.equals(pass)) {
            System.out.println("Password correct, the secret message is apple.");
        } else {
            System.out.println("Password incorrect, 1 attempt remaining.");
        }

        String pass3 = input.nextLine();

        if (pass3.equals(pass)) {
            System.out.println("Password correct, the secret message is apple.");
        } else {
            System.out.println("Password incorrect, no attempts remaining.");
        }
        int r = 24;
        int n;
        System.out.println("Please guess a number 1-100.");
        do {

            n = input.nextInt();
            if (n < r) {
                System.out.println("Higher");
            } else {
                System.out.println("Lower");
            }
        } while (n != r);

        if (n == r)
            System.out.println("Correct");

int h = 0;
            System.out.println("Please eneter a number");
            int y = input.nextInt();

            System.out.println("Please enter a second number");
            int x = input.nextInt();

            for ( h = x % 2; h = y % 2; x++){
System.out.println();
            }


            

    }

}