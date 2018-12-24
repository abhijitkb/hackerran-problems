package local.bando.strings.compares;

public final class SmallestLargestLexSubStrings {
    /**
     * Determines the smallest and largest substrings based on Lexographical comparisons
     * @param string The input string
     * @param subArraySize The size of sub strings that would be created
     * @return smallest and largest {@code "joined"} together using a new line character
     */
    public static String getSmallestAndLargest(final String string, final int subArraySize) {
        if(string.length() < subArraySize)
            throw new IllegalStateException(String.format("String needs to have min size: %d, got %d characters", subArraySize, string.length()));

        String smallest = string.substring(0, subArraySize);
        String largest = smallest;

        String subString;
        for (int i = 1; i <= (string.length() - subArraySize); i++) {
            subString = string.substring(i, i + subArraySize);
            if(subString.compareTo(smallest) < 0)
                smallest = subString;
            else if(subString.compareTo(largest) > 0)
                largest = subString;
        }

        return String.format("%s\n%s", smallest, largest);
    }
}
