package mod3_oop.lesson41_inner_class;

public class OuterClass {
    private int outerField;

    public void outerMethod() {
        System.out.println("Outer method");
    }

    public class InnerClass {
        private int innerField;

        public void innerMethod() {
            outerField = 100;
            System.out.println("Inner method, outerField = " + outerField);
            outerMethod();
        }
    }
}
