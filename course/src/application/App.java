package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.CompanyAccount;
import entities.IndividualAccount;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Tax Payers:");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Tax Payer #" + (i + 1));
			System.out.println("Individual or Company?(i/c)");
			char ch = scan.next().charAt(0);
			scan.nextLine();
			System.out.println("Name: ");
			String name = scan.nextLine();
			System.out.println("Annual Income: ");
			double annualIncome = scan.nextDouble();
			if (ch == 'i') {
				System.out.println("Health Expenditues: ");
				double healthExpenditues = scan.nextDouble();
				list.add(new IndividualAccount(name, annualIncome, healthExpenditues));
			} else {
				System.out.println("Number of Employees: ");
				int numberOfEmployees = scan.nextInt();
				list.add(new CompanyAccount(name, annualIncome, numberOfEmployees));
			}

		}
		System.out.println("Taxes Paid");
		double sum = 0.0;
		for (Account c : list) {
			System.out.println(c.impAll());
			sum += c.taxes();
		}
		System.out.println();
		System.out.println("Total Taxes : $ " + sum);
		
		scan.close();
	}

}
