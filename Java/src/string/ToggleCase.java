package string;

public class ToggleCase {
    static void main() {
        String s="java programming";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(i%2==0)
            {
                ch=Character.toUpperCase(ch);
            }
            else{
                ch=Character.toLowerCase(ch);
            }
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
