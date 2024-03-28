package challenger_list_oo_tax.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import challenger_list_oo_tax.program.entities.TaxPayer;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=================CALCULATION TAX====================");
		
		System.out.print("How many taxpayers will you enter?");
		int n = sc.nextInt();
		System.out.println();
		
		List<TaxPayer> taxPayer = new ArrayList<>(n);
		
		
		
		for(int x =0; x < n; x++) {
			
			System.out.println("Enter the data of the "+(x+1)+" taxpayer:");
			System.out.print("Annual income with salary: ");
			double anulaIcome = sc.nextDouble();
			System.out.print("Annual income from service provision: ");
			double serviceIcome = sc.nextDouble();
			System.out.print("Annual income with capital gain: ");
			double capitalIcome = sc.nextDouble();
			System.out.print("Medical expenses: ");
			double med = sc.nextDouble();
			System.out.print("Education expenses: ");
			double educ = sc.nextDouble();
			System.out.println();
			System.out.println("=============================================================");
			
			TaxPayer taxy = new TaxPayer(anulaIcome, serviceIcome, capitalIcome, med, educ);
			
			
			taxPayer.add(taxy);
			
		}
		
		
		
		for(int x=0; x < taxPayer.size(); x++) {
			TaxPayer tax =taxPayer.get(x);
			
			double salaryTa = tax.salaryTax(tax.getSalaryIncome());
			double salarySer = tax.serviceTax(tax.getServicesIncome());
			double salaryCap = tax.capitalTax(tax.getCapitalIncome());
			double grossTax = tax.grossTax(salaryTa, salarySer, salaryCap);
			double rebate = tax.taxRebate(grossTax);
			double netTax = tax.netTax(grossTax, rebate);
			
			
			
			System.out.println("contributor  summary");
			System.out.printf("Total gross tax:%.2f\n",grossTax);
			System.out.printf("Rebate:%.2f\n",rebate);
			System.out.printf("Tax due:%.2f\n",netTax);
			
		}
		
			
			
		
		

	}

}
