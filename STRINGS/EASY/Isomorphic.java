import java.util.HashMap;

public class Isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()){
            return false ;
        }
        HashMap<Character , Character > mpp = new HashMap<>();
        for(int i=0; i<s.length() ; i++){
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(!mpp.containsKey(original)){
                if(!mpp.containsValue (replacement)){
                    mpp.put(original , replacement);
                }
                else{
                    return false;
                }
            }
            else{
                char mappingCharacter = mpp.get(original);
                if(mappingCharacter != replacement){
                    return false;
                }
            }
        }
        return true ;
  
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        boolean ans = isIsomorphic( s, t);
        if(ans == true){
            System.out.println("It is Isomorphic String");
        }
        else{
            System.out.println("It is not ");
        }
        
    }
}
