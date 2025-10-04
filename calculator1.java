import java.util.Scanner;

public class calculator1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("enter first number: ");
		double num1 = input.nextDouble();

		System.out.print("enter second number: ");
		double num2 = input.nextDouble();

		System.out.print("choose operation (+, -, *, /,^): ");
		char op = input.next().charAt(0);

		String result = switch (op) {
		case '+' -> "Result: " + (num1 + num2);
		case '-' -> "Result: " + (num1 - num2);
		case '*' -> "Result: " + (num1 * num2);
		case '/' -> (num2 != 0) ?
				"Result: " + (num1 / num2) : "error ,cannot divide by zero!";
		case '^'-> "Result: " + Math.pow(num1,num2);
			default -> "invalid operator";
		};

		System.out.println(result);

		input.close();
	}
}
