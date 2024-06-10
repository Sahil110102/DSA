public class MaxProdSubArr {


    //Brute Force 
    // public static int maxProductSubArray (int [] arr){
    //     int n = arr.length;
    //     int result = Integer.MIN_VALUE;
    //     for(int i=0; i<n; i++){
    //         for(int j=i ;j<n; j++){
    //             int prod = 1;
    //             for(int k=i ;k<=j ;k++){
    //                 prod = prod *arr[k];
    //                 result = Math.max(result, prod);
    //             }               
    //         }
    //     }
    //     return result;
    // }  
    // public static void main(String[] args) {
    //     int[] arr = {1, 2, -3, 0, -4, -5};
    //     int answer = maxProductSubArray(arr);
    //     System.out.println("The maximum product subarray is: " + answer);
    // }

    //Better Approach
    // public static int maxProductSubArray (int [] arr){
    //     int n = arr.length;
    //     int result = Integer.MIN_VALUE;
    //     for(int i=0; i<n; i++){
    //         int prod = 1;
    //         for(int j=i ;j<n; j++){
    //             prod = prod *arr[j];
    //                 result = Math.max(result, prod);                           
    //         }
    //     }
    //     return result;
    // }  
    // public static void main(String[] args) {
    //     int[] arr = {1, 2, -3, 0, -4, -5};
    //     int answer = maxProductSubArray(arr);
    //     System.out.println("The maximum product subarray is: " + answer);
    // }

    //Optimal Approach

    public static int maxProductSubArray (int [] arr){

        int n = arr.length; 
        int pre = 1, suff = 1;
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(pre == 0) pre = 1;
            if (suff == 0) suff = 1;

            pre *= arr[i];
            suff *= arr[n-i-1];
      
            result = Math.max(result, Math.max(pre, suff));  
        }
        return result;

        
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 0, -4, -5};
        int answer = maxProductSubArray(arr);
        System.out.println("The maximum product subarray is: " + answer);
    }
}
