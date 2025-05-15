package mod3_oop.lesson41_inner_class;

public class InnerDemo {
    public static void main(String[] args) {
        var outerClass = new OuterClass();
        outerClass.outerMethod();

//         OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        var innerClass = outerClass.new InnerClass();
//        var innerClass = new OuterClass().new InnerClass();
        innerClass.innerMethod();

        var husband = new Husband();
        Husband.Wife wife;
        wife = husband.new Wife();
    }
}
