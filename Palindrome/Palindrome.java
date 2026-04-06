public class Palindrome {
    public static boolean isPalindrome(String s) {
        char[] word = s.toLowerCase().toCharArray();

        for (int i = 0; i < s.length() ; i++) {
            if (word[i] != word[s.length()-1 - i]) {
                return false;
            }
        
        }
        return true;
       
    }
}