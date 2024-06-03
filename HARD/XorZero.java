import java.util.HashMap;
import java.util.Map;


public class XorZero {
    
    //Brute Force Approach - Using Three Loops to generate all the subarrays
    // public static int subarraysWithXorK(int []arr, int k) {
    //     int n = arr.length; //size of the given array.
    //     int cnt = 0;
    //     // Step 1: Generating subarrays:
    //     for (int i = 0; i < n; i++) {
    //         for (int j = i; j < n; j++) {
    //             //step 2:calculate XOR of all
    //             // elements:
    //             int xorr = 0;
    //             for (int K = i; K <= j; K++) {
    //                 xorr = xorr ^ arr[K];
    //             }
    //             // step 3:check XOR and count:
    //             if (xorr == k) cnt++;
    //         }
    //     }
    //     return cnt;
    // }

    //Better Approach  - Using Two Loops 
    // public static int subarraysWithXorK(int []arr, int k) {
    //     int n = arr.length; //size of the given array.
    //     int cnt = 0;
    //     // Step 1: Generating subarrays:
    //     for (int i = 0; i < n; i++) {
    //         int xorr = 0;
    //         for (int j = i; j < n; j++) {
    //             //step 2:calculate XOR of all
    //             // elements:
    //             xorr = xorr ^ arr[j];
    //             // step 3:check XOR and count:
    //             if (xorr == k) cnt++;
    //         }
    //     }
    //     return cnt;
    // }

    // Optimal Approach - Using Hashing
    public static int subarraysWithXorK(int arr[], int k){
        int n = arr.length;
        int xr = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(xr, 1);
        int count = 0;
        for(int i=0; i<n; i++){           
            xr = xr ^ arr[i];
            int x = xr ^ k;
            if(mpp.containsKey(x)){
                count += mpp.get(x);
            }
            if(mpp.containsKey(xr)){
                mpp.put(xr, mpp.get(xr)+1);
            }
            else{
                mpp.put(xr, 1);
            } 
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        int ans = subarraysWithXorK(arr, k);
        System.out.println("The number of subarrays with XOR k is: " + ans);
    }
}
