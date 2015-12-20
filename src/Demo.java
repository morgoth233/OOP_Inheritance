
public class Demo {

	public static void main(String[] args) {
		
		Person[] people = new Person[10];
		
		people[0] = new Person("Gosho",23,true);
		people[1] = new Person("Pesho",23,true);
		
		people[2] = new Student("Strahil",20,true,4.5);
		people[3] = new Student("Minka",20,false,5.5);
		
		people[4] = new Employee("Ivan",23,true,30);
		people[5] = new Employee("Mincho",33,true,33.5);
		
	
		for (int i = 0; i < people.length && people[i] != null; i++) {
			if (people[i] instanceof Student) {
				((Student)people[i]).showStudentInfo();
			}else if(people[i] instanceof Employee){
				((Employee)people[i]).showEmployeeInfo();
			}else{
				people[i].showPersonInfo();
			}
			System.out.println();
		}
		
		for (int i = 0; i < people.length && people[i] != null; i++) {
			if(people[i] instanceof Employee){
				System.out.println(people[i].name + " will get additional " + ((Employee)people[i]).calculateOvertime(2) + "lv for 2hr. overtime");
			}
		}
	}
	
	
}
