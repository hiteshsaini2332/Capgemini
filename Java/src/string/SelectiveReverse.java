package string;

public class SelectiveReverse {
    static void main() {
        String s="I love Java programming very much";
        String[] arr=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            if(i%2!=0)
            {
                StringBuilder temp=new StringBuilder(arr[i]);
                temp.reverse();
                sb.append(temp).append(" ");
            }
            else{
                sb.append(arr[i]).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
