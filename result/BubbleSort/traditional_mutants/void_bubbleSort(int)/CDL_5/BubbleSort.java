// This is a mutant program.
// Author : ysma

public class BubbleSort
{

    public  void bubbleSort( int[] arr )
    {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

}
