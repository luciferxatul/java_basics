package array01;

public class binary_search {

public static int binaryscr(int[] input, int elem) {
	int l=input.length-1;
	int lb=0,ub=l;
	while(lb<=ub) {
		int mid=(lb+ub)/2;
		if(elem==input[mid]) {
			return mid;
		}
		else if(elem> input[mid]) {
			lb=mid+1;}
		else {
			ub=mid-1;
			}
		
		}return -1;
		
}
public static void main(String[] args) {
	System.out.println("Atul");

int[] input= {2,3,4,5,6,7,8,9};
int index=binaryscr(input,7);
System.out.println(index);
}}

	
	
