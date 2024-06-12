public class ReverseString {

    public static void main(String[] args) {
        String reverse = "Sahil Bhosale";



        int start = 0;
        int end = reverse.length() - 1;
        char ch[] = reverse.toCharArray();

        while (start < end) {
            char c = ch[start];
            ch[start] = ch[end];
            ch[end] = c;

            start ++;
            end --;
        }

        for (int i = 0; i < reverse.length(); i++) {
            System.out.println(ch[i] + "");
        }
    }
}
