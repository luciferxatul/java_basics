package lecture_6;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);{
		int n,r,rev=0;
		System.out.println("enter a no");
		n= sc.nextInt();
		while(n>0) {
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
		}System.out.println("reversed no is   "  +rev);
		
	}
	}

}
