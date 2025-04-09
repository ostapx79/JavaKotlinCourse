package mod1_syntax.lesson19_fun;

public class FunDemo {
    public static void main(String[] args) {
        System.out.println("The sum of numbers 15 and 35 is " + sumOfTwoNumbers(15, 35));
        System.out.println("The sum of numbers 37 and 23 is " + sumOfTwoNumbers(37, 23));
        System.out.println("The sum of numbers 5 and 35 is " + sumOfTwoNumbers(5, 35));
    }

    private static long sumOfTwoNumbers(int a, int b) {
        return a + b;
    }
}
