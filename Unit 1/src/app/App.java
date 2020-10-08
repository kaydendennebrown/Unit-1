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
            System.out.println("Cheetahs are the only big cat that can turn midair.");
        }

        if (v > 5) {
            System.out.println("Not a valid number, please enter a number (1-5)");
        }

    }
}