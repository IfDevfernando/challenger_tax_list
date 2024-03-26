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
		
		double salaryTax = 0.0;
		double servIcome = 0.0;
		double capIcome = 0.0;
		double grossTax =0.0;
		double rebate = 0.0;
		double netTax = 0.0;
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
			
		
			
			salaryTax = taxy.salaryTax(anulaIcome);
			servIcome = taxy.serviceTax(serviceIcome);
			capIcome = taxy.capitalTax(capitalIcome);
			
			grossTax = taxy.grossTax(salaryTax, servIcome, capIcome);
			rebate = taxy.taxRebate(grossTax);
			netTax = taxy.netTax(grossTax, rebate);
			
			taxPayer.add(taxy);
			
		}
		
			
			System.out.println("contributor  summary");
			System.out.println("Total gross tax: "+grossTax);
			System.out.println("Rebate: "+rebate);
			System.out.println("Tax due: "+netTax);
		
		

	}

}
