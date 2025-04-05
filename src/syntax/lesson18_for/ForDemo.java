package syntax.lesson18_for;

public class ForDemo {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("The sum of numbers from 0 to 10 i s: " + sum);
    }
}
