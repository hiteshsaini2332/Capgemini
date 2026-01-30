package linearsearch;

public class FirstNegativeNumber {
    public static int findNegative(int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                return i;
            }
        }
        return -1;
    }
    static void main() {
        int [] arr={1,2,5,6,3,4};
        int ans=findNegative(arr);
        if(ans==-1) System.out.println("No Negative Element is present");
        else System.out.println("Negative Element found at index: "+ans);
    }
}
