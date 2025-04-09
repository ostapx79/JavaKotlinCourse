package mod1_syntax.lesson21_practise;

public class Practise {
    public static void main(String[] args) {
        System.out.println("The winner is " +
                getWinner(300, 232, 322, 453) +
                ", for java!");

        System.out.println("The winner is " +
                PractiseKt.getWinner(332, 552, 234, 534) +
                ", for kotlin!");
    }

    private static String getWinner(int slytherinPoints, int ravenclawPoints, int hufflepuffPoints) {
        return getWinner(0, slytherinPoints, ravenclawPoints, hufflepuffPoints);
    }

    private static String getWinner(
            int gryffindorPoint,
            int slytherinPoints,
            int ravenclawPoints,
            int hufflepuffPoints) {

        if (
            gryffindorPoint > slytherinPoints
            && gryffindorPoint > ravenclawPoints
            && gryffindorPoint > hufflepuffPoints) {
            return "Gryffindor";
        } else if (
            slytherinPoints > ravenclawPoints
            && slytherinPoints > hufflepuffPoints
            && slytherinPoints > gryffindorPoint) {
            return "Slytherin";
        } else if (
            ravenclawPoints > gryffindorPoint
            && ravenclawPoints > slytherinPoints
            && ravenclawPoints > hufflepuffPoints) {
            return "Ravenclaw";
        } else {
            return "Hufflepuff";
        }
    }
}
