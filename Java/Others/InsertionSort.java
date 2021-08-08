import java.util.*;

public class InsertionSort {
    
    static int[] Insertion_sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int cur = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > cur) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = cur;
        }
        return arr;
    }
    
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int j = 0; j < n; j++) {
            System.out.printf("Element at index %d is %d\n", j, arr[j]);
        }
        System.out.println("-----------------------------");
    }

    @SuppressWarnings("unused")
    static void search(int[] arr, int element_to_search) {
        int n = arr.length;
        boolean flag;
        for (int k = 0; k < n; k++) {
            if (arr[k] == element_to_search) {
                System.out.printf("Element found at index %d\n", k);
                flag = true;
            }
        }
        if (flag = false) {
            System.out.println("Element not found.\n");
        }
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        printArray(arr);
        
        System.out.print("Enter an element to search :");
        int element_to_search = scan.nextInt();
        search(arr, element_to_search);
        int[] sorted_arr = new int[n];
        sorted_arr = Insertion_sort(arr);
        System.out.println("Sorted Array :- ");
        printArray(sorted_arr);
        scan.close(); 
    }
}