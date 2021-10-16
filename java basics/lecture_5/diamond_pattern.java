package lecture_5;

import java.util.Scanner;

public class diamond_pattern {

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
			while(j<=i*2-1) {
				System.out.print("*");
			j++;
		}System.out.println();
		i++;
	       
	}
	 i=n-1;
	 while(i>0) {
		 space=1;
		 while(space<=n-i) {
			 System.out.print(" ");
			 space++;
		 }j=1;
		 while(j<=i*2-1) {
			 System.out.print("*");
			 j++;
		 }
		 System.out.println();
		 i--;
	 }
		

}}
