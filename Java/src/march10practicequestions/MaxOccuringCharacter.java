package march10practicequestions;

import java.util.Scanner;

public class MaxOccuringCharacter {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch=findMaxChar(str);
        System.out.println(ch);
    }
    static char findMaxChar(String str) {
        int []arr=new int[26];
        int count=0;
        int  max=0;
        char ch=' ';
        for(int i=0;i<str.length();i++) {
            arr[str.charAt(i) - 'a']++;
            if(arr[str.charAt(i) - 'a']>max){
                max=arr[str.charAt(i) - 'a'];
                ch=str.charAt(i);
            }
        }

        for(int i:arr){
           if(i==max)count++;
        }

        return count>1?'0':ch;
    }
}
