package entities;

public class IndividualAccount extends Account {

	private Double healthExpenditues;

	public IndividualAccount(String name, Double annualIncome, Double healthExpenditues) {
		super(name, annualIncome);
		this.healthExpenditues = healthExpenditues;
	}

	@Override
	public double taxes() {
		
		double tax = 0.0;
		if (annualIncome <= 20000.00) {
			tax = annualIncome * 0.15;
		} else {
			tax = annualIncome * 0.25;
		}

		if (healthExpenditues > 0) {
			tax = tax - (healthExpenditues * 0.5);
		}
		return tax;
	}
	
	@Override
	public String impAll() {
		return name+": $ "+String.format("%.2f",taxes());
	}
}
