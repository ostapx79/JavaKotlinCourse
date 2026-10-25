package mod5_collections.list;

public class ListDemo {
    public static void main(String[] args) {

        // Arrays
        String[] arr = {"Kostya", "Max", "Tolya"};

        for (String name : arr) {
            System.out.println(name);
        }

        arr[2] = "Lena";

        for (String name : arr) {
            System.out.println(name);
        }
    }
}
