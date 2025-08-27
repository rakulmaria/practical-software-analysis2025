package exercises;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        boolean flag = false;
        if (s == null) throw new IllegalArgumentException("null");
        String t = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        for (int i = 0; i < t.length() / 2; i++) {
            flag = (t.charAt(i) != t.charAt(t.length() - i - 2));
        }
        return flag;
    }
    
}

