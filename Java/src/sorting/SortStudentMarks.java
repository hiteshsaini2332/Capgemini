package sorting;

public class SortStudentMarks {

    public static void bubbleSort(int[]arr,int n)
    {
        boolean swapped=false;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    static void main() {
        int[]arr={5,7,1,3,9};
        bubbleSort(arr,5);
        for (int n:arr)
        {
            System.out.println(n+" ");
        }
    }
}
