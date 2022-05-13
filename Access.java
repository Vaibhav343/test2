package check;

import java.util.Scanner;

public class Access {
	public static void main(String[] args) {
		final String PASSWORD = "kyaboltipublic";
		String pass;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your password> ");
		for (;;) {
			pass = sc.nextLine();
			if (pass.equals(PASSWORD)) {
				System.out.println("\n\nACCESS GRANTED...");
				break;
			} 
			else {
				count++;
				if(count<=2) {
					System.out.print("INCORRECT PASSWORD, Try again> ");
				}
				if (count == 3) {
					System.out.println("\n\nACCESS DENIED...");
					break;
				}
			}
		}

	}

}
