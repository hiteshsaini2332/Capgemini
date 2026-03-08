package practicequestions;

import java.util.Scanner;

public class PasswordChecker {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        if(validatePassword(str))
        {
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Invalid Password");
        }
    }
    public static boolean validatePassword(String str) {
        String pattern="^(?=.*[0-9])(?=.*[A-Z])[^0-9 /][^ /]{3,}$";
        return  str.matches(pattern);
    }
}
