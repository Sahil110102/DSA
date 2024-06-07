import java.util.ArrayList;

public class ReversePair {
    private static void merge(int[] nums, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary numsay
        int left = low;      // starting index of left half of nums
        int right = mid + 1;   // starting index of right half of nums

        //storing elements in the temporary numsay in a sorted manner//

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(nums[right]);
            right++;
        }

        // transfering all elements from temporary to nums //
        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }
    }

    public static int countPairs(int[] nums, int low, int mid, int high) {
        int right = mid + 1;
        int cnt = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && nums[i] > 2 * nums[right]) right++;
            cnt += (right - (mid + 1));
        }
        return cnt;
    }

    public static int mergeSort(int[] nums, int low, int high) {
        int cnt = 0;
        if (low >= high) return cnt;
        int mid = (low + high) / 2 ;
        cnt += mergeSort(nums, low, mid);  // left half
        cnt += mergeSort(nums, mid + 1, high); // right half
        cnt += countPairs(nums, low, mid, high); //Modification
        merge(nums, low, mid, high);  // merging sorted halves
        return cnt;
    }

    public static int team(int[] skill, int n) {
        return mergeSort(skill, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] a = {4, 1, 2, 3, 1};
        int n = 5;
        int cnt = team(a, n);
        System.out.println("The number of reverse pair is: " + cnt);
    }
}
