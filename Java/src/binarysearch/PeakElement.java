package binarysearch;

public class PeakElement {
    public static int findPeak(int[] arr)
    {
        int s=0;
        int e=arr.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[mid-1]&& arr[mid]>arr[mid+1])
            {
                return arr[mid];
            }
            else if(arr[mid]<arr[mid-1])
            {
                e=mid;
            }
            else s=mid+1;
        }
        return arr[s];
    }

    static void main() {
        int []arr={1,2,1,3,5,4};
        System.out.println(findPeak(arr));
    }
}
