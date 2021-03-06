import java.util.*;
import java.lang.String;

public class BigPalindrome {
    public static boolean checkPalindrome (String NewStr) {
        for (int i=0, j=NewStr.length()-1; i<NewStr.length()/2; ++i, --j) {
            if (NewStr.charAt(i) != NewStr.charAt(j))
                return false;
        }
        return true;
    }
    
    public static void main (String[] args) {
        Scanner Scan = new Scanner (System.in);
        //System.out.print ("Enter a string of any length: ");
        String input = Scan.nextLine();
        int LengthOfInp = input.length();
        String PalindromeStr = new String ();
        
        for (int i=0; i<LengthOfInp; ++i) {
            String NewStr = new String();
            NewStr += input.charAt(i);
            for (int j=i+1; j<LengthOfInp; ++j) {
                NewStr += input.charAt(j);
                if (checkPalindrome (NewStr))
                    if (NewStr.length() > PalindromeStr.length())
                        PalindromeStr = PalindromeStr.replaceAll (PalindromeStr, NewStr);
            }
        }
        //System.out.print("The biggest Palindrome substring is: ");
        System.out.println (PalindromeStr);
    }
}