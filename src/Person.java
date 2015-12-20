public class Person {

	protected String name;
	protected int age;
	protected boolean isMale;

	protected Person(String name, int age, boolean isMale) {
		if (name == " ") {
			System.out.println("no such name");
		} else if (age < 0) {
			System.out.println("no such age");
		} else if (isMale != true && isMale != false) {
			System.out.println("no such gender");
		} else {
			this.name = name;
			this.age = age;
			this.isMale = isMale;
		}
	}

	protected void showPersonInfo() {
		this.name.toString();
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Sex: " + (this.isMale ? "Male" : "Female"));
		
	}
}
