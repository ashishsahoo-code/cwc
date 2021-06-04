import java.util.Scanner;

public class Q9 {
    public static void main(String[]args) {

        String org,rev="";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word to be reverse");
    org =sc.nextLine();
    for(int i=org.length()-1;i>=0;i--)
    rev= rev+ org.charAt(i);
    System.out.println("reverse of string"+" "+rev);
    
    }

}
