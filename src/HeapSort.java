// The sorting algorithm used in this class is from
// https://www.geeksforgeeks.org

// Java implementation of Iterative Heap Sort
public class HeapSort {
    static int compCount = 0;
    static int swapCount = 0;
    // function build Max Heap where value
    // of each child is always smaller
    // than value of their parent
    static void buildMaxHeap(int arr[], int n)
    {
        for (int i = 1; i < n; i++)
        {
        // if child is bigger than parent
        if (arr[i] > arr[(i - 1) / 2])
        {
            int j = i;
    
            // swap child and parent until
            // parent is smaller
            while (arr[j] > arr[(j - 1) / 2])
            {
            swap(arr, j, (j - 1) / 2);
            j = (j - 1) / 2;
            }
        }
        }
    }
    
    static SortStatistics Exec(int arr[], int n)
    {
        buildMaxHeap(arr, n);
    
        for (int i = n - 1; i > 0; i--)
        {
        // swap value of first indexed
        // with last indexed
        swap(arr, 0, i);
    
        // maintaining heap property
        // after each swapping
        int j = 0, index;
    
        do
        {
            index = (2 * j + 1);
    
            // if left child is smaller than
            // right child point index variable
            // to right child
            if (index < (i - 1) && arr[index] < arr[index + 1]){
                compCount++;
                index++;
            }
    
            // if parent is smaller than child
            // then swapping parent with child
            // having higher value
            if (index < i && arr[j] < arr[index]){
                compCount++;
                swap(arr, j, index);
            }
    
            j = index;
    
        } while (index < i);
        }

        SortStatistics result = new SortStatistics();
        result.setReturnArray(arr);
        result.setNumSwap(swapCount);
        result.setNumCompare(compCount);

        return result;


    }
    
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i]=a[j];
        a[j] = temp;
        swapCount++;
    }
    
   

    }
    
    