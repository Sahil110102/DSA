// import java.util.HashMap;
// import java.util.Map;

/**
 * MajorityEle
 */
public class MajorityEle {

    //Brute Force Approach
    // public static int MajorityElement(int arr[]){
    //     int n = arr.length;
    //     for(int i=0; i<n; i++){
    //         int count = 0;
    //         for(int j=0; j<n; j++){
    //             if(arr[i]== arr[j]){
    //                 count++;
    //             }
    //         }
    //         if(count > n/2){
    //             return arr[i];         
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String[] args) {
    //     int arr [] = { 2, 2, 2, 2, 1, 1, 1};     
    //     int ans = MajorityElement(arr);
    //     System.out.println("Majprity Element is : " + ans);
    // }

    //Better Approach
    // public static int MajorityElement(int arr[]){ 
    //     int n = arr.length; 
    //     HashMap <Integer, Integer> mpp = new HashMap<>();
    //     for(int i = 0; i < n; i++){
    //         int value = mpp.getOrDefault(arr[i], 0);
    //         mpp.put(arr[i], value + 1);
    //     }
    //     for (Map.Entry<Integer, Integer> it : mpp.entrySet()){
    //         if (it.getValue() > (n/2)){
    //             return it.getKey();
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String[] args) {
    //     int arr [] = { 2, 2, 2, 2, 1, 1, 1};     
    //     int ans = MajorityElement(arr);
    //     System.out.println("Majprity Element is : " + ans);
    // }

    //Optimal Solution 
    public static int MajorityElement(int arr[]){ 
        int n = arr.length;
        int count = 0;
        int el = 0; ;     
        for(int i=0; i<n; i++){

            if(count == 0){
                count = 1;
                el = arr[i];
            }
            else if (el == arr[i]) {
                count ++   ;  
            }
            else{
                count  --;
            }
        }
        int count1 = 0;
        for(int i = 0; i < n; i++){
            if (arr[i] == el) {
                count1 ++;      
            }
        }
        if(count1 > (n/2)){
            return el;
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr [] = { 2, 2, 2, 2, 1, 1, 1};     
        int ans = MajorityElement(arr);
        System.out.println("Majority Element is : " + ans);
    }


}