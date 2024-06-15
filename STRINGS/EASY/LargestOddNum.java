import java.util.Stack;

public class LargestOddNum {
    public String removeOuterParentheses(String s) {
        Stack <Character> sb = new Stack <>();
        StringBuilder ans = new StringBuilder();

        for(int i=0 ; i< s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(sb.size() > 0){
                    ans.append(ch);
                }
                sb.push(ch);
            }
            else{
                sb.pop();
                if(sb.size() > 0){
                    ans.append(ch);
                }  
            }
        }
        return ans.toString();
    }
}
