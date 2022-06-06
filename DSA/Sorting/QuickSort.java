/**
 * QuickSort
 */
public class QuickSort {

    /**
     * Partation of array small and high
     * 
     * @param arr  Orignal array
     * @param low  Starting idx
     * @param high Ending idx
     * @return
     */

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i; // pivot index
    }

    /**
     * Sorting low to high
     * 
     * @param arr  orignal array
     * @param low  first idx
     * @param high Ending idx
     */

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);

            quickSort(arr, low, pidx - 1);
            quickSort(arr, pidx + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}