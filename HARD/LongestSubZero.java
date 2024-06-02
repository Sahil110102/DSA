import java.util.HashMap;

/**
 * LongestSubZero
 */
public class LongestSubZero {

//Brute Force - 
// public static int solve(int[] a){
//    int  max = 0;
// 	for(int i = 0; i < a.length; ++i){
// 		int sum = 0;
// 		for(int j = i; j < a.length; ++j){
// 			sum += a[j];
// 			if(sum == 0){
// 				max = Math.max(max, j-i+1);
// 			}
// 		}
// 	}
// 	return max;
//    }

//Optimal approach - Using Hashing
   public static int solve(int arr[], int n){
    HashMap <Integer, Integer> mpp = new HashMap<>();
    int sum = 0;
    int maxi = 0;
	for(int i = 0; i < n; ++i){
	    sum += arr[i];
	    
	    if(sum == 0){
	        maxi = i + 1;
	    }
	    else{
	        if (mpp.get(sum) != null){
	            maxi = Math.max(maxi , i - mpp.get(sum) );
	        }
	        else{
	        mpp.put(sum , i);
	        }
	    }
	    
		
	}
	return maxi;
   }

    public static void main(String args[]) 
    { 
        int arr[] = {9, -3, 3, -1, 6, -5};
        int n = 6;
        System.out.println(solve(arr,n));
    }  
    
}
