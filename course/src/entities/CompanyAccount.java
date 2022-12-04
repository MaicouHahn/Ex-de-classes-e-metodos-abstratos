package entities;

public class CompanyAccount extends Account {

	private int numberOfEmployees;

	public CompanyAccount(String name, Double annualIncome, int numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double taxes() {
		double tax = 0.0;
		if (numberOfEmployees >= 10) {
			tax = annualIncome * 0.14;
		} else {
			tax = annualIncome * 0.16;
		}
		return tax;
	}

	@Override
	public String impAll() {
		return name + " $" + String.format("%.2f", taxes());
	}
}
