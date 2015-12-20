
public class Student extends Person{
	
	public double score;
	
	protected Student(String name, int age, boolean isMale, double score){
		super(name, age, isMale);
		this.score = score;
	}
	
	public void showStudentInfo(){
		super.showPersonInfo();
		System.out.println("Score: " + this.score);
		}
		
}
