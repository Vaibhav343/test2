package check;

import java.util.Scanner;

public class Checking {

	public static void main(String[] args) {
		final String PASSWORD = "vabbyeuuu";

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Enter the passwors> ");

			String passcode = sc.nextLine();
			if (passcode.equals(PASSWORD)) {
				System.out.println("Logged in.....");
				break;

			} else {
				System.out.println("Enter valid password...");
				System.out.println();
				continue;
			}
		}
		sc.close();
	}

}
