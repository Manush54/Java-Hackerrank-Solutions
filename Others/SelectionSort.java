import java.util.*;
public class SelectionSort {
    static void selectionSort(int[] arr) {

        // Running a loop for all the elements in unsorted array.
        for (int i = 0; i < arr.length - 1; i++) {

            int min = i; // Initializing min with the first value in unsorted_array.

            // Finding minimum element in the unsorted array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // Swapping the found minimum element with the first element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int a = 0; a < arr.length; a++) {
            System.out.printf("%d ", arr[a]);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        selectionSort(array);
        scan.close();
    }
}
