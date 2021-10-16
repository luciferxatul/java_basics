
import java.util.Scanner;

public class sumof { 
 public static void main(String args[]) {
	 Scanner s = new Scanner(System.in);
 System.out.println("enter principal, rate and time");
 int a = s.nextInt();
 int b = s.nextInt();
 int c = s.nextInt();
 int si=0;
 si = (a*b*c)/100;
 int pr = (si+a);
 //sum=a+b;
 System.out.println("sandip sarkar ur simple interest is ="+pr);
 
}}
