package local.bando.ds.bitset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BitSetOpsTest {
    @Test
    void testANDOp() {
        final BitSetOps bitSetOps = new BitSetOps(5, 4);
        Assertions.assertEquals("0 0", bitSetOps.operation("AND", 1, 2));
    }

    @Test
    void testOperationsSet() {
        final BitSetOps bitSetOps = new BitSetOps(5, 4);
        Assertions.assertEquals("0 0", bitSetOps.operation("AND", 1, 2));
        Assertions.assertEquals("1 0", bitSetOps.operation("SET", 1, 4));
        Assertions.assertEquals("1 1", bitSetOps.operation("FLIP", 2, 2));
        Assertions.assertEquals("1 2", bitSetOps.operation("OR", 2, 1));
    }

    @Test
    void testCase3() {
        final BitSetOps bitSetOps = new BitSetOps(10, 50);
        Assertions.assertEquals("0 0", bitSetOps.operation("AND", 1, 2));
        Assertions.assertEquals("0 0", bitSetOps.operation("XOR", 1, 2));
        Assertions.assertEquals("0 0", bitSetOps.operation("XOR", 1, 2));
        Assertions.assertEquals("0 0", bitSetOps.operation("AND", 2, 1));
        Assertions.assertEquals("0 0", bitSetOps.operation("XOR", 1, 2));
        Assertions.assertEquals("1 0", bitSetOps.operation("SET", 1, 1));
        Assertions.assertEquals("2 0", bitSetOps.operation("SET", 1, 0));
    }

    /*
    List<String> testCase3InputStrings() {
        List<String> commands = new ArrayList<>();
        commands.add("10 50");
        commands.add("AND 1 2");
        commands.add("XOR 1 2");
        commands.add("XOR 1 2");
        commands.add("AND 2 1");
        commands.add("XOR 1 2");
        commands.add("SET 1 1");
        commands.add("SET 1 0");
        commands.add("XOR 2 1");
        commands.add("OR 1 2");
        commands.add("FLIP 2 1");
        commands.add("OR 2 1");
        commands.add("FLIP 1 4");
        commands.add("AND 1 2");
        commands.add("OR 1 2");
        commands.add("OR 2 1");
        commands.add("XOR 1 2");
        commands.add("SET 1 3");
        commands.add("AND 1 2");
        commands.add("SET 2 8");
        commands.add("OR 1 2");
        commands.add("AND 1 2");
        commands.add("AND 1 2");
        commands.add("XOR 2 1");
        commands.add("AND 2 1");
        commands.add("XOR 1 2");
        commands.add("SET 2 5");
        commands.add("OR 1 2");
        commands.add("XOR 2 1");
        commands.add("XOR 1 2");
        commands.add("AND 1 2");
        commands.add("FLIP 2 2");
        commands.add("AND 1 2");
        commands.add("AND 1 2");
        commands.add("XOR 1 2");
        commands.add("XOR 2 1");
        commands.add("AND 1 2");
        commands.add("FLIP 1 0");
        commands.add("SET 2 0");
        commands.add("OR 2 1");
        commands.add("FLIP 2 9");
        commands.add("XOR 1 2");
        commands.add("FLIP 2 8");
        commands.add("AND 1 2");
        commands.add("XOR 2 1");
        commands.add("AND 2 1");
        commands.add("XOR 1 2");
        commands.add("AND 1 2");
        commands.add("SET 1 4");
        commands.add("XOR 1 2");
        commands.add("AND 2 1");

        return commands;
    }

    List<String> testCase3Results() {
        List<String> results = new ArrayList<>();



        results.add("0 0");
        results.add("0 0");
        results.add("0 0");
        results.add("0 0");
        results.add("0 0");
        results.add("1 0");
        results.add("2 0");
        results.add("2 2");
        results.add("2 2");
        results.add("2 1");
        results.add("2 2");
        results.add("3 2");
        results.add("2 2");
        results.add("2 2");
        results.add("2 2");
        results.add("0 2");
        results.add("1 2");
        results.add("0 2");
        results.add("0 3");
        results.add("3 3");
        results.add("3 3");
        results.add("3 3");
        results.add("3 0");
        results.add("3 0");
        results.add("3 0");
        results.add("3 1");
        results.add("4 1");
        results.add("4 3");
        results.add("1 3");
        results.add("0 3");
        results.add("0 4");
        results.add("0 4");
        results.add("0 4");
        results.add("4 4");
        results.add("4 0");
        results.add("0 0");
        results.add("1 0");
        results.add("1 1");
        results.add("1 1");
        results.add("1 2");
        results.add("1 2");
        results.add("1 3");
        results.add("1 3");
        results.add("1 2");
        results.add("1 0");
        results.add("1 0");
        results.add("0 0");
        results.add("1 0");
        results.add("1 0");
        results.add("1 0");

        return results;
    }
    */
}