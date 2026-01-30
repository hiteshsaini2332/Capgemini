package linearsearch;

public class SearchWord {
    public static boolean searchWord(String sentence,String word)
    {
        String[] arr=sentence.split("\\s+");
        for(String s:arr)
        {
            if(s.equals(word))return true;
        }
        return false;
    }

    static void main() {
        String sentence="Hello Good Morning! How are you?";
        String word="am";
        if(searchWord(sentence,word))
        {
            System.out.println(word+" found in Sentence "+sentence);
        }
        else{
            System.out.println(word+" not found in "+sentence);
        }
    }
}
