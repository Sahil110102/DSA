// import java.util.HashMap;
// import java.util.*;

// public class LongSubArr {
    // Longest Subarray with given Sum K(Positives)

// ======================================================================== 1 ==========================================================================
// Brute Force Approach 1 :
// The steps are as follows:
// 1- First, we will run a loop(say i) that will select every possible starting index of the subarray. 
// The possible starting indices can vary from index 0 to index n-1(n = size of the array).
// 2- Inside the loop, we will run another loop(say j) that will signify the ending index of the subarray. 
// For every subarray starting from the index i, the possible ending index can vary from index i to n-1(n = size of the array).
// 3- After that for each subarray starting from index i and ending at index j (i.e. arr[i….j]), 
// we will run another loop to calculate the sum of all the elements(of that particular subarray).
// 4- -If the sum is equal to k, we will consider its length i.e. (j-i+1). Among all such subarrays, we will consider the maximum length by comparing all the lengths.
    // public static int longestSubArray(int[] arr, long k){
    //     int n = arr.length;
    //     int len = 0 ;
    //     for(int i= 0; i<n; i++){ //Starting Index
    //         for(int j = i; j<n; j++){ //Ending Index
    //             //now add all the elements of subarray 
    //             //subArray = arr[i...j]
    //             long sum = 0;
    //             for(int l= i; l<=j; l++){
    //                 sum = sum + arr[l];
    //             }
    //             if(sum == k){
    //                 len = Math.max(len, j-i+1);
    //             }
    //         }
    //     }
    //     return len;
    // }
    // public static void main(String[] args) {
    //     int arr[] = {1, 4, 5, 7, 1, 1, 1, 3, 5 , 7};
    //     long k = 3;
    //     int len = longestSubArray(arr, k );
    //     System.out.println("The Length of Longest SubArray is = "+ len);     
    // }

// ======================================================================== 2 ==========================================================================
//Brute Force Approach 2- 
// Optimizing the Naive Approach (Using two loops): 
// The steps are as follows:
// 1- First, we will run a loop(say i) that will select every possible starting index of the subarray. 
// The possible starting indices can vary from index 0 to index n-1(n = array size).
// 2- Inside the loop, we will run another loop(say j) that will signify the ending index as well as the current element of the subarray. 
// For every subarray starting from the index i, the possible ending index can vary from index i to n-1(n = size of the array).
// 3- Inside loop j, we will add the current element to the sum of the previous subarray i.e. sum = sum + arr[j]. 
// 4- If the sum is equal to k, we will consider its length i.e. (j-i+1). Among all such subarrays with sum k, 
// we will consider the one with the maximum length by comparing all the lengths.
    // public static int longestSubArray(int[] arr, long k){
    //     int n = arr.length;
    //     int len = 0;
    //     for(int i = 0; i<n; i++){
    //         int sum = 0;
    //         for(int j=i; j<n; j++){
    //             sum += arr[j];
    //             if(sum == k){
    //                 len = Math.max(len, j-i+1);
    //             }
    //         }         
    //     }
    //     return len;
    // }
    // public static void main(String[] args) {
    //     int arr[] = {1, 4, 5, 7, 1, 1, 1, 3, 5 , 7};
    //     long k = 10;
    //     int len = longestSubArray(arr, k);
    //     System.out.println("The Length of Longest SubArray is = "+ len);         
    // }

// ======================================================================== 3 ==========================================================================
    // Better Approach 3 - Using HashMap
    // public static int longestSubArray(int [] arr,long k){
    //     int n = arr.length;
    //     Map <Long, Integer> preSumMap = new HashMap <>();
    //     long sum = 0;
    //     int maxLen = 0;
    //     for(int i=0; i<n; i++){
    //         // Calculate the prefix sum till index i
    //          sum += arr[i];
    //         // if sum = k , update the maxLen
    //          if (sum == k){
    //             maxLen = Math.max(maxLen, i+1);
    //          }
    //         //  Calculate the sum of remaining part i.e x-k
    //          long rem = sum - k;
    //         //  Calculate the length and update maxLen
    //          if(preSumMap.containsKey(rem)){
    //             int len = i-preSumMap.get(rem);
    //             maxLen = Math.max(maxLen, len);
    //          }
    //         //   fimally Update the map checking the conditions
    //          if(!preSumMap.containsKey(sum)){
    //             preSumMap.put(sum,i);
    //          }
    //     }
    //     return maxLen;
    // }
    // public static void main(String[] args) {
    //         int arr[] = {1, 4, 5, 7, 1, 1, 1, 3, 5 , 7};
    //         long k = 10;
    //         int len = longestSubArray(arr, k);
    //         System.out.println("The Length of Longest SubArray is = "+ len);             
    //     }

// ======================================================================== 4 ======================================================================
//         public static int longestSubArray(int [] arr,long k){
//             int n = arr.length;
//             int left = 0; int right = 0;
//             int sum = arr[0];
//             int maxLen = 0;
//             while (right < n) {
//                 while (sum > k && left <= right) {
//                     sum -= arr[left];
//                     left++; 
//                 }                
//                 if (sum == k ) {
//                     maxLen = Math.max(maxLen, right - left + 1) ;                 
//                 }
//                 right ++;
//                 if (right < n) {
//                     sum += arr[right];                   
//                 }
//             }
//             return maxLen;
//         }
//         public static void main(String[] args) {
//             int arr[] = {1, 4, 5, 7, 1, 1, 1, 3, 5 , 7};
//             long k = 19 ;
//             int len = longestSubArray(arr, k);
//             System.out.println("The Length of Longest SubArray is = "+ len);          
//         }

// }
