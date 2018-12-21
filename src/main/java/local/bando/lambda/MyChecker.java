package local.bando.lambda;

import java.util.stream.IntStream;

public final class MyChecker {
    public static boolean checker(PerformOperation operation, int num) {
        return operation.check(num);
    }

    public PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }

    public PerformOperation isPrime() {
        return n -> IntStream.range(2, (int)Math.sqrt(n + 1)).noneMatch(i -> n % i == 0);
    }

    public PerformOperation isPalindrome() {
        return n -> {
            int tmp = Math.abs(n);
            int rev = 0;

            while(tmp != 0) {
                rev = (rev * 10) + (tmp % 10);
                tmp /= 10;
            }

            return tmp == rev;
        };
    }
}
