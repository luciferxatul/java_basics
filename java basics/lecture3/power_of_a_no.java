package lecture3;
import java.util.Scanner;
public class power_of_a_no {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int x ,n ,i=1,p=1;
	System.out.println("enter a no");
	n= sc.nextInt();
	System.out.println("enter ano while be in power of the previous no");
	x = sc.nextInt();
	while(i<=x) {
		 p = p*n;
		i++;
		
	}System.out.println("the out come is = " +p);
}
}
