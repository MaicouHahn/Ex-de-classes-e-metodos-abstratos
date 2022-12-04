package entities;

public abstract class Account {
	protected String name;
	protected Double annualIncome;
	
	public Account(String name,Double annualIncome) {
		this.name=name;
		this.annualIncome=annualIncome;
	}

	public String getName() {
		return name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}
	
	public abstract double taxes();
	public abstract String impAll();
}
