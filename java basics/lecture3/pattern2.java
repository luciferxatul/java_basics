package lecture3;
import java.util.Scanner;
public class pattern2 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n,i=1,j;
		System.out.println("enter  the no of rows");
		n = s.nextInt();
		
		while(i<=n) {
			j=1;
			while(j<=i) {
				System.out.print(+j);
				j=j+1;
				
			}
			System.out.println();
			i++;
		}
	}

}
