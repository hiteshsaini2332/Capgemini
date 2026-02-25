package array;

public class RotationPalindrome {
    static boolean rotateString(String st, int k) {
        String  ans=st.substring(k)+st.substring(0,k);

        int s=0;
        int e=ans.length()-1;
        while(s<e)
        {
            char ch1=ans.charAt(s);
            char ch2=ans.charAt(e);
            if(ch1!=ch2){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
    static void main() {
        String s="abc";
        boolean flag=false;
        for(int i=1;i<=s.length();i++)
        {
            if(rotateString(s,i))
            {
                System.out.println("Yes");
                flag=true;
                break;
            }
        }
       if(!flag)
       {
           System.out.println("No");
       }


    }
}
