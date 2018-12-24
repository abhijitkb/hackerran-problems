package local.bando.strings.reverse;

public final class Palindrome {
    public static boolean isPalindrome(final String str) {
        return str.compareTo(new StringBuilder(str).reverse().toString()) == 0;
    }
}
