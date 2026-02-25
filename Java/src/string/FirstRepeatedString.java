package string;

public class FirstRepeatedString {
    static void main() {
        String[]arr={"java","python","c++","java","c","python"};
        String s="";
        for(String str:arr){
            if(s.contains(str)){
                System.out.println(str+" is repeated");
                break;
            }
            s+=str;
        }

    }
}
