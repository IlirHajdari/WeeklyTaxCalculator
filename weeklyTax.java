import java.util.Scanner;

public class Mod3 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Weekly Amount: ");
		double amount = in.nextDouble();
		double tax;
		if(amount < 500) {
			tax = 0.1 * amount;
		}
		else if(amount < 1500) {
			tax = 0.15 * amount;
		}
		else if(amount < 2500) {
			tax = 0.20 * amount;
		}
		else {
			tax = 0.30 * amount;
		}
		System.out.printf("Tax amount is $%.2f\n" , tax);
	}
}
