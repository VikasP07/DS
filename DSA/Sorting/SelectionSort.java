/**
 * SelectionSort
 */
public class SelectionSort {

    public static void printing(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 15, 5, 20, 10, 25, 40, 30, 35 };

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i; // Small element index
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        printing(arr);
    }
}