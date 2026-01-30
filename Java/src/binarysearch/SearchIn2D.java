package binarysearch;

public class SearchIn2D {
    public static boolean search(int [][]arr, int target)
    {
        int rows=arr.length;
        int cols=arr[0].length;
        int s=0;
        int e=rows*cols-1;

        while(s<=e)
        {
            int mid=s+(e-s)/2;
            int row=mid/cols;
            int col=mid%cols;
            if(arr[row][col]==target)
            {
                return true;
            }
            else if(arr[row][col]<target)
            {
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return false;
    }

    static void main() {
        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        if(search(arr,0)) System.out.println("Target Found");
        else System.out.println("Target Not Found");
    }
}
