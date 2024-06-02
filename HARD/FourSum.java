import java.util.*;
public class FourSum {

    //Brute Force Approach
    // public static List<List<Integer>> quadralets(int arr[], int target){        
    //     int n = arr.length;
    //     Set<List<Integer>> set = new HashSet<>();
    //     for(int i=0 ; i<n ; i++){
    //         for (int j = i+1; j < n; j++) {
    //             for (int k = j+1; k < n; k++) {
    //                 for(int l = k+1; l < n; l++){
    //                     long sum =  arr[i] + arr[j] + arr[k] + arr[l];
    //                     // sum += arr[k] ;
    //                     // sum += arr[l];
    //                     if (sum == target) {
    //                         List<Integer> temp = Arrays.asList(arr[i] , arr[j] , arr[k] , arr[l]);
    //                         Collections.sort(temp);
    //                         set.add(temp);
    //                     }
    //                 }                
    //             }      
    //         }
    //     }
    //     List<List<Integer>> ans = new ArrayList<>(set);
    //     return ans;
    // }
    
    //Better Approach
    // public static List<List<Integer>> quadralets (int[] arr , int target){
    //     int n = arr.length; // size of the array
    //     Set<List<Integer>> st = new HashSet<>();
    //     // checking all possible quadruplets:
    //     for (int i = 0; i < n; i++) {
    //         for (int j = i + 1; j < n; j++) {
    //             Set<Long> hashset = new HashSet<>();
    //             for (int k = j + 1; k < n; k++) {
    //                 // taking bigger data type
    //                 // to avoid integer overflow:
    //                 long sum = arr[i] + arr[j];
    //                 sum += arr[k];
    //                 long fourth = target - sum;
    //                 if (hashset.contains(fourth)) {
    //                     List<Integer> temp = new ArrayList<>();
    //                     temp.add(arr[i]);
    //                     temp.add(arr[j]);
    //                     temp.add(arr[k]);
    //                     temp.add((int) fourth);
    //                     temp.sort(Integer::compareTo);
    //                     st.add(temp);
    //                 }
    //                 // put the kth element into the hashset:
    //                 hashset.add((long) arr[k]);
    //             }
    //         }
    //     }
    //     List<List<Integer>> ans = new ArrayList<>(st);
    //     return ans;
    // }

    //Optimal Approach
    public static List<List<Integer>> quadralets(int []arr, int target){
        int n = arr.length; // size of the array
        List<List<Integer>> ans = new ArrayList<>();

        // sort the given array:
        Arrays.sort(arr);

        // calculating the quadruplets:
        for (int i = 0; i < n; i++) {
            // avoid the duplicates while moving i:
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            for (int j = i + 1; j < n; j++) {
                // avoid the duplicates while moving j:
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;

                // 2 pointers:
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = arr[i];
                    sum += arr[j];
                    sum += arr[k];
                    sum += arr[l];
                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);
                        ans.add(temp);
                        k++;
                        l--;

                        // skip the duplicates:
                        while (k < l && arr[k] == arr[k - 1]) k++;
                        while (k < l && arr[l] == arr[l + 1]) l--;
                    } else if (sum < target) k++;
                    else l--;
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;
        List<List<Integer>> ans = quadralets(arr, target);
        System.out.println("The quadruplets are: ");
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
