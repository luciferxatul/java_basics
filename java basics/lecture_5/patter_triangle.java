package lecture_5;

import java.util.Scanner;

public class patter_triangle {

	public static void main(String[] args) {
		
			Scanner sc= new Scanner(System.in);
			int i=1,n,space;
			System.out.println("Enter the no of rows ");
			n =sc.nextInt();
			
			while(i<=n) {
				space=1;
				while(space<=n-i) {
					System.out.print(" ");//here instead of just space we can print anything like * to create a square pattern with diff elements
					space++;
				}
				int j=1;
				while(j<=i) {
					
					System.out.print("*");
					j++;
					
				}
				System.out.println();
				i++;
		}}}

