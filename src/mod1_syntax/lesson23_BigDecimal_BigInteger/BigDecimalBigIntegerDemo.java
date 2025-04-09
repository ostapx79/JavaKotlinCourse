package mod1_syntax.lesson23_BigDecimal_BigInteger;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalBigIntegerDemo {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("9749973927163798479873.1497461083460387");
        BigDecimal bigDecimal1 = BigDecimal.valueOf(12345678997974224790.23947197371974);

        BigDecimal sum = bigDecimal.add(bigDecimal1);
        BigDecimal tax = sum.multiply(new BigDecimal("0.13"));
        System.out.println("Total salary: " + sum);
        System.out.println("Tax: " + tax);

        BigInteger bigInteger = new BigInteger("1234567890979743723413247398734271934798");
        BigInteger bigInteger1 = BigInteger.valueOf(979437659);
        BigInteger difference = bigInteger.subtract(bigInteger1);
        System.out.println("bigInteger - bigInteger1 = " + difference);
    }
}
