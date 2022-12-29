public class Polindrome {
    public static void main(String[] args) {
        System.out.println("java: "+isPalindrome("java"));
        System.out.println("Palindrome: "+isPalindrome("Palindrome"));
        System.out.println("madam: "+isPalindrome("madam"));
        System.out.println("racecar: "+isPalindrome("racecar"));
        System.out.println("kayak: "+isPalindrome("kayak"));
        System.out.println("song: "+isPalindrome("song"));
    }
    public static String reverseString(String s){
        String rez = "";
        for(int i = s.length()-1; i>=0 ; i--){
            rez += s.charAt(i);
        }
        return rez;
    }

    public static boolean isPalindrome(String s){
        return s.equals(reverseString(s));

    }

}
