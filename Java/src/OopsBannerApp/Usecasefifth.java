package OopsBannerApp;
import java.util.HashMap;
public class Usecasefifth {
    public static HashMap<Character,String[]>createCharMap()
    {
        HashMap<Character,String[]>charMap=new HashMap<>();
        charMap.put('O',new String[]{
                "    *****    ",
                "  *       *  ",
                " *         * ",
                "*           *",
                " *         * ",
                "  *       *  ",
                "    *****    "
        });
        charMap.put('P',new String[]{
                " ******  ",
                "*       *",
                "*       *",
                " ******  ",
                "*        ",
                "*        ",
                "*        "
        });
        charMap.put('S',new String[]{
                "  *****  ",
                "*        ",
                "*        ",
                "  *****  ",
                "        *",
                "        *",
                "  *****  "
        });
        return  charMap;
    }
    public static void displayBanner(String message,HashMap<Character,String[]>charMap)
    {
        for(int row=0;row<7;row++)
        {
            for(int index=0;index<message.length();index++)
            {
                char ch=message.charAt(index);
                String[]patt=charMap.get(ch);
                System.out.print(patt[row]+" ");
            }
            System.out.println();
        }
    }
    public static void useCase5(){
        HashMap<Character,String[]> charMap=createCharMap();
        String message="OOPS";
        displayBanner(message,charMap);
    }

    public static void main(String[] args) {
        useCase5();
    }
}
