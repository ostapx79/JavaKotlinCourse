package mod1_syntax.lesson9_logical_and_or;

public class LogicalAndOr {
    public static void main(String[] args) {
        int a = 10, b = 3;

        // операций сравнения
        boolean isEqual = a == b;
        boolean isNotEqual = a != b;
        boolean isGreater = a > b;
        boolean isGreaterOrEqual = a >= b;
        boolean isLess = a < b;
        boolean isLessOrEqual = a >= b;

        // And(&&) Or(||)
        boolean aIsGreaterThanB = a > b;
        System.out.println(aIsGreaterThanB);
        boolean aIsEqualToB = a == b;
        boolean logicalAND = aIsGreaterThanB && aIsEqualToB;
        boolean logicalOR = aIsGreaterThanB || aIsEqualToB;
        System.out.println("The result of expression: a > b AND a == b is " + logicalAND);
        System.out.println("The result of expression: a > b AND a == b is " + logicalOR);


    }
}
