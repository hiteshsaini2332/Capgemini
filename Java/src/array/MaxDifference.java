package array;

public class MaxDifference {
    static void main() {
        int[] arr={2,7,3,1,9};
        int maxDiff=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int diff=Math.abs(arr[i]-arr[j]);
                if(diff>maxDiff)
                maxDiff=diff;
            }
        }
        System.out.println(maxDiff);

    }
}
