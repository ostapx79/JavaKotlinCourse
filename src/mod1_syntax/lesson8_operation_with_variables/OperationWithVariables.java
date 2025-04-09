package mod1_syntax.lesson8_operation_with_variables;

public class OperationWithVariables {
    public static void main(String[] args) {
        int a = 4, b = 5;
        b = a;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int division = a / b;
        int remainder = a % b;

//        a = a + 1;
        a++; // инкремент
        a--; // декремент

        a += 4;
        b -= 2;
        a *= 4;
        b /= 3;

        // Операций сравнения
        boolean isEqual = a == b;
        boolean isNotEqual = a != b;
        boolean isGreater = a > b;
        boolean isGreaterOrEqual = a >= b;
        boolean isLess = a < b;
        boolean isLessOrEqual = b <= a;

    }
}
