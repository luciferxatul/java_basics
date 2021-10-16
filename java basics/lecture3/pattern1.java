package lecture3;
import java.util.Scanner;
public class pattern1 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n,i=1,j;
	System.out.println("enter the no of rows");
	n = s.nextInt();
	while (i<=n) {  //i here is the no of rows
		j=1;        //everytime after printing one coloumn the j is done 1.
		while(j<=i) {  //j here determines the coloumn 
			System.out.print(+j);
			j++;			
		}
		System.out.println();
		i++;
	}
	}

}
