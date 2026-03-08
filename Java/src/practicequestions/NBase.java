package practicequestions;

import java.util.Scanner;

public class NBase {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();

        System.out.println(findNotation(n,num));
    }
    static String findNotation(int n,int num){
        StringBuilder result = new StringBuilder();
        while(num!=0){
            int rem = num%n;
            if(rem>9)
            {
                char ch=(char)(rem-10+'A');
                result.append(ch);
            }
            else{
                result.append(rem);
            }
            num=num/n;
        }
        result.reverse();
        return result.toString();
    }
}
