import java.util.ArrayList;
import java.util.List;

/**
 * PascalTriangle
 */
public class PascalTriangle {

    //Variation 1 - Find the element 
    // public static long nCr(int r, int c) {
    //     long res = 1;
    //     // calculating nCr:
    //     for (int i = 0; i < c; i++) {
    //         res = res * (r - i);
    //         res = res / (i + 1);
    //     }
    //     return res;
    // }
    // public static int pascalTriangle(int r, int c) {
    //     int element = (int) nCr(r - 1, c - 1);
    //     return element;
    // }
    // public static void main(String[] args) {
    //     int r = 5; // row number
    //     int c = 3; // col number
    //     int element = pascalTriangle(r, c);
    //     System.out.println("The element at position (r,c) is: " + element);
    // }

    //Variation 2 - Print the full row which is mentioned
// 
    // public static void pascalTriangle(int n) {
    //     long ans = 1;
    //     System.out.print(ans + " ");
    //     for(int i=1; i<n; i++){
    //         ans = ans * (n-i);
    //         ans = ans / i;
    //         System.out.print(ans + " ");
    //     }
    //     System.out.println();       
    // }
    // public static void main(String[] args) {
    //     int n = 5;
    //     pascalTriangle(n);
    // }

    //Variation 3 - Print the whole Pascal traingle 
    public static List<Integer> generateRow (int row){
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);

        for(int col = 1; col < row; col++){
            ans = ans * (row - col);
            ans = ans /col;
            
            ansRow.add((int) ans);
        }
        return ansRow;
    }
    public static List<List<Integer>> pascalTriangle(int n){

        List<List<Integer>> ans = new ArrayList<>();
        for(int row = 1; row<n; row++){
            ans.add(generateRow(row));
        }
    
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = pascalTriangle(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

}