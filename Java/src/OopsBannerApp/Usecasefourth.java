package OopsBannerApp;

public class Usecasefourth {
    static class CharacterPatternMap{
        Character character;
        String[] pattern;

        public CharacterPatternMap(Character character,String[] pattern)
        {
            this.character=character;
            this.pattern=pattern;
        }
        public Character getCharacter()
        {
            return this.character;
        }
        public String [] getPattern()
        {
            return  this.pattern;
        }

    }
    public static CharacterPatternMap[] createPatternMap()
    {
        CharacterPatternMap[] map=new CharacterPatternMap[3];
        map[0]= new CharacterPatternMap('O',new String[]{
                "    *****    ",
                "  *       *  ",
                " *         * ",
                "*           *",
                " *         * ",
                "  *       *  ",
                "    *****    "
        });
        map[1]= new CharacterPatternMap('P', new String[]{
                " ******  ",
                "*       *",
                "*       *",
                " ******  ",
                "*        ",
                "*        ",
                "*        "
        });
        map[2]=new CharacterPatternMap('S',new String[]{
                "  *****  ",
                "*        ",
                "*        ",
                "  *****  ",
                "        *",
                "        *",
                "  *****  "
        });
        return map;
    }
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[]charMap)
    {
        String[]ans=new String[]{};
        for(CharacterPatternMap object1:charMap)
        {
            if(object1.character==ch)
            {
                ans=object1.pattern;
            }
        }
        return ans;
    }
    public static void printMessage(String message, CharacterPatternMap[]map)
    {
        int height = 7;

        for (int row = 0; row < height; row++) {

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);
                String[] patt = getCharacterPattern(ch, map);

                System.out.print(patt[row] + "  ");
            }

            System.out.println();
        }
    }
    public static void useCase4(){
        CharacterPatternMap[]charMap=createPatternMap();
        String message="OOPS";
        printMessage(message,charMap);
    }

    public static void main(String[] args) {
        useCase4();
    }
}
