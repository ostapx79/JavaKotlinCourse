package mod3_oop.lesson45_reflection;

import java.lang.reflect.*;

public class OOPDemo {
    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {

        // Class
        Student studentKostya = new Student("Kostya");
        Class<? extends Student> studentClass = studentKostya.getClass();
        Class<?> studentClass1 = Student.class;

        Class<?> studentClass2 = Class.forName("mod3_oop.lesson45_reflection.Student");

        System.out.println(studentClass1.getName());

        // SuperClass
        Class<?> superClass = studentKostya.getClass().getSuperclass();

        // Modifier
        var accessModifier = Modifier.toString(studentClass.getModifiers());
        System.out.println(accessModifier);

        // Constructors[]
        Constructor<?>[] constructorsOfStudentClass = studentClass1.getDeclaredConstructors();
        for (Constructor<?> constructor : constructorsOfStudentClass) {
            System.out.println(constructor);
        }

        System.out.println();

        // Method[]
        Method[] methods = studentClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
//            System.out.println(method.getReturnType());
        }

        // Field[]
        Field[] fields = studentClass2.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        // example
        Class.forName("mod3_oop.lesson45_reflection.Student")
                .getMethod("sayHello")
                .invoke(studentKostya);
    }
}
