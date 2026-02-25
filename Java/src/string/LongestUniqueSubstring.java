package string;

import java.util.HashMap;

public class LongestUniqueSubstring {
    static void main() {
        String s="bbbb";

        HashMap<Character,Integer> map=new HashMap<>();
        int maxLen=0;
        int l=0;
        int r=0;
        while(r<s.length()){
            char c=s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            if(r-l+1>map.size())
            {
                char ch=s.charAt(l);
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                    map.remove(ch);
                }
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        System.out.println(maxLen);
    }
}
