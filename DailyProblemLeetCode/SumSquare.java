/**
 * SumSquare
 */
public class SumSquare {
    public static boolean judgeSquareSum(int c) {
        long s = 0, e = (long) Math.sqrt(c), sum;
        while(s <= e){
            sum = (s*s) + (e*e);
            if(sum < c) s++;
            else if(sum > c) e--;
            else return true;
        }
        return c == 1;
    }

    public static void main(String[] args) {
        int c = 5;

        boolean result = judgeSquareSum(c);
        System.out.println(result);

    }
}