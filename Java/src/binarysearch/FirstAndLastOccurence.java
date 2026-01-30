package binarysearch;

public class FirstAndLastOccurence {
    public static int firstOccurence(int []arr,int target)
    {
        int s=0;
        int e=arr.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==target)
            {
                e=mid-1;
            }
            else if(arr[mid]<target)
            {
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return s;
    }
    public static int lastOccurence(int []arr,int target)
    {
        int s=0;
        int e=arr.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==target)
            {
                s=mid+1;
            }
            else if(arr[mid]<target)
            {
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return e;
    }

    static void main() {
//                 0 1 2 3 4 5 6 7 8 9
        int[] arr={1,1,1,2,2,2,2,2,3,3};
        int first=firstOccurence(arr,2);
        int last=lastOccurence(arr,2);
        System.out.println("First Occurence at Index: "+first);
        System.out.println("Last Occurence at Index: "+last);
    }
}
