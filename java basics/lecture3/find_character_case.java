package lecture3;
import java.util.Scanner;

public class find_character_case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c;
		System.out.println("enter a single character");
        c= sc.nextLine();
        char a= c.charAt(1);
        if(a>=97 && a<=122) {
        	System.out.println("the character is lower case");
        } 
        else if (a>=65 && a<=90) {
        	System.out.println("the character is upper case");}
        else {
        	System.out.println(" the character is not an alphabet");
        }
        }

}
