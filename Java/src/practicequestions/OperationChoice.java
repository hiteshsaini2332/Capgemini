package practicequestions;

import java.util.Scanner;

public class OperationChoice {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans=doOperation(a,b,c);
        System.out.println(ans);
    }
    static int doOperation(int a,int b,int c){
        if(c==1)return a+b;
        else if(c==2)return a-b;
        else if(c==3)return b*a;
        else if(c==4)return a/b;
        return 0;
    }
}
