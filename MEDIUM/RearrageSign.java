import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RearrageSign {

    // public static int [] Rearrage(int arr[], int n){
    //     // Create Array POS and Neg
    //     ArrayList<Integer> pos = new ArrayList<>();
    //     ArrayList<Integer> neg = new ArrayList<>();
    //     // segregate them to pos and neg
    //     for(int i =0; i<n ; i++){
    //         if(arr[i] > 0){
    //             pos.add(arr[i]);
    //         }
    //         else neg.add(arr[i]);
    //     }
    //     //put them back into right indexes
    //     for(int i = 0; i < n/2; i++){
    //         arr[2*i] = pos.get(i);
    //         arr[2*i+1] = neg.get(i);
    //     }
    //     return arr;
    // }
    // public static void main(String[] args) {
    //     int arr[] = { 4 , 5, -4, -8, 9, -7};
    //     int n = 6;
    //     int [] ans = Rearrage(arr , n);
    //     for(int i=0; i<n ; i++){
    //         System.out.print(ans[i]+ " ");
    //     }
    // }

    public static ArrayList <Integer> Rearrage(ArrayList <Integer>arr){
        int n = arr.size();

        // Create Array Ans  - Collection stores n number of Zeros.
        ArrayList <Integer> ans = new ArrayList<>(Collections.nCopies(n, 0)) ;
        
        int pos = 0; 
        int neg = 1;
        for(int i =0; i<n ; i++){
            if(arr.get(i)>0){
                ans.set(pos, arr.get(i));
                pos += 2;
            }
            else{
                ans.set(neg, arr.get(i));
                neg +=2;
            }

        }
        return ans;
       

    }
    public static void main(String[] args) {
        // Array Initialization.
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, -4, -5));
        ArrayList<Integer> ans = Rearrage(arr);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}


// Variety 2 - If the array size is not same .
// public class Main {
//     public static void main(String[] args) {
//         // Array Initialization
//         int n = 6;
//         ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, -5, 3, 4));
//         ArrayList<Integer> ans = RearrangebySign(A, n);
//         for (int i = 0; i < ans.size(); i++) {
//             System.out.print(ans.get(i) + " ");
//         }
//     }
//     public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A, int n) {
//         // Define 2 ArrayLists, one for storing positive 
//         // and other for negative elements of the array.
//         ArrayList<Integer> pos = new ArrayList<>();
//         ArrayList<Integer> neg = new ArrayList<>();
//         // Segregate the array into positives and negatives.
//         for (int i = 0; i < n; i++) {
//             if (A.get(i) > 0)
//                 pos.add(A.get(i));
//             else
//                 neg.add(A.get(i));
//         }
//         // If positives are lesser than the negatives.
//         if (pos.size() < neg.size()) {
//             // First, fill array alternatively till the point 
//             // where positives and negatives are equal in number.
//             for (int i = 0; i < pos.size(); i++) {
//                 A.set(2 * i, pos.get(i));
//                 A.set(2 * i + 1, neg.get(i));
//             }
//             // Fill the remaining negatives at the end of the array.
//             int index = pos.size() * 2;
//             for (int i = pos.size(); i < neg.size(); i++) {
//                 A.set(index, neg.get(i));
//                 index++;
//             }
//         }
//         // If negatives are lesser than the positives.
//         else {
//             // First, fill array alternatively till the point 
//             // where positives and negatives are equal in number.
//             for (int i = 0; i < neg.size(); i++) {
//                 A.set(2 * i, pos.get(i));
//                 A.set(2 * i + 1, neg.get(i));
//             }
//             // Fill the remaining positives at the end of the array.
//             int index = neg.size() * 2;
//             for (int i = neg.size(); i < pos.size(); i++) {
//                 A.set(index, pos.get(i));
//                 index++;
//             }
//         }
//         return A;
//     }
// }