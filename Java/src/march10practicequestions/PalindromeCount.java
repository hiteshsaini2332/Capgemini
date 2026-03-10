package march10practicequestions;

import java.util.Scanner;

public class PalindromeCount {
    static void main() {
        Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       int n = str.length();
        System.out.println("Count: "+findCount(str,n));
    }
    static int findCount(String str,int n){
        int count = 0;
        String[] arr=str.split("\\s+");
        for(int i=0;i<arr.length;i++){
            if(isPalindrome(arr[i]))count++;
        }
        return count;
    }
    static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
