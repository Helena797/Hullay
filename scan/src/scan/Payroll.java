package scan ;

import java.util.Scanner;

public class Payroll {
	
	private String name;
	private int hours;
	private double payRate;
	private double fedTaxRate;
	private double stateTaxRate;

	public void runPayroll() {
		this.getInput();		//private method to get user input values
		this.printPayroll();	//private method to print payroll 
	}
	
	private void getInput() {
		Scanner objScanner = new Scanner(System.in);
		this.print("Employee's name:");
		this.name = objScanner.nextLine();
		this.print("Number of hours worked in a week:");
		this.hours = objScanner.nextInt();
		this.print("Hourly pay rate:");
		this.payRate = objScanner.nextDouble();
		this.print("Federal tax withholding rate:");
		this.fedTaxRate = objScanner.nextDouble();
		this.print("State tax withholding rate:");
		this.stateTaxRate = objScanner.nextDouble();
		objScanner.close();
	}
	
	private void printPayroll() {
		this.println("Employee Name: " + this.name);
		this.println("Hours Worked: " + this.hours);
		this.println("Pay Rate: " + this.payRate);
		double grossPay = this.hours * this.payRate;
		this.println("Gross Pay: " + grossPay);
		this.println("Deductions: ");
		double fedTaxAmount = grossPay * this.fedTaxRate;
		double stateTaxAmount = grossPay * this.stateTaxRate;
		this.println("Federal Withholding: " + fedTaxAmount);
		this.println("State Withholding: " + stateTaxAmount);
		this.println("Total Deduction: " + (fedTaxAmount + stateTaxAmount));
		this.println("Net Pay: " + (grossPay - fedTaxAmount - stateTaxAmount));
	}
	
	private void println(String content) {
		System.out.println(content);
	}
	
	private void print(String content) {
		System.out.print(content);
	}
}
