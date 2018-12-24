package local.bando.strings.anagrams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsTest {
    @Test
    void testAnagramsCaseInsensitivePos() {
        String[] strings = {"hello", "Hello"};
        Assertions.assertTrue(Anagrams.areAnagrams(strings[0], strings[1]));
    }

    @Test
    void testAnagramsPos() {
        String[] strings = {"margana", "anagram"};
        Assertions.assertTrue(Anagrams.areAnagrams(strings[0], strings[1]));
    }

    @Test
    void testAnagramsNeg() {
        String[] strings = {"marganaa", "anagramm"};
        Assertions.assertFalse(Anagrams.areAnagrams(strings[0], strings[1]));
    }
}