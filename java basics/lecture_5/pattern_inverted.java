package lecture_5;

import java.util.Scanner;

public class pattern_inverted {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i=1,n,space;
		System.out.println("Enter the no of rows ");
		n =sc.nextInt();
		i=n;
		while(i>0) {
		
		int j=n-i;	
			while(j>0) {
				
				System.out.print(" ");
				j--;
				} int k=0;
			while(k<i) {
				System.out.print("*");
				k++;
			}
			
			System.out.println();
			i--;

	}

}}
