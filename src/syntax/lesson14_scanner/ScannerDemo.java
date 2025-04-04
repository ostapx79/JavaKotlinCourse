package syntax.lesson14_scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        var name = scanner.nextLine().trim();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello, my name is " + name + "! I am " + age + " years old.");

        scanner.close();
    }
}
