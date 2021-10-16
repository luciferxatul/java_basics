package lecture3;
import java.util.Scanner;
public class salary_calculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bas,hra,da,pf,ts;
		System.out.println("enter the basic salary ");
		bas=sc.nextInt();
		System.out.println("enter the grade");
		String str=sc.next();
		char grade =str.charAt(0); 
		
		hra= (20*bas)/100; //OR 0.20*bas; //would also be fast to write
		da = (50*bas)/100;
		pf =(11*bas)/100;
		
		if(grade =='A') {
			ts=(hra+da+bas+1700)-pf;
		}
		else if(grade == 'B') {
			ts=(hra+da+bas+1500)-pf;
		}
		else
		{
			ts=(hra+da+bas+1300)-pf;
		}
	
	System.out.println("total salary is = " +ts);
	
	}

}
