package exception;

public class ArrayOperation {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50}; // try changing this to null
        int index = 2;                       // try an invalid index like 10

        try {
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
