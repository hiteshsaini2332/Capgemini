package stringbuffer;

public class ConcatenateStrings {
    public static String concatenate(String[]strings)
    {
        StringBuffer sb=new StringBuffer();
        for(String string:strings)
        {
            sb.append(string);
            sb.append(" ");
        }
        return sb.toString();
    }
    static void main() {
        String[]strings={"Hello","Good","Morning","!"};
        System.out.println(concatenate(strings));

    }
}
