package mod1_syntax.lesson5_variables;

public class Variables {
    public static void main(String[] args) {
        // Примитивные тип данных
        // byte bN = -128;
        // System.out.println(Integer.parseInt("0101001110", 2));
        byte byteNumber = 127;
        System.out.println("The byte number: " + byteNumber);

        short shortNumber = 32767;
        System.out.println("The short number: " + shortNumber);

        int intNumber = 42;
        System.out.println("The int number: " + intNumber);

        long longNumber = 4_294_967_295L;
        System.out.println("The long number: " + longNumber);

        float floatNumber = 3.14f;
        System.out.println("The float number: " + floatNumber);

        double doubleNumber = 3.14;
        System.out.println("The double number: " + doubleNumber);

        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.isNaN(0.0 / 0.0));

        char charSymbol = 'A';
        System.out.println("The char symbol: " + charSymbol);

        boolean boolVariable;
        boolVariable = true;
        boolVariable = false;
        System.out.println("The boolean variable: " + boolVariable);

        var variable = 10;
        System.out.println("The variable: " + variable);

        int firstNumber, secondNumber;
        firstNumber = 23;
        secondNumber = 32;
        System.out.println("The first number is: " + firstNumber);
        System.out.println("The second number is: " + secondNumber);


    }
}
