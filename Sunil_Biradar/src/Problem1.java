import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
		System.out.println();
		System.out.println("Enter first number");
		double a=sc.nextDouble();

		System.out.println("Enter second  number");
		double b=sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Enter oprations (add, sub, mul, div)");
		String input=sc.nextLine();
		
		String opration = input.toLowerCase();
		
		try {
			double result=calculator(a, b, opration);
			System.out.println("Result :  "+result);
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
		
		}
	}
	
	public static double calculator(double a, double b, String op) {
		
		switch (op) {
		case "add":{
			return a+b;
			
		}
		case "sub": {
			return a-b;
			
		}
		case "mul": return a*b;
		case "div": {
			if(b==0) throw new ArithmeticException("Cannot divide by zero ");
			return a/b;
		}
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + op);
		}
	}
}
