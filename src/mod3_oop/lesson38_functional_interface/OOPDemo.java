package mod3_oop.lesson38_functional_interface;

public class OOPDemo {
    public static void main(String[] args) {
        // with classes which implements Greeting interface
//        Greeting englishGreeting = new EnglishGreeting();
//        englishGreeting.sayHello();
//
//        Greeting frenchGreeting = new FrenchGreeting();
//        frenchGreeting.sayHello();

        Greeting englishGreeting = name -> System.out.println("Hello, " + name + "!");
        englishGreeting.sayHello("Kostya");

        new Greeting() {
            @Override
            public void sayHello(String name) {
                System.out.println("Привет " + name + "!");
            }
        }.sayHello("Костя");

        Greeting frenchGreeting = name -> System.out.println("Bonjour, " + name + "!");
        frenchGreeting.sayHello("Tolya");
    }
}
