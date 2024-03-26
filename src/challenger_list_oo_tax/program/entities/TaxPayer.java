package challenger_list_oo_tax.program.entities;

public class TaxPayer {
	
	private double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpending;
	
	

	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending,
			double educationSpending) {
		
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	public double salaryTax(double salary) {
		
		double salaryMonth = salary /12;
		
		if(salaryMonth > 3000 && salaryMonth < 5000) {
			
			return salary *0.10;
			
		}else if(salaryMonth > 5000 ) {
			return salary *0.20;
		}else {
			return salary;
		}
	}
	
	public double serviceTax(double tax) {
		
		return servicesIncome *0.15;
	}
	public double capitalTax(double capital) {
		
		return capitalIncome *0.20;
	}
	public double grossTax(double salary,double service,double capital) {
		
		return salary + service + capital;
	}
	public double taxRebate(double taxtotal ) {
		double spedingHelathEduc = healthSpending + educationSpending;
		
		double grossTaxTotal = taxtotal * 0.30;
		
		double gross = Math.min(spedingHelathEduc, grossTaxTotal);
		
		return gross;
	}
	
	public double netTax(double grossTotal,double gross) {
		
		return grossTotal - gross;
	}

	




}
