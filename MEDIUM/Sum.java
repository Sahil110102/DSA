// import java.util.Arrays;
// import java.util.HashMap;
// public class Sum {

// Two Sum Varient 1 (returning YES or NO) - Brute Force | TC = O(n^2) | SC = O(1) |
//     public static String calclateTwoSum(int arr[], int n , int target){
//         for(int i=0; i<n; i++){
//             for (int j = i+1; j < n; j++) {
//                 if(arr[i] + arr[j]== target){
//                     return "YES";
//                 }
//             }
//         }
//         return "NO";
//     }
//     public static void main(String[] args) {
//         int arr[] = {4, 6, 3, 8, 9, 2 , 5};
//         int n = 7;
//         int target = 17;
//         String ans = calclateTwoSum(arr, n, target);
//         System.out.println("The sum of two sum = "+ ans);
//     }

// Two Sum Varient 2 (returning the indexes) - Brute Force  | TC = O(n^2) | SC = O(1) |
// public static int [ ] calclateTwoSum(int arr [],int n, int target ){
//     int ans [] = new int[2];
//     ans[0] = ans[1]= 0;
//     for(int i=0; i<n; i++){
//         for(int j=i+1; j<n; j++){
//             if(arr[i]+arr[j] == target){
//                 ans[0] = i;
//                 ans[1] = j;
//                 return ans;
//             }
//         }
//     }
//     return ans;
// }
// public static void main(String[] args) {
//     int arr[] = {4, 6, 3, 8, 9, 2 , 5};
//         int n = 7;
//         int target = 17;
//         int [] ans = calclateTwoSum(arr, n, target);
//         System.out.println("The sum of two sum = "+ ans[0] +" , "+ ans[1]);
// }



// Two Sum Varient 1 (returning the YES or NO) - Better Approach  | TC = O(N) | SC = O(N) |
// public static String calclateTwoSum(int [] arr, int n , int target){
//     HashMap<Integer , Integer> mpp = new HashMap<>();
//     for(int i=0; i<n; i++){
//         int num = arr[i];
//         int moreNum = target - num;
//         if(mpp.containsKey(moreNum)){
//             return "YES";
//         }
//         mpp.put(arr[i], i);
//     }
//     return "NO";
// }
// public static void main(String[] args) {
//         int arr[] = {4, 6, 3, 8, 9, 2 , 5};
//         int n = 7;
//         int target = 17;
//         String ans = calclateTwoSum(arr, n, target);
//         System.out.println("The sum of two sum = "+ ans);
// }

// Two Sum Varient 2 (returning the indexes) - Better Approach  | TC = O(N) | SC = O(N) |
// public static int [] calclateTwoSum(int [] arr, int n , int target){
//     int [] ans = new int[2];
//     ans[0] = ans [1] = 0;
//     HashMap<Integer , Integer> mpp = new HashMap<>();
//     for(int i=0; i<n; i++){
//         int num = arr[i];
//         int moreNum = target - num;
//         if(mpp.containsKey(moreNum)){
//             ans[0] = mpp.get(moreNum);
//             ans[1] = i;
//             return ans;
//         }
//         mpp.put(arr[i], i);
//     }
//     return ans;
// }
// public static void main(String[] args) {
//         int arr[] = {4, 6, 3, 8, 9, 2 , 5};
//         int n = 7;
//         int target = 17;
//         int [] ans = calclateTwoSum(arr, n, target);
//         System.out.println("The sum of two sum = "+"["+ ans[0]+" , "+ans[1]+"]");
// }



//Two Sum Varient 1 (returning the YES or NO) - Optimal Approach  | TC = O(N) + O(N*logN) | SC = O(1) |
// public static String calculateTwoSum (int[] arr, int n , int target){
//     Arrays.sort(arr);
//     int left = 0; int right = n-1;
//     while (left < right) {
//         int sum = arr[left] + arr[right];
//         if (sum == target){
//             return "YES";
//         }
//         else if (sum < target){
//             left ++;
//         }
//         else{
//             right--;
//         }
//     }
//     return"NO";
// }
// public static void main(String[] args) {
//     int arr[] = {4, 6, 3, 8, 9, 2 , 5};
//     int n = 7;
//     int target = 17;
//     String ans = calculateTwoSum(arr, n, target);
//     System.out.println("The sum of two sum = "+ ans);
// }

//Two Sum Varient 2 (returning the indexes) - Brute Force  | TC = O(N) + O(N*logN) | SC = O(1) |
// public static int [] calculateTwoSum(int [] arr, int n , int target){
//     int ans[] = new int[2];
//     ans[0] = ans[1] = 0;
//     Arrays.sort(arr);
//     int left = 0; int right = n-1;
//     while (left < right) {
//         int sum = arr[left] + arr[right];
//         if(sum == target){
//             ans[0] = left;
//             ans[1] = right; 
//             return ans;        
//         }
//         else if(sum < target){
//             left ++;            
//         }
//         else {
//             right --;
//         }
//     }
//     return ans;
// }
// public static void main(String[] args) {
//             int arr[] = {4, 6, 3, 8, 9, 2 , 5};
//             int n = 7;
//             int target = 17;
//             int [] ans = calculateTwoSum(arr, n, target);
//             System.out.println("The sum of two sum = "+"["+ ans[0]+" , "+ans[1]+"]");
//     }

// }

// git init
// git add README.md
// git commit -m "first commit"
// git branch -M main
// git remote add origin https://github.com/Sahil110102/DSA.git
// git push -u origin main