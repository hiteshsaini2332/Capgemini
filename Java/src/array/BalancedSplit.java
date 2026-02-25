package array;

public class BalancedSplit {
    static void main() {
        int[]arr={1,2,3,4};
        if(check(arr)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    static boolean check(int[]arr){
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double temp=0;
        for(int i=0;i<arr.length;i++)
        {
            temp+=arr[i];
            if(temp==sum/2){
                return true;
            }
        }
        return false;
    }
}
