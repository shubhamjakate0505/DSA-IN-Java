import java.util.*;

public class QuickSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        // Base case
        if (si >= ei) {
            return;
        }
        
        // Partition the array and get the pivot index
        int idx = partition(arr, si, ei);
        
        // Recursive calls
        quickSort(arr, si, idx - 1); // Left part
        quickSort(arr, idx + 1, ei); // Right part
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // To make place for the smaller element than pivot

        for (int j = si; j < ei; j++) { // Start the loop from si
            if (arr[j] <= pivot) {
                i++;
                // Swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        
        // Place the pivot element in the correct position
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
