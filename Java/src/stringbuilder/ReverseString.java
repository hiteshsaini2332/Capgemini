package stringbuilder;

public class ReverseString {
    public static String reverseString(String s)
    {
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
    }
    static void main() {
        String s="hello";
        s=reverseString(s);
        System.out.println(s);
    }
}
