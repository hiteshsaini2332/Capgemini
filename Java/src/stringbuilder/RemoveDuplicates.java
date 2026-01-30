package stringbuilder;

import java.util.HashSet;

public class RemoveDuplicates {
    public static String removeDuplicates(String s)
    {
        StringBuilder sb=new StringBuilder();
        HashSet<Character>set=new HashSet<>();
        for(char ch:s.toCharArray())
        {
            if(!set.contains(ch))
            {
                sb.append(ch);
            }
            set.add(ch);
        }
        return sb.toString();
    }
    static void main() {
        String s="aabbbcccc";
        System.out.println(removeDuplicates(s));
    }
}
