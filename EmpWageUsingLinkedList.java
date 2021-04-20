import java.util.*;

public class EmpWageUsingLinkedList implements EmpComputeWage {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private LinkedList<Company> linkedlist = new LinkedList<Company>();

	@Override
	public int getWagesByCompanyName(String name){
		int totalWage = 0;
		for(int i = 0; i< linkedlist.size(); i++){
			Company  company = linkedlist.get(i);
			if(name.equals(company.getName())){
				totalWage = company.getTotalEmpWage();
				break;
			}
		}

		return totalWage;
	}
	@Override
	public void addCompany(final Company company){
	    linkedlist.add(company);
	}

	@Override
	public void print(){
	    linkedlist.forEach(System.out::println);
	}

	@Override
	public void calculateWage(){
	    linkedlist.forEach(this::calculate);
	}

	private void calculate(final Company company) {
		int totalEmpHours = 0;
		int empHours = 0;
		int totalWorkingDays = 0;

		while (totalEmpHours <= company.getMaxHrsInMonth() && totalWorkingDays <= company.getNoOfWorkingDays()) {

			totalWorkingDays++;

			int empCheck = ((int) Math.floor(Math.random() * 10)) % 3;

			switch (empCheck) {
				case IS_FULL_TIME:
					empHours = 8;
				break;
				case IS_PART_TIME:
					empHours = 4;
				break;
				default:
					empHours = 0;			}
			totalEmpHours += empHours;

		}
		int totalEmpWage = totalEmpHours * company.getEmpRatePerHrs();
		company.setTotalEmpWage(totalEmpWage);
	}

	public static void main(String[] args) {
		EmpComputeWage ebi = new EmpWageUsingLinkedList();
		Company company1 = new Company("Dmart" , 20, 10, 100);
		ebi.addCompany(company1);
		Company company2 = new Company("JioMart", 20, 5, 100);
		ebi.addCompany(company2);

		ebi.calculateWage();
		ebi.print();
		int totalWages = ebi.getWagesByCompanyName("Dmart");
		System.out.println("Wage : " + totalWages);

		int totalWages1 = ebi.getWagesByCompanyName("Dmart1");
		System.out.println("Wage : " + totalWages1);
	}
}

interface EmpComputeWage {
	void addCompany(Company company);
	void calculateWage();
	void print();
	int getWagesByCompanyName(String name);

}

class Company {

	private String name;
	private int empRatePerHrs;
	private int noOfWorkingDays;
	private int maxHrsInMonth;
	private int totalEmpWage;

	public Company(final String name, final int empRatePerHrs, final int noOfWorkingDays, 
		final int maxHrsInMonth){
		this.name = name;
		this.empRatePerHrs = empRatePerHrs;
		this.noOfWorkingDays = noOfWorkingDays;
		this.maxHrsInMonth = maxHrsInMonth;
	}

	public String getName(){
		return name;
	}

	public int getMaxHrsInMonth(){
		return maxHrsInMonth;
	}

	public int getNoOfWorkingDays(){
		return noOfWorkingDays;
	}

	public int getEmpRatePerHrs(){
		return empRatePerHrs;
	}

	public void setTotalEmpWage(int totalEmpWage){
		this.totalEmpWage = totalEmpWage;
	}

	public int getTotalEmpWage(){
		return this.totalEmpWage;
	}

	@Override
	public String toString(){
		return "Total Employee wages for comapny "+this.name+ " is : "+this.totalEmpWage;
	}
}
