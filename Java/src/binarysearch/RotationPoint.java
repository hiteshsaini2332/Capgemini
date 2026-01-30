package binarysearch;

public class RotationPoint {
    public static int findPoint(int []arr)
    {
        int s=0;
        int e=arr.length-1;

        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]<arr[s])
            {
                s=mid;
            }
            else{
                e=mid-1;
            }
        }
        return arr[s];
    }
    static void main() {
        int[] arr={7,6,5,4,2,3};
        System.out.println(findPoint(arr));
    }
}
