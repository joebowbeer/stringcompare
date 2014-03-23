package stringcompare;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringCompareTest {
    
    @Test
    public void testCompare() {
        assertEquals(0, compare("", ""));
        assertEquals(0, compare("f", "f"));
        assertTrue(compare("f", "b") > 0);
        assertTrue(compare("b", "f") < 0);
        assertEquals(0, compare("foo", "foo"));
        assertTrue(compare("foo", "bar") > 0);
        assertTrue(compare("bar", "foo") < 0);
        assertTrue(compare("foot", "food") > 0);
    }

    private static int compare(String f, String b) {
        return StringCompare.compareMapReduce(f, b);
    }
}
