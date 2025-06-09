import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter input");
		
		int input=sc.nextInt();
		
		int count=0;
		
		for(int i=1;;i=i+2) {
			
			System.out.print(i);
			count++;
			
			if(count==input) {
				break;
			}
			System.out.print(", ");
		}
	}
	
	
	
}
