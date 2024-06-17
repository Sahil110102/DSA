public class MaxDeptParentheses {
    public int maxDepth(String s) {
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
}
