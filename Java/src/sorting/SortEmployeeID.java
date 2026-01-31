package sorting;

public class SortEmployeeID {
    public static void insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            // Shift elements greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    static void main() {
        int[]arr={105, 102, 110, 101, 108};
        insertionSort(arr);
        for(int n:arr)
            System.out.println(n);
    }
}
