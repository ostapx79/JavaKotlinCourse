package mod1_syntax.lesson17_while;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var count = 0;

        while (count < 3) {
            int age = scanner.nextInt();

            if (age >= 18) {
                System.out.println("You are an adult.");
            } else if (age >= 13) {
                System.out.println("You are an teenager.");
            } else {
                System.out.println("You are an infant.");
            }
            count++;
        }
        System.out.println("Exit from while-cycle");
        // scanner.close();
    }
}
