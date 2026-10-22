package mod4_exception.lesson48_main_exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        int zero = 1;
        String str = "Hello, World!";

        try {
            System.out.println("15/zero=" + 15 / zero);
            System.out.println("The length of string is " + str.length());
            int[] arr = {4, 8, 15};
//            int elem = arr[15];
            int num = Integer.parseInt(str);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println("The str is null." + e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } finally {
            System.out.println("The end of try-catch block");
        }

        System.out.println("The end of program!");
    }
}
