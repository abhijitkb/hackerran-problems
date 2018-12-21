package local.bando.ds.bitset;

import java.util.*;
import java.util.function.BiConsumer;

/**
 * {@link BitSetOps} allows a set of operations on two bits initially set to 0;
 * and prints the number of bits of the two sets <b>bits set</b> after each operation.
 * <pre>
 *     Operations allowed are:
 *     <lu>
 *         <li>AND {@code <set> <set>}</li>
 *         <li>OR {@code <set> <set>}</li>
 *         <li>XOR {@code <set> <set>}</li>
 *         <li>FLIP {@code <set> <index>}</li>
 *         <li>SET {@code <set> <index>}</li>
 *     </lu>
 * </pre>
 */
public final class BitSetOps {
    private final List<BitSet> bitsets = new ArrayList<>(2);

    private final Map<String, BiConsumer<Integer, Integer>> COMMANDS;

    public BitSetOps(final int sizeB1, final int sizeB2) {
        COMMANDS = initialiseCommands();
        bitsets.add(new BitSet(sizeB1));
        bitsets.add(new BitSet(sizeB2));
    }

    private Map<String, BiConsumer<Integer, Integer>> initialiseCommands() {
        final Map<String, BiConsumer<Integer, Integer>> commands = new HashMap<>();
        commands.put("AND", (a, b) -> bitsets.get(a - 1).and(bitsets.get(b - 1)));
        commands.put("OR", (a, b) -> bitsets.get(a - 1).or(bitsets.get(b - 1)));
        commands.put("XOR", (a, b) -> bitsets.get(a - 1).xor(bitsets.get(b - 1)));
        commands.put("FLIP", (a, b) -> bitsets.get(a - 1).flip(b));
        commands.put("SET", (a, b) -> bitsets.get(a - 1).set(b));

        return commands;
    }

    public String operation(final String operation, int arg1, int arg2) {
        this.COMMANDS.get(operation).accept(arg1, arg2);
        return String.format("%d %d", this.bitsets.get(0).cardinality(), bitsets.get(1).cardinality());
    }
}
