package local.bando.ds.deque;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxUniqSubArrayTest {
    @Test
    void testAllDuplicates() {
        List<Integer> numbers = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        MaxUniqSubArray uniqSubArray = new MaxUniqSubArray(numbers, 3);

        Assertions.assertEquals(1, uniqSubArray.maxUnique());
    }

    @Test
    void testSimpleInputs() {
        List<Integer> numbers = Arrays.asList(5, 3, 5, 2, 3, 2);
        MaxUniqSubArray uniqSubArray = new MaxUniqSubArray(numbers, 3);

        Assertions.assertEquals(3, uniqSubArray.maxUnique());
    }
}