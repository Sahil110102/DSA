public class RotationStr {
    public static void main(String[] args) {
        String str1 = " Sahil";
        String str2 = " ilSah";
        
        if (str1.length() != str2.length()) {
            System.out.println("Not a rotaion string");
        }
        
        String temp = str1 + str2;
        if(temp.contains(str2)){
            System.out.println("It is a rotation of the string 1");
        }
    }
    
}
