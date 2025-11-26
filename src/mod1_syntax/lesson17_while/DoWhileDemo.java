package mod1_syntax.lesson17_while;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {

        var count = 0;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age >= 18) {
                System.out.println("You are an adult.");
            } else if (age >= 13) {
                System.out.println("You are an teenager.");
            } else {
                System.out.println("You are an infant.");
            }
            count++;
        } while (count < 4);

        System.out.println("Exit from while-cycle");

        scanner.close();
    }
}
