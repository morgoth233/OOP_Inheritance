
public class Employee extends Person{
	
	private double daySalary;  

	protected Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		this.daySalary = daySalary;
	}
	
	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		this.daySalary = daySalary;
	}
	
	double calculateOvertime(double hours){
		/*if (hours <= 0) {
			System.out.println("wrong data");
			return -1;
		}else */if (super.age < 18) {
			return 0;
		}else{
			return hours*(daySalary/8)*1.5; //broq na chasovet po cenata na chas po koeficient 1.5
		}
		
	}
	
	public void showEmployeeInfo(){
		super.showPersonInfo();
		System.out.println("Day Salary: " + this.daySalary);
		
	}
}
