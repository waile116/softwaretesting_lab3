
import org.junit.*;
import static org.junit.Assert.*;

public class BubbleSortTest {
    private BubbleSort bubbleSort;

    @Before
    public void setUp(){
        bubbleSort = new BubbleSort();
    }

    @Test
    public void testEmpty() {
        int[] input = {};
        int[] expected = {};
        bubbleSort.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        bubbleSort.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testReverse() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        bubbleSort.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testDuplicates() {
        int[] input = {3, 2, 3, 1, 2};
        int[] expected = {1, 2, 2, 3, 3};
        bubbleSort.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testNegative() {
        int[] input = {-5, -3, -7, -1, -4};
        int[] expected = {-7, -5, -4, -3, -1};
        bubbleSort.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testZero() {
        int[] input = {3, 0, -2, 5, 0};
        int[] expected = {-2, 0, 0, 3, 5};
        bubbleSort.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testLarge() {
        int[] input = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 18, 20, 12, 4};
        int[] expected = {0, 1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 12, 18, 20};
        bubbleSort.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testEqual() {
        int[] input = {5, 5, 5, 5, 5};
        int[] expected = {5, 5, 5, 5, 5};
        bubbleSort.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSingle() {
        int[] input = {5};
        int[] expected = {5};
        bubbleSort.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testNegativePositive() {
        int[] input = {-5, 3, -7, 1, 0};
        int[] expected = {-7, -5, 0, 1, 3};
        bubbleSort.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testLargeValues() {
        int[] input = {1000, 10000, 100, 100000, 1000000};
        int[] expected = {100, 1000, 10000, 100000, 1000000};
        bubbleSort.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void test1() {
        int[] input = {38, 62, 87, 13, 27};
        int[] expected = {13, 27, 38, 62, 87};
        bubbleSort.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void test2() {
        int[] input = {12, 7, 3, 1, 9};
        int[] expected = {1, 3, 7, 9, 12};
        bubbleSort.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void test3() {
        int[] input = {850, 7, 204, 152, 180, 793, 571};
        int[] expected = {7, 152, 180, 204, 571, 793, 850};
        bubbleSort.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void test4() {
        int[] input = {70, 14, 99, 89, 16, 55, 2};
        int[] expected = {2, 14, 16, 55, 70, 89, 99};
        bubbleSort.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @After
    public void tearDown(){
        bubbleSort = null;
    }
}