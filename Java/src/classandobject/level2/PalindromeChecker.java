package classandobject.level2;

public class PalindromeChecker {
    private String text;
    PalindromeChecker(String text)
    {
        this.text=text;
    }

    public boolean checkPalindrome()
    {
        String temp=text.trim();
        int start=0;
        int end=temp.length()-1;
        while(start<end)
        {
            if(temp.charAt(start)!=temp.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public void displayResult()
    {
        if(checkPalindrome())
        {
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
    }
}
