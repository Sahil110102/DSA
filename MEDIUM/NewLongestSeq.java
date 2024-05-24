
// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.Set;
public class NewLongestSeq {


//     // Brute Force Approach  - By travesing and then comparing  
//     // public static boolean linearSearch(int nums[], int num )
//     // {
//     //     int n = nums.length;
//     //     for(int i=0; i<n; i++){
//     //         if (nums[i]==num) {
//     //             return true;
//     //         }
//     //     }
//     //     return false;
//     // }
//     // public static int longestConsecutiveSequence(int nums []){
//     //     int n = nums.length;
//     //     int longest = 1;
//     //     for(int i=0 ; i<n ; i++){
//     //         int count = 1;
//     //         int x = nums[i];
//     //         while (linearSearch(nums, x+1)==true) 
//     //         {
//     //             x +=1;
//     //             count ++;    
//     //         }
//     //         longest = Math.max(count, longest);
//     //     }
//     //     return longest;
//     // }
//     // public static void main(String[] args) {
//     //     int nums[] = {400, 4, 200, 3, 2, 1};
//     //     int ans = longestConsecutiveSequence(nums);
//     //     System.out.println("The longest Consecutive Sequence is : " + ans);
//     //    }
    
//     //Better Approach - by sorting and then traversing the numsay 

// //     public static int longestConsecutiveSequence(int nums []){
// //         int n = nums.length;
// //         if (n == 0) return 0;
// //         Arrays.sort(nums);
// // // 
// // // 
// //         int longest = 1;
// //         int lastSmall = Integer.MIN_VALUE;
// //         int count = 0;

// //         for(int i=0 ; i<n ; i++){
// //             if(nums[i] - 1 == lastSmall){
// //                 count += 1;
// //                 lastSmall = nums[i];
// //             }
// //             else if (nums[i] != lastSmall){
// //                 count = 1;
// //                 lastSmall = nums[i];
// //             }
// //             longest = Math.max(count, longest);
// //         }
// //         return longest;
// //     }
// //     public static void main(String[] args) {
// //         int nums[] = {400, 4, 200, 3, 2, 1};
// // // 
// //         int ans = longestConsecutiveSequence(nums);
// //         System.out.println("The longest Consecutive Sequence is : " + ans);
// //        }

// public static int longestConsecutiveSequence(int nums []){
//     int n = nums.length;
//     if (n == 0) return 0;
    
//     int longest = 1;

//     Set<Integer> set = new HashSet<>();

//     for (int i = 0; i < n; i++) {
//         set.add(nums[i]);
//     }

//     for(int it : set){
//         if (!set.contains(it - 1)) {
//             int count = 1;
//             int x = it;

//             while (set.contains(x + 1)) {
//                 count += 1;
//                 x = x + 1;
//             }
//             longest = Math.max(count, longest);
//         }
//     }
//     return longest;
// }
// public static void main(String[] args) {
//     int nums[] = {400, 4, 200, 3, 2, 1};
// // 
//     int ans = longestConsecutiveSequence(nums);
//     System.out.println("The longest Consecutive Sequence is : " + ans);
//    }
    

}