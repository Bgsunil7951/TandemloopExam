import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter input");
			
			int input=sc.nextInt();
			
			if(input%2==0)input=input-1;
			int count=0;
			
			for(int i=1;;i=i+2) {   // reduces the time complexity
				
				System.out.print(i);
				count++;
				
				if(count==input) {
					break;
				}
				System.out.print(", ");
			}
		}
		
		
		
}

