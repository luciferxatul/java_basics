package lecture_6;
import java.util.Scanner;
public class sumo_or_product {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	{ int n,c,sum=0,pro=1;
	System.out.println("enter a  no");
	n=sc.nextInt();
	System.out.println("enter ur choice");
	System.out.println("enter one for sum and two for product");
	
	c=sc.nextInt();
	if(c==1){
		for(int i=1;i<=n;i++)
		{
		sum=sum+i;
		
	}
		System.out.println("the sum of the digits is" +sum);	
	}
		
	else if(c==2){
		for(int i=1;i<=n;i++) {
			pro=pro*i;
		}System.out.println("the product is"+pro);
		
	}
		
	}
	}

}
