package lecture_5;
import java.util.Sacnner;
import java.util.Scanner;
public class complete_triangle {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n,i,j,space;
	System.out.println("entr the no of rows");
	n=sc.nextInt();
	i=1;
	while(i<=n) {
		space=1;
		while(space<=n-i) {
			System.out.print(" ");
			space++;
		}
		j=1;
		while(j<=i) {
			System.out.print(+j);
		j++;
	}
        int k=1;//or writen in copy another way.
        while(k<=i-1) {
        	System.out.print(+k);
        	k++;
        }System.out.println();
        i++;
	}

}}
