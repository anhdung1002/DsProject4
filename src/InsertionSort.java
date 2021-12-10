public class InsertionSort {
    // Java program for implementation of Insertion Sort
    /*Function to sort array using insertion sort*/
    static SortStatistics Exec(int arr[], int low, int high)
    {
        int compCount = 0;
        int swapCount = 0;

        for (int i = low; i <= high; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                
                swapCount++;
            }
            arr[j + 1] = key;
            compCount++;
        }

        SortStatistics result = new SortStatistics();
        result.setNumCompare(compCount);
        result.setNumSwap(swapCount);
        return result;

    }
}
