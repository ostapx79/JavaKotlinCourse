package mod4_exception.lesson47_try_catch;

public class ExceptionDemo {
    public static void main(String[] args) {

        int zero = 1;
        try {
            System.out.println("15/zero=" + 15 / zero);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("The of try-catch block");
        }

        System.out.println("The end of program!");

    }
}
