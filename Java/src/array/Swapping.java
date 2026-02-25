package array;
public class Swapping {
    static void main() {
        int []arr={5,2,9,1,6};
        swap(arr);
        System.out.println("After swapping");
           for(int i=0;i<5;i++)
           {
               System.out.print(arr[i]+" ");
           }
    }
    static void swap(int[] arr)
    {
        for (int i=0;i<arr.length-1;i+=2)
        {
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
}
