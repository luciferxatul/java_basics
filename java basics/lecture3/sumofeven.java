 package lecture3;
import java.util.Scanner;

public class sumofeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no");
		int a = sc.nextInt();
		int i=1,sum=0;
		while(i<=a) {
			if(i%2==0) {
		      sum =sum+i;
			
			} i=i+1;
		}
			System.out.println("sum of even nos is = " + sum);
		
		}
}

