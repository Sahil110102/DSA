import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {

    public static void printDups(String s){
        Map <Character, Integer> count = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if(count.containsKey(s.charAt(i))){
                count.put(s.charAt(i), count.get(s.charAt(i))+1);
            }
            else{
                count.put(s.charAt(i), 1);
            }
        }

         for(Map.Entry<Character, Integer> mapElements : count.entrySet()){
            if(mapElements.getValue()>1){
                System.out.println(mapElements.getKey() + ", count = "+ mapElements.getValue());
            }
         }
        
    }
    public static void main(String[] args) {
        String s = "SahillSa";
        printDups(s);
    }
    
}
