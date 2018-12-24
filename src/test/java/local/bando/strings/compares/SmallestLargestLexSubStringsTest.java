package local.bando.strings.compares;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestLargestLexSubStringsTest {
    @Test
    void testSampleUnit() {
        final String str = "welcometojava";
        final int subArraySize = 3;

        final String expected = "ava\nwel";

        Assertions.assertEquals(expected, SmallestLargestLexSubStrings.getSmallestAndLargest(str, subArraySize));
    }
}