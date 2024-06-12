public class ReplaceChar {
    public static void main(String[] args) {
        String s = " Hello World! Welcome to the coding practice";

        char ch[] = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if( ch[i] == 'o'){
                ch[i] = 'y';
            }
        }
        System.out.println(ch);
    }
}
