public class MaxDeptParentheses {
    public static int maxDepth(String s) {
        int dept = 0, open = 0;
        for(char c:  s.toCharArray()){
            if(c == '('){
                open ++;
            }
            if(c == ')'){
                open --;
            }
            dept = Math.max(dept , open);
        }
        return dept;
    }

    public static void main(String[] args) {
        String s = "(1 + (2 * 3) + ((8) / 4)) + 1";

        int result = maxDepth(s);
        System.out.println(result);
    }
}
