import java.util.ArrayList;
import java.util.Collections;

public class LeaderEle {

//     public static ArrayList<Integer> leaderArray(int [] arr, int n ){
//         ArrayList<Integer> ans = new ArrayList<>();
//         for(int i=0; i<n; i++){
//             boolean leader = true;
//             for(int j=i+1; j<n; j++){
//                 if (arr[j]>arr[i]) {
//                     leader = false;
//                     break;
//                 }
//             }
//             if (leader == true) {
//                 ans.add(arr[i]);
            
//             }
//         }    
//         return ans;
//     }
//     public static void main(String[] args) {
//         int arr [] = {10, 22, 12, 3, 0, 6};
//         int n = 6;
//         ArrayList<Integer> ans = leaderArray(arr,n); 
//         for(int i=0; i<ans.size() ; i++){
//             System.out.print(ans.get(i) + " ");
//         }
//     }


public static ArrayList<Integer> leaderArray(int [] arr, int n ){
    ArrayList<Integer> ans = new ArrayList<>();
    int max = arr.length-1;
    ans.add(arr [n-1]);

    for(int i=n-2; i>0 ; i--){
        if(arr[i]>max){
            ans.add(arr[i]);
            max = arr[i];
        }
    }
    return ans;
}
public static void main(String[] args) {
    int arr [] = {10, 22, 12, 3, 0, 6};
    int n = 6;
    ArrayList<Integer> ans = leaderArray(arr,n); 

    Collections.sort(ans, Collections.reverseOrder());
    for(int i=0; i<ans.size() ; i++){
        System.out.print(ans.get(i) + " ");
    }
}
}
