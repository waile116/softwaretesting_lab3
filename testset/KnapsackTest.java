import org.junit.*;
import static org.junit.Assert.*;

public class KnapsackTest {

    private Knapsack knapsack;

    @Before
    public void setUp(){
        knapsack = new Knapsack();
    }
    @Test
    public void testEmpty() {
        int[] weights = {};
        int[] values = {};
        int capacity = 5;
        int expected = 0;
        assertEquals(expected, knapsack.knapsack(weights, values, capacity));
    }

    @Test
    public void testZeroCapacity() {
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int capacity = 0;
        int expected = 0;
        assertEquals(expected, knapsack.knapsack(weights, values, capacity));
    }

    @Test
    public void testZeroWeight() {
        int[] weights = {0, 0, 0};
        int[] values = {3, 4, 5};
        int capacity = 5;
        int expected = 12;
        assertEquals(expected, knapsack.knapsack(weights, values, capacity));
    }

    @Test
    public void testZeroValue() {
        int[] weights = {2, 3, 4, 5};
        int[] values = {0, 0, 0, 0};
        int capacity = 5;
        int expected = 0;
        assertEquals(expected, knapsack.knapsack(weights, values, capacity));
    }

    @Test
    public void testLargeCapacity() {
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int capacity = 100;
        int expected = 18;
        assertEquals(expected, knapsack.knapsack(weights, values, capacity));
    }

    @Test
    public void testLargeValueWeight() {
        int[] weights = {10000, 20000, 30000, 40000};
        int[] values = {1000, 10000, 100000, 1000000};
        int capacity = 35000;
        int expected = 100000;
        assertEquals(expected, knapsack.knapsack(weights, values, capacity));
    }

    @Test
    public void testEqualWeightValue() {
        int[] weights = {2, 2, 2};
        int[] values = {3, 3, 3};
        int capacity = 5;
        int expected = 6;
        assertEquals(expected, knapsack.knapsack(weights, values, capacity));
    }

    @Test
    public void testPerfectWeight() {
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int capacity = 14;
        int expected = 18;
        assertEquals(expected, knapsack.knapsack(weights, values, capacity));
    }

    @Test
    public void testNoFit() {
        int[] weights = {6, 10, 7, 12};
        int[] values = {3, 4, 5, 6};
        int capacity = 5;
        int expected = 0;
        assertEquals(expected, knapsack.knapsack(weights, values, capacity));
    }

    @Test
    public void test1() {
        int[] weights = {1, 2, 3, 4};
        int[] values = {2, 5, 6, 9};
        int capacity = 6;
        int expected = 14;
        assertEquals(expected, knapsack.knapsack(weights, values, capacity));
    }

    @Test
    public void test2() {
        int[] weights = {30, 10, 40, 20};
        int[] values = {10, 20, 30, 40};
        int capacity = 40;
        int expected = 60;
        assertEquals(expected, knapsack.knapsack(weights, values, capacity));
    }

    @Test
    public void test3() {
        int[] weights = {85, 26, 48, 21, 22, 95, 43, 45, 55, 52};
        int[] values = {79, 32, 47, 18, 26, 85, 33, 40, 45, 59};
        int capacity = 101;
        int expected = 117;
        assertEquals(expected, knapsack.knapsack(weights, values, capacity));
    }

    @Test
    public void test4() {
        int[] weights = {1, 2, 4, 5};
        int[] values = {5, 4, 8, 6};
        int capacity = 5;
        int expected = 13;
        assertEquals(expected, knapsack.knapsack(weights, values, capacity));
    }

    @Test
    public void test5() {
        int[] weights = {92, 4, 43, 83, 84, 68, 92, 82, 6, 44, 32, 18, 56, 83, 25, 96, 70, 48, 14, 58};
        int[] values = {44, 46, 90, 72, 91, 40, 75, 35, 8, 54, 78, 40, 77, 15, 61, 17, 75, 29, 75, 63};
        int capacity = 878;
        int expected = 1024;
        assertEquals(expected, knapsack.knapsack(weights, values, capacity));
    }

    @Test
    public void test6() {
        int[] weights = {10, 20, 40, 30};
        int[] values = {60, 100, 120, 70};
        int capacity = 50;
        int expected = 180;
        assertEquals(expected, knapsack.knapsack(weights, values, capacity));
    }

    @After
    public void tearDown(){
        knapsack = null;
    }
}