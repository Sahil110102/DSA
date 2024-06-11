import java.util.Scanner;

/**
 * BasicsOfString
 */
public class BasicsOfString {

    public static void main(String[] args) {
        
        //String declaration 
        // String name = "Sahil";
        // String fullName = "Sahil Bhosale";
        // String sentense = "My Name is Sahil Bhosale";

        //User Input in String
        // Scanner sc = new Scanner(System.in);
        // String name1 = sc.next();
        // System.out.println("Your Name Is : " + name1 );

        // Input of full Line 
        // Scanner scc = new Scanner(System.in);
        // String fullname = scc.nextLine();
        // System.out.println("Your Name Is : " + fullname );

        //Concatenation (To Joined to String )
        // String firstName = "Tony";
        // String lastName = "Stark";
        // String fullName =  firstName + " "+ lastName;
        // System.out.println(fullName);

        // To Calculate Length
        // System.out.println(fullName.length());

        //TO Travers Each Character (CharAt)
        // for (int i = 0; i < fullName.length(); i++) {
        //     System.out.println(fullName.charAt(i));
        // }

        //Compare Two String 
        // String name1= "Sahil";
        // String name2= "Sahil";

        // //1 s1 > s2 : +ve Value
        // //1 s1 == s2 : 0
        // //1 s1 < s2 : -ve Value

        // if(name1.compareTo(name2)==0){
        //     System.out.println("String are Equal");
        // }
        // else{
        //     System.out.println (" are not equal");
        // }

        //Substring 

        String sentence = "My Name is Sahil";
        //substring (begining index, end index)
        String name = sentence.substring(11 , sentence.length());
        System.out.println(name);

        //Strings Are Immutable 
    }
}