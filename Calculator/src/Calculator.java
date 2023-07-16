import java.util.Scanner;
public class Calculator {
	private static Scanner i;

	public int sum(int num1, int num2){
		return num1 + num2;
				}

	public int subtract(int num1, int num2){
		return num1 - num2;
				}
	
	public int multiply(int num1, int num2){
		return num1 * num2;
				}
	
	public int divide(int num1, int num2){
		return num1 / num2;
				}
	
 public static void main(String[] args) {
	 
	 i = new Scanner(System.in);
	 System.out.print("Enter the First number : ");
	 int num1 = i.nextInt();
	 System.out.print("Enter the Second number : ");
	 int num2 = i.nextInt();
	 Calculator calc = new Calculator();
	 System.out.println("Sum : " + calc.sum(num1, num2));
	 System.out.println("Difference : " + calc.subtract(num1, num2));
	 System.out.println("Multiplication : " + calc.multiply(num1, num2));
	 System.out.println("Divison : " + calc.divide(num1, num2));
	 
 }
}
