package mod1_syntax.lesson22_switch_when;

public class SwitchDemoJava {
    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 4;
        int num3 = 2;

        final int ZERO_NUMBER = 3;
        final int FIRST_NUMBER = 8;
        final int SECOND_NUMBER = 4;

        final int expression = Math.max(Math.max(ZERO_NUMBER, FIRST_NUMBER), SECOND_NUMBER);
//        String str
//        switch(expression) {
//            case ZERO_NUMBER -> str = "abc";
//            case FIRST_NUMBER -> str = "def";
//            case SECOND_NUMBER -> str = "ghi";
//            default -> str = "jkl";
//        }

        String str = switch (expression) {
            case ZERO_NUMBER -> "abc";
            case FIRST_NUMBER -> "def";
            case SECOND_NUMBER -> "ghi";
            default -> "jkl";
        };
        System.out.println(str);
    }
}
