import java.util.Scanner;
import java.util.Random;
public class inf_dice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random ran= new Random();
		

		while (1==1) {
			int dice= ran.nextInt(1,7);
			System.out.println("to roll the dice write \'roll\' ");
			String r=input.nextLine().toLowerCase();
			System.out.println((r.equals("roll")?dice:"incorrect,try again"));

		}
	}

}
