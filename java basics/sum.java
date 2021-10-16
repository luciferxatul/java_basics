import java.util.Scanner;

public class sum {
 
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");	
		String str = sc.nextLine();
		System.out.println(str);
		char c = str.charAt (1);
		System.out.println(c);
		System.out.println("enter two no");
		int a = sc.nextInt();
		int b = sc.nextInt();
	    int sum= a+b;
	  
	 System.out.println("hello pompi  " + sum);
}}
