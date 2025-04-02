package syntax.lesson10_string;

public class StringBasic {
    public static void main(String[] args) {
        String strName = "Konstantin Galus ";
        String strLastName = new String("Konstantin Galus");
        String concatStr = strName.concat(strLastName);
        System.out.println(concatStr);
        System.out.println(strName + " " + strLastName);

        System.out.println(concatStr == strName + " " + strLastName);
        System.out.println(concatStr.equals(strName + " " + strLastName));

        String firstStr = "java";
        var secondStr = "java";
        System.out.println("Is two strings equals: " + firstStr.equals(secondStr));

        String thirdStr = "Java";
        var fourthStr = "java";
        System.out.println("Is two strings equals: " + thirdStr.equals(fourthStr));
        System.out.println("Is two strings equals(ignoreCase): " + thirdStr.equalsIgnoreCase(fourthStr));

        // длина строки
        System.out.println("The length of strName: " + strName.length());

        // получения подстроки
        var greeting = "Hello, World!";
        var sbustring = greeting.substring(greeting.indexOf("W"), greeting.indexOf("!"));
        System.out.println(sbustring);

        System.out.println("The string contains \"World\": " + greeting.contains("World"));
        var greetingWithUpperCase = greeting.toUpperCase();
        System.out.println(greetingWithUpperCase);
        System.out.println("The string contains \"World\": " + greetingWithUpperCase.contains("WORLD"));

        // trim() убираем пробелы
        var login = "   Konstantin_Galus   ";
        var loginAfterTrim = login.trim();
        System.out.println(loginAfterTrim);

        // replace
        var loginAfterReplace = login.trim().replaceAll("_", ".");
        System.out.println(loginAfterReplace);


        StringBuilder stringBuilder = new StringBuilder("Hello, ");
        stringBuilder.append("Konstantin_G");
        stringBuilder.append(", ");
        stringBuilder.append("Galus");
        System.out.println(stringBuilder);
    }

}
