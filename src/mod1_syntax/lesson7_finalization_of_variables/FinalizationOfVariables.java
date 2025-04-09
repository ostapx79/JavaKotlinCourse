package mod1_syntax.lesson7_finalization_of_variables;

public class FinalizationOfVariables {
    public static void main(String[] args) {
        final int firstInt = 4;
        final int secondInt = 5;
//        secondInt = firstInt + secondInt;
        System.out.println("firstInt: " + firstInt + ", secondInt: " + secondInt);

        final var nameOfBoss = "Konstantin Galus";
//        nameOfBoss = "Anatoli Galus";
        System.out.println("nameOfBoss: " + nameOfBoss);
    }
}
