/**
 * MergeSort
 */
public class MergeSort {

    /**
     * Merge the divided all elements in arr
     * 
     * @param arr Original arr
     * @param si  starting index
     * @param mid int mid = si + (ei - si) / 2; Starting index + (ending index -
     *            starting index) / 2
     * @param ei  Ending index
     */

    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1]; // Creating new arr for storing elements

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    /**
     * Dividing orignal arr into small parts
     * 
     * @param arr original arr
     * @param si  Starting index
     * @param ei  Ending index
     */

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = { 15, 5, 20, 10, 25, 40, 30 };
        int n = arr.length;

        divide(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}