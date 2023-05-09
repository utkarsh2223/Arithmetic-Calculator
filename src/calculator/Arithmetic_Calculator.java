package calculator;
import java.util.Scanner;

public class Arithmetic_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number ?");
		double a = sc.nextDouble();
		
		System.out.println("Enter 2nd Number ?");
		double b = sc.nextDouble();
		
		System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        double result;
        
        switch(operator) {
        
        case '+': 
        	result = a+b;
        	break;
        	
        case '-':
        	result = a-b;
        	break;
        	
        case '*':
        	result = a*b;
        	break;
        	
        case '/':
        	result = a/b;
        	break;
        	
        default:
            System.out.println("Error: Invalid operator.");
            return;
        }
        
        System.out.println("Required result: " +result );
        sc.close();		

	}

}

