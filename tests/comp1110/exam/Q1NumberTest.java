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

import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Q1NumberTest {
    @Rule
    public Timeout globalTimeout = Timeout.millis(2000);

    @Test
    public void testOne() {
        test(new int[]{1}, 1, 0);
        test(new int[]{1}, 0, -1);
    }

    @Test
    public void testTwo() {
//        test(new int[]{0, 1, 2, 3}, 1, 1);
//        test(new int[]{0, 1, 2, 3}, 10, 1);
        test(new int[]{0, 1, 2, 3}, 23, 2);
        test(new int[]{0, 1, 2, 3}, 32, 3);
        test(new int[]{0, 1, 2, 3}, 7, -1);
        test(new int[]{0, 1, 2, 3}, 20, 2);
        test(new int[]{0, 1, 2, 3}, 21, -1);
        test(new int[]{0, 1, 2, 3}, 102, 1);
    }

    @Test
    public void testThree() {
        test(new int[]{6, 3, 1, 1, 3, 3, 5, 0, 7, 3, 5, 4, 8, 4, 4, 0}, 739, -1);
        test(new int[]{7, 2, 1, 2, 7, 5, 2, 5, 3, 0, 1, 7, 8, 7, 7, 4}, 406, -1);
        test(new int[]{4, 5, 9, 5, 9, 3, 2, 3, 6, 6, 5, 4, 9, 0, 8, 7}, 531, -1);
        test(new int[]{3, 6, 5, 7, 8, 5, 7, 6, 3, 7, 8, 0, 3, 8, 0, 9}, 104, -1);
        test(new int[]{7, 3, 2, 8, 4, 2, 5, 4, 1, 6, 4, 2, 2, 1, 7, 0}, 752, -1);
        test(new int[]{5, 4, 7, 3, 1, 6, 1, 1, 5, 7, 7, 7, 1, 8, 8, 8}, 764, 9);
        test(new int[]{7, 8, 4, 3, 1, 0, 4, 8, 7, 1, 0, 9, 4, 3, 1, 9}, 178, 4);
        test(new int[]{9, 9, 3, 0, 3, 1, 7, 2, 8, 9, 1, 3, 0, 8, 6, 9}, 372, 2);
        test(new int[]{9, 9, 8, 7, 5, 9, 0, 9, 3, 2, 2, 6, 6, 3, 9, 7}, 980, 1);
        test(new int[]{8, 7, 0, 1, 6, 8, 7, 5, 7, 6, 8, 2, 3, 3, 2, 7}, 725, 15);
    }

    @Test
    public void testFour() {
        test(new int[]{6, 8, 0, 6, 2, 8, 2, 9, 8, 4, 6, 1, 0, 5, 8, 0, 6, 6, 7, 8, 2, 2, 1, 9, 9}, 1657, -1);
        test(new int[]{6, 5, 8, 3, 0, 9, 5, 1, 3, 6, 8, 1, 4, 9, 0, 8, 3, 8, 3, 7, 4, 9, 0, 6, 5}, 613, -1);
        test(new int[]{1, 4, 9, 0, 2, 6, 2, 2, 5, 3, 2, 3, 5, 2, 8, 7, 0, 6, 0, 1, 4, 9, 2, 9, 4}, 8772, -1);
        test(new int[]{8, 6, 4, 2, 5, 5, 1, 2, 7, 4, 8, 3, 6, 4, 1, 1, 6, 3, 3, 9, 5, 5, 2, 2, 5}, 9758, -1);
        test(new int[]{6, 5, 8, 7, 7, 7, 7, 6, 1, 3, 3, 4, 2, 3, 7, 9, 2, 6, 0, 0, 9, 0, 9, 2, 9}, 5748, -1);
        test(new int[]{2, 5, 5, 4, 7, 8, 6, 9, 9, 4, 1, 0, 2, 7, 8, 9, 8, 4, 8, 6, 7, 1, 9, 3, 9}, 9459, 8);
        test(new int[]{5, 8, 1, 4, 8, 8, 2, 7, 8, 8, 6, 2, 4, 0, 5, 4, 4, 4, 5, 4, 4, 8, 5, 8, 3}, 722, 7);
        test(new int[]{9, 4, 6, 5, 7, 2, 1, 2, 7, 0, 5, 3, 4, 0, 6, 9, 6, 0, 8, 6, 9, 3, 1, 8, 6}, 5649, 3);
        test(new int[]{3, 6, 7, 5, 5, 8, 0, 3, 8, 2, 6, 1, 6, 0, 9, 7, 4, 9, 9, 7, 2, 8, 3, 2, 5}, 948, 17);
        test(new int[]{7, 4, 3, 0, 1, 5, 0, 2, 7, 0, 0, 1, 5, 5, 0, 9, 4, 9, 1, 4, 3, 9, 6, 5, 9}, 572, 13);
    }

    @Test
    public void testSix() {
        test(new int[]{3, 0, 5, 8, 8, 2, 7, 5, 2, 1, 4, 0, 6, 4, 9, 5, 7, 8, 6, 7, 8, 2, 5, 3, 8, 2, 7, 7, 2, 8, 9, 1, 4, 4, 7, 4}, 97474, -1);
        test(new int[]{6, 7, 6, 5, 5, 7, 4, 7, 8, 2, 5, 1, 5, 0, 5, 3, 0, 9, 1, 1, 5, 0, 6, 0, 5, 7, 3, 0, 9, 8, 3, 2, 5, 4, 4, 5}, 48720, -1);
        test(new int[]{2, 1, 2, 8, 1, 3, 2, 5, 1, 5, 1, 6, 6, 9, 2, 1, 3, 6, 2, 4, 0, 5, 2, 2, 3, 1, 3, 1, 8, 5, 7, 3, 8, 7, 7, 0}, 59746, -1);
        test(new int[]{0, 9, 8, 6, 1, 9, 5, 5, 3, 8, 7, 1, 5, 2, 6, 6, 3, 1, 8, 7, 4, 2, 8, 0, 0, 3, 5, 9, 6, 6, 5, 3, 9, 4, 1, 1}, 72556, -1);
        test(new int[]{7, 7, 4, 5, 0, 6, 7, 9, 5, 5, 2, 2, 5, 2, 5, 1, 6, 1, 4, 4, 1, 8, 8, 2, 9, 7, 1, 1, 6, 1, 5, 8, 8, 5, 1, 0}, 88236, -1);
        test(new int[]{6, 4, 8, 3, 5, 4, 2, 6, 4, 8, 0, 1, 7, 7, 0, 1, 0, 9, 3, 0, 6, 2, 2, 2, 6, 2, 8, 7, 8, 4, 9, 1, 6, 8, 6, 3}, 20772, 25);
        test(new int[]{2, 1, 0, 6, 5, 6, 1, 0, 2, 2, 4, 0, 8, 0, 2, 7, 6, 0, 8, 3, 7, 2, 8, 8, 3, 9, 8, 8, 2, 3, 6, 6, 7, 1, 8, 2}, 26546, 9);
        test(new int[]{4, 4, 3, 3, 7, 8, 8, 2, 5, 3, 2, 6, 4, 7, 3, 1, 3, 6, 5, 9, 3, 9, 4, 2, 1, 6, 2, 1, 3, 1, 3, 7, 2, 9, 9, 2}, 15482, 24);
        test(new int[]{7, 9, 1, 8, 3, 0, 6, 7, 6, 5, 3, 6, 7, 4, 2, 6, 5, 0, 2, 3, 8, 3, 3, 4, 9, 2, 4, 9, 8, 4, 1, 9, 7, 5, 3, 9}, 4267, 13);
        test(new int[]{2, 8, 6, 7, 2, 7, 0, 3, 9, 7, 3, 2, 9, 9, 4, 9, 3, 4, 3, 9, 3, 9, 0, 0, 9, 0, 2, 1, 8, 0, 8, 5, 2, 5, 0, 7}, 2234, 32);
    }

    private void test(int grid[], int t, int expected) {
        int result = Q1Number.find(grid, t);
        assertTrue("Q1Number.find(" + Arrays.toString(grid) + ", " + t + ") returned " + result + ", expected " + expected, result == expected);
    }
}
