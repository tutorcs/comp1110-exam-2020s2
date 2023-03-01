https://tutorcs.com
WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package comp1110.exam;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

import java.util.Arrays;
import java.util.Random;

import static junit.framework.TestCase.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Q1CeilTest {
    @Rule
    public Timeout globalTimeout = Timeout.millis(500);

    public static int ITERATIONS = 10;
    Random r = new Random();

    @Test
    public void testEmpty() {
        test(new int[]{}, 1, 2);
        test(new int[]{}, 0, 1);
        test(new int[]{}, -1, 0);
        test(new int[]{}, -2, -1);
    }

    @Test
    public void testOne() {
        test(new int[]{1}, 2, 1);
        test(new int[]{2}, 2, 3);
        test(new int[]{2}, 3, 2);
        test(new int[]{3}, 4, 3);
        test(new int[]{-1}, 0, -1);
    }

    @Test
    public void testMultiple() {
        test(new int[]{1, 2}, 1, 2);
        test(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 1, 2);
        test(new int[]{2, 1}, 1, 2);
        test(new int[]{3, 2}, 1, 2);
        test(new int[]{8, 3, -5, 2, 1, 0}, 2, 1);
        test(new int[]{3, 1}, 3, 1);
        test(new int[]{0, 9}, 9, 0);
        test(new int[]{3, 1, 5, -4, 0}, 3, 1);
    }

    @Test
    public void testDuplicate() {
        test(new int[]{2, 2}, 3, 2);
        test(new int[]{3, 2, -2, 2}, 3, 2);
        test(new int[]{3, 1, 3}, 3, 1);
        test(new int[]{2, 2}, 3, 2);
    }

    @Test
    public void testNoneLess() {
        test(new int[]{2, 2}, 2, 3);
        test(new int[]{-4, 2, 1}, -4, -3);
        test(new int[]{1, 3, 2}, 1, 2);
        test(new int[]{9, 7, 8}, 7, 8);
        test(new int[]{1, 0, 1}, 0, 1);
        // trivial test
        test(new int[]{12, 2, 2}, 3, 2);
    }

    void test(int[] values, int ceil, int expected) {
        int result = Q1Ceil.findLess(values, ceil);
        assertTrue("Q1Ceil.findLess(" + Arrays.toString(values) + ", " + ceil + ") returned " + result + ", expected " + expected, result == expected);
    }
}
