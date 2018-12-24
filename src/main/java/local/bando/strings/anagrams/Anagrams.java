package local.bando.strings.anagrams;

import java.util.HashMap;
import java.util.Map;

public final class Anagrams {
    public static boolean areAnagrams(final String str1, final String str2) {
        if(str1.length() != str2.length())
            return false;

        Map<Character, Integer> charCounter = new HashMap<>();
        for(int i = 0; i < str1.length(); ++i)
            charCounter.merge(Character.toLowerCase(str1.charAt(i)), 1, Integer::sum);

        for(int i = 0; i < str2.length(); ++i)
            charCounter.merge(Character.toLowerCase(str2.charAt(i)), -1, (a, b) -> (a == 1) ? null : (a + b));

        return charCounter.isEmpty();
    }
}
