package sorting;

public class SortExamScores {
    public static void selectionSort(int[]arr,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    static void main() {
        int[] arr={7,1,9,5,3};
        selectionSort(arr,5);
        for (int n:arr)
        {
            System.out.println(n);
        }
    }
}
