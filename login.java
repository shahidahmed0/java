import java.util.Scanner;

public class login {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		System.out.print("Create a password: ");
		String password = input.nextLine();

		if (password.length() < 6) {
			System.out.println("too short,try again");
			System.exit(0);
		} else if (password.length() >= 6 && password.length() < 10) {
			System.out.println("weak password,try again(atleast 10 characters)");
			System.exit(0);

		}


		else {
			System.out.println("strong password");
		}
		System.out.print("enter the password again to confirm: ");
		String confirmPassword = input.nextLine();

		if (!password.equals(confirmPassword)) {
			System.out.println("passwords do not match,please try again");
		    System.exit(0);
		    
		}

		else {
			System.out.println("your new password is:"+password);
		}


		input.close();
	}
}



