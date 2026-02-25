package string;

public class Mirror {
    static void main() {
        String s="axyyxa";

        int n=s.length();
        int e=n-1;
        int i=0;
        boolean flag=true;
        while(i<e)
        {
            char ch=s.charAt(i);
            char ch2=s.charAt(e);
            if(ch!=ch2)
            {
                flag=false;
                break;
            }
            i++;
            e--;
        }
        if(flag)
        {
            System.out.println(s.substring(0,s.length()/2));
        }
    }
}
