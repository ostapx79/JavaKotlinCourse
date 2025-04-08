package syntax.lesson22_switch_when;

public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println(getWinner(33, 52, 74, 23));

        System.out.println("The house " +
                WhenDemoKt.getWinner(
                        323, 323, 222, 83
                ) + " is Winner!");
    }

    public static String getWinner(
            int gryffindorPoints, int slytherinPoints, int ravenclawPoints, int hufflepuffPoints
    ) {
        final int first = gryffindorPoints;
        final Integer second = slytherinPoints;
        final Integer third = ravenclawPoints;
        final Integer fourth = hufflepuffPoints;

        final int maxPints = Math.max(Math.max(Math.max(gryffindorPoints, slytherinPoints), ravenclawPoints), hufflepuffPoints);

//        return switch (maxPints) {
//            case gryffindorPoints -> "Gryffindor";
//            case slytherinPoints -> "Slytherin";
//            case ravenclawPoints -> "Ravenclaw";
//            default -> "Hufflepuff";
//        };
        return "";
    }
}
