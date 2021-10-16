import java.util.Scanner;
public class letsp {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int fah , cel;
		System.out.println("enter the vaue of fahrenite");
		fah = sc.nextInt();
		
		cel = (5*(fah-32))/9;
		System.out.println("the converted value to celcius is =  " + cel);
		
	}

}
