import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SortCharFreq
 */
public class SortCharFreq {

    public static String frequencySort(String s) {

        StringBuilder ans = new StringBuilder();
        Map <Character , Integer > hm = new HashMap<>();

        for(char ch : s.toCharArray()){
            hm.put(ch , hm.getOrDefault(ch , 0) + 1);
        }    
        List<Character> list = new ArrayList(hm.keySet());
        list.sort((ob1 , ob2) -> hm.get(ob2) - hm.get(ob1));
        for( char ch : list ){
            for(int i=0 ; i< hm.get(ch); i++){
                ans.append(ch);
            }
        }  
        return ans.toString() ;
    }
    public static void main(String[] args) {
        String s = "tree";

        String result = frequencySort(s);
        System.out.println(result);
    }
}