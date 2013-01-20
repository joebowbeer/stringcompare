package stringcompare;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringCompareTest {
    
    public StringCompareTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of compare method, of class StringCompare.
     */
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
