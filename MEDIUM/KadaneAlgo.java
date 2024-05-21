public class KadaneAlgo {

// Tp Find The Maximun SubArray 

//Brute Force - Using Three Loops
//     public static int MaxSum(int arr[], int n){
//         int maxi = Integer.MIN_VALUE;
//         for(int i=0; i<n; i++){
//             for(int j=i; j<n; j++){
//                 int sum = 0;
//                 for(int k=i; k<=j; k++){
//                     sum += arr[k];
//                 }
//                 maxi = Math.max(maxi, sum);
//             }
//         }
//         return maxi;
//     }
//     public static void main(String[] args) {
//         int arr [] = { 2,-3, 4, 6 ,7 , -2};
//         int n = arr.length;
//         int maxSum = MaxSum(arr, n);
//         System.out.println("The Maximum Subarray is : " + maxSum);
// }

//Brute Force - Using Two Loops
// public static int MaxSum(int arr[], int n){
//     int maxi = Integer.MIN_VALUE;
//     for(int i=0; i<n; i++){
//         int sum = 0;
//         for(int j=i; j<n; j++){
//             sum += arr[j];
//             maxi = Math.max(maxi, sum);
//         }
//     }
//     return maxi;
// }
// public static void main(String[] args) {
//     int arr [] = { 2,-3, 4, 6 ,7 , -2};
//     int n = arr.length;
//     int maxSum = MaxSum(arr, n);
//     System.out.println("The Maximum Subarray is : " + maxSum);
// }

public static int MaxSum(int arr[], int n){
    int maxi = Integer.MIN_VALUE;
    
    int sum = 0;
    for(int i=0; i<n; i++){
        sum += arr[i];
        if (sum < 0) {
            sum = 0;
        }
        else if(sum > maxi)
        maxi = sum;
    }
    return maxi;
}
public static void main(String[] args) {
    int arr [] = { 2,-3, 4, 6 ,7 , -2};
    int n = arr.length;
    int maxSum = MaxSum(arr, n);
    System.out.println("The Maximum Subarray is : " + maxSum);
}


}