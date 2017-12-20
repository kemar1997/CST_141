package mergesort;

/**
 * Demonstration of the Merge Sort recursive algorithm.
 *
 * @author Carl B. Struck
 * @version Copyright (c) 2011 SCCC West
 */
public class MergeSort
{
    // An array of 30 integers
    static int[] items = new int[30];

    /**
     * Assigns random values to each element of the integer array, displays 
     * the array of values, sorts the array (calls the merge sort) and displays 
     * the array again.
     *
     * @param args the String[] array command line argument
     */
    public static void main(String[] args)
    {
        for (int ctr = 0; ctr < items.length; ctr++)
        {
            items[ctr] = (int) Math.floor(1 + Math.random() * 100);
        }

        System.out.println("The original array:");
        showAll();

        // Perform the merge sort
        mergeSort(0, items.length - 1);

        System.out.println("The sorted array:");
        showAll();
    }
    /**
     * If the sub-array is equal to or more than one element, split the array into
     * two and call the recursive mergeSort(int, int) method.  Stop when the base case
     * is reached, e.g. an array of one (1) item to be sorted.  Then begin calling the
     * merge(int, int, int) method to merge the sorted sub-arrays.
     *
     * @param left the index of the left-most element in the array or sub-array
     * @param right the index of the right-most element in the array or sub-array
     */
    public static void mergeSort(int left, int right)
    {
        // Stop when base case is reached
        if ( (right - left + 1) > 1)
        {
            int middle = (left + right) / 2;

            mergeSort(left, middle);
            mergeSort(middle + 1, right);

            merge(left, middle, right);
        }
    }

    /**
     * Merge the two sub-arrays into a single sorted array.  The left and right lists
     * are merged in ascending sequence.  When either the left or right list is completed,
     * finish the process by copying the rest of the other list to the merged array.
     * At the end copy the temp list to the permanent array.
     *
     * @param left the index of the left-most element in the left array or sub-array
     * @param middle the index of the right-most element in the left array or sub-array
              (the index of the left-most element in the right array or sub-array is middle + 1)
     * @param right the index of the right-most element in the right array or sub-array
     */
    private static void merge(int left, int middle, int right)
    {
        int leftIndex = left;
        int rightIndex = middle + 1;
        int tempIndex = left;
        int[] temp = new int[items.length];

        // Merge left and right lists in sequential order
        while (leftIndex <= middle && rightIndex <= right)
        {
            if ( items[leftIndex] <= items[rightIndex] )
            {
                temp[tempIndex++] = items[leftIndex++];
            }
            else
            {
                temp[tempIndex++] = items[rightIndex++];
            }
        }

        // If left list is complete and right list is not,
        // finish merging right elements
        if (leftIndex == middle + 1)
        {
            while (rightIndex <= right)
            {
                temp[tempIndex++] = items[rightIndex++];
            }
        }

        // If right list is complete and left list is not,
        // finish merging left elements
        else
        {
            while (leftIndex <= middle)
            {
                temp[tempIndex++] = items[leftIndex++];
            }
        }

        // Copy elements of the temp array back into the array
        for (int index = left; index <= right; index++)
        {
            items[index] = temp[index];
        }
    }

    /**
     * Prints the list of integer items in the array to the console.
     */
    public static void showAll()
    {
        for (int value : items)
        {
            System.out.print(value);
            System.out.print(" ");
        }

        System.out.println("\n");
    }
}
