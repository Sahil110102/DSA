public class InsertionSort {
    public static void bubble_sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {

            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;

                j--;
            }

        }
        System.out.println("After Sorting");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");

    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 8, 3, 9, 4 };
        int n = arr.length;

        System.out.println("Before Sorting");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
        bubble_sort(arr, n);
    }
}
