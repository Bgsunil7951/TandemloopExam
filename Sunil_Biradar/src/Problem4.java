import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter input length or array size");
		
		
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enter numbers");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Input is:  "+Arrays.toString(arr));
		
		
		int[] res=new int[10];
		
		for(int value : arr) {
			for(int i=1;i<=9;i++) {
				if(value%i==0) {
					res[i]++;
				}
			}
		}
		System.out.println("{");
		
		for(int i=1;i<=9;i++) {
			System.out.print(i +" : "+res[i]);
			System.out.print(", ");
		}
		System.out.print("}");
	}
}
