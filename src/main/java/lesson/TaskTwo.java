package lesson;

public class TaskTwo {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = {1, 5, 7, 8, 5, 7, 4, 56, 9};
            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
