import java.util.ArrayList;

public class mergeSort {

    public static void mergeS(int arr[], int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= right && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;

            } else {
                temp.add(arr[right]);
                right++; 
            }
        }
        while (left <= mid) {

            temp.add(arr[left]);
            left++;

        }
        while (right <= high) {

            temp.add(arr[right]);
            right++;
        }
        for(int i= low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }

    }

    public static void mS(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;

        mS(arr, low, mid);
        mS(arr, mid + 1, high);
        mergeS(arr, low, mid, high);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 8, 3, 9, 4 };
        int n = arr.length;

        System.out.println("Before Sorting");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
        mS(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
