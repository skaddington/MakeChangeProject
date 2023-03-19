import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter the receipt total: ");
		double total = kb.nextDouble();
		System.out.println("How much money was tendered? ");
		double tendered = kb.nextDouble();
		double change = tendered - total;
		double rounded = Math.round(change * 100.0) / 100.0;
		change = change + 0.005;
		int coins = getCoins(change);

		if (tendered < total) {
			System.out.println("Insufficient Funds : Transaction Not Complete");
		} else if (tendered == total) {
			System.out.println("Exact Amount Received : No Change Needed");
		} else {

			System.out.println("Change to be given = " + rounded);
			System.out.println("-------------------------------");

			getTwenty(change);
			getTen(change);
			getFive(change);
			getOne(change);
			getQuarter(coins);
			getDime(coins);
			getNickel(coins);
			getPenny(coins);

		}

		kb.close();
	}

	public static void getTwenty(double change) {
		if (change >= 20.00) {
			int twenty = (int) change / 20;
			if (twenty > 1) {
				System.out.println(twenty + " twenty dollar bills, ");
			} else if (twenty == 1) {
				System.out.println(twenty + " twenty dollar bill, ");
			}
		} else {
			// Send nothing
		}
	}

	public static void getTen(double change) {
		if (change >= 10.00) {
			int ten = (int) change / 10;
			if (ten % 2 != 0) {
				ten = 1;
				System.out.println(ten + " ten dollar bill, ");
			} else {
				// Send nothing
			}
		} else {
		}
	}

	public static void getFive(double change) {
		if (change >= 5.00) {
			int five = (int) change / 5;
			if (five % 2 != 0) {
				five = 1;
				System.out.println(five + " five dollar bill, ");
			} else {
				// Send nothing
			}
		} else {
		}
	}

	public static void getOne(double change) {
		if (change >= 1.00) {
			int remainder = (int) change / 5;
			int one = (int) change - (remainder * 5);
			if (one > 1) {
				System.out.println(one + " one dollar bills, ");
			} else if (one == 1) {
				System.out.println(one + " one dollar bill, ");
			} else {
				// Send nothing
			}
		} else {
		}
	}

	public static int getCoins(double change) {
		int bills = (int) change;
		int coins = (int) ((change - bills) * 100);
		return coins;
	}

	public static void getQuarter(int coins) {
		if (coins >= 25) {
			int quarter = (int) coins / 25;
			if (quarter > 1) {
				System.out.println(quarter + " quarters, ");
			} else if (quarter == 1) {
				System.out.println(quarter + " quarter, ");
			} else {
				// Send nothing
			}
		} else {
		}
	}

	public static void getDime(int coins) {
		if (coins >= 10) {
			int quarter = (int) coins / 25;
			int remainder = coins - (25 * quarter);
			int dime = (int) (remainder / 10);
			if (dime > 1) {
				System.out.println(dime + " dimes, ");
			} else if (dime == 1) {
				System.out.println(dime + " dime, ");
			} else {
				// Send nothing
			}
		} else {
		}
	}

	public static void getNickel(int coins) {
		if (coins >= 5) {
			int quarter = (int) coins / 25;
			int remainder = coins - (25 * quarter);
			int dime = (int) (remainder / 10);
			remainder = remainder - (10 * dime);
			int nickel = (int) (remainder / 5);
			if (nickel > 1) {
				System.out.println(nickel + " nickels, ");
			} else if (nickel == 1) {
				System.out.println(nickel + " nickel, ");
			} else {
				// Send nothing
			}
		} else {
		}
	}

	public static void getPenny(int coins) {
		if (coins > 0) {
			int nickel = (int) (coins / 5);
			int penny = coins - (5 * nickel);
			if (penny > 1) {
				System.out.println(penny + " pennies. ");
			} else if (penny == 1) {
				System.out.println(penny + " penny. ");
			} else {
				// Send nothing
			}
		} else {
		}
	}
}
/*
 * HINTS! modulus in action Math.round() add 0.005
 * 
 */
