package game;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the 2021 guessing game. Enter your name to get Started. . .");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Welcome " + name);

        System.out.println("Can we get started?");
        String decision = scanner.next();
        if (decision.equals("Yes")) {
            System.out.println("Great, Lets get started!");
            System.out.println(". . . ");

            Random random = new Random();
            int generated = random.nextInt(20) + 1;
//            System.out.println(generated);
            System.out.println("Guess the number generated");
            Scanner guess = new Scanner(System.in);
            int ans = guess.nextInt();

            int triedTimes = 0;
            boolean hasWon = false;
            boolean shouldFinish = false;

            while (!shouldFinish) {
                triedTimes++;

                if (triedTimes < 5) {
                    if (generated == ans) {
                        hasWon = true;
                        shouldFinish = true;
                    } else if (ans > generated) {
                        System.out.println("Guess lower");
                        ans = scanner.nextInt();
                    } else {
                        System.out.println("Guess Higher");
                        ans = scanner.nextInt();
                    }
                }
                else {
                    shouldFinish = true;
                }
            }
            if (hasWon){
                System.out.println("Congratulations! you have guessed in your " + triedTimes + " guess");
            }
            else {
                System.out.println("Game Over!");
                System.out.println("The number was: " + generated);
            }
        } else {
            System.out.println("Bye");
        }
    }
}
