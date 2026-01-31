package sorting;

public class SortStudentAges {
    public static void countingSort(int []arr,int n)
    {
        int []freq=new int[9];
        for(int i=0;i<n;i++)
        {
            freq[arr[i]-10]++;
        }

        int idx=0;
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                arr[idx++] = i + 10;
                freq[i]--;
            }
        }
    }
    static void main() {
        int []arr={16,15,13,15,18,11};
        countingSort(arr,6);
        for(int n:arr)
        {
            System.out.println(n);
        }
    }
}
