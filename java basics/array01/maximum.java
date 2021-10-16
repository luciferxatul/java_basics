package array01;
import java.util.Scanner;
public class maximum {
public static int largest(int input[]) {
	int max= Integer.MIN_VALUE;
	for(int i=0;i<input.length;i++) {
		if(input[i]>=max) {
			max=input[i];
		}
		
	} return max;
} public static int[]takeInput() {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the size of the array");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("enter the array elements");
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
	
	}return arr;
	
}
	public static void main(String[] args) {
		int arr1[]=takeInput();
		int largestno= largest(arr1);
		System.out.println("largest no is" +largestno);
	
	//System.out.println("maximum no is  " +max);
	}

}
