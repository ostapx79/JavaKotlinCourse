package syntax.lesson6_typeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        byte byteNumber = 127;
        short varForCasting = byteNumber;
        System.out.println("After casting varForCasting: " + varForCasting);

        int intNewVar = varForCasting;
        System.out.println("After casting intNewVar: " + intNewVar);
        int varVariable = 6_000_012;
        byte byteNewVar = (byte) varVariable;
        System.out.println("After casting byteNewVar: " + byteNewVar);

        var doubleVar = 4.18;
        int newInt = (int) doubleVar;
        System.out.println("After casting newInt: " + newInt);
    }
}
