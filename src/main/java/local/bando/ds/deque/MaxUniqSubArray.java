package local.bando.ds.deque;

import java.util.*;

public class MaxUniqSubArray {
    private final List<Integer> numbers = new ArrayList<>();
    private final Deque<Integer> workset = new LinkedList<>();
    private final Map<Integer, Integer> counter = new HashMap<>();
    private final int SUB_ARRAY_SIZE;

    public MaxUniqSubArray(final Collection<Integer> numbers, int subArraySize) {
        this.numbers.addAll(numbers);
        this.SUB_ARRAY_SIZE = subArraySize;
    }

    public int maxUnique() {
        final int TOTAL_NUMBERS = this.numbers.size();
        int maxSeq = 0;
        int cur;
        for (int i = 0; i < TOTAL_NUMBERS; ++i) {
            cur = this.numbers.get(i);

            // special handling when we start rolling the current deque
            if(i >= this.SUB_ARRAY_SIZE) {
                // no need to do anything ... the element pushed and popped have same values
                if(this.workset.peekFirst() == cur)
                    continue;

                // null removes the key else decrements the count
                this.counter.merge(this.workset.removeFirst(), -1, (a, b) -> a == 1 ? null : a + b);
            }

            // Keep on adding to the deque
            this.workset.addLast(cur);
            this.counter.merge(cur, 1, Integer::sum);
            maxSeq = Math.max(maxSeq, this.counter.size());

            if(maxSeq == this.SUB_ARRAY_SIZE)
                break;
        }

        return maxSeq;
    }
}
