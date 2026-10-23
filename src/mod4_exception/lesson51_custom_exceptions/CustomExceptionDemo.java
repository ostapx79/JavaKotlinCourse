package mod4_exception.lesson51_custom_exceptions;

public class CustomExceptionDemo {
    public static void main(String[] args) {
//        var student1 = Student.getInstance("Kostya");

//        if (student1.getCourse() < 1)
//            throw new CourseIsNotValidException("Course must be grater or equal 1");

        try {
            var student2 = Student.getInstance("Kostya");
            if (student2.getCourse() < 1)
                throw new CourseIsNotValidException("Course must be grater or equal 1");
        } catch (CourseIsNotValidException e) {
            System.out.println(e);
        }
    }
}
