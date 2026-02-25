package string;
public class CharacterFrequency {
    static void main() {
        String s1="aaabbcddd";
        char prev=s1.charAt(0);
        int count=1;
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch==prev)
            {
                count++;
            }
            else{
                sb.append(prev);
                sb.append(count);
                prev=ch;
                count=1;
            }
        }
        sb.append(prev);
        sb.append(count);

        System.out.println(sb);
    }
}
