package string;

public class InterleavedMerge {
    static void main() {
        String s1="abcdef";
        String s2="XYZ";

        int n=s1.length();
        int m=s2.length();

        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=0;
        while(i<n&&j<m){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(j);
            sb.append(ch1);
            sb.append(ch2);
            i++;
            j++;
        }
        while(i<n){
            char ch1=s1.charAt(i);
            sb.append(ch1);
            i++;
        }
        while(j<m){
            char ch2=s2.charAt(j);
            sb.append(ch2);
            j++;
        }
        System.out.println(sb);

    }
}
