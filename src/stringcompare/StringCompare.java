package stringcompare;

import static java.lang.Character.compare;
import java.util.stream.IntStream;

public class StringCompare {

    public static void main(String[] args) {
        System.out.println(compareMapReduce(args[0], args[1]));
    }

    public static int compareMapReduce(String s1, String s2) {
        assert s1.length() == s2.length();
        return IntStream.range(0, s1.length()).parallel()
                .map(i -> compare(s1.charAt(i), s2.charAt(i)))
                .reduce(0, (l, r) -> (l != 0) ? l : r);
    }

    public static int compareBoxedReduce(String s1, String s2) {
        assert s1.length() == s2.length();
        return IntStream.range(0, s1.length()).parallel().boxed()
                .reduce(0, (l, i) -> (l != 0) ? l : compare(s1.charAt(i), s2.charAt(i)),
                           (l, r) -> (l != 0) ? l : r);
    }
}
