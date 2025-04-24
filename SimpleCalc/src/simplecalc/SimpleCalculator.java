
import java.util.Scanner;


public class SimpleCalculator {

    public static void main(String[] args) {
        
        Scanner calc = new Scanner(System.in);
        
        System.out.println("=== Simple Calculator ===");
        System.out.println("Enter first number: ");
        double num1 = calc.nextDouble();
        
        System.out.println("Enter an operator (+, -, *, /)");
        char operator = calc.next().charAt(0);
        
        System.out.println("Second number: ");
        double num2 = calc.nextDouble();
        
        double result = 0;
        
        switch (operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Can´t divide by zero");
                    return;
                }
                result = num1 / num2; break;
            default:
                System.out.println("Error: Invalid operator");
                return;
        }
        
        System.out.println("Result = " + result);
             
        
        
        
        
                
    }
    
}
