package practicequestions;

import java.util.Scanner;

public class ReplaceChar {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch1=sc.next().charAt(0);
        char ch2=sc.next().charAt(0);
        System.out.println(replaceChars(str,ch1,ch2));
    }
    static String replaceChars(String str, char ch1, char ch2) {
        if(str==null) return null;
        if(ch1==ch2) return str;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==ch1){
                sb.append(ch2);
            }
            else if(ch==ch2){
                sb.append(ch1);
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
