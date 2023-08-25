package core_JAVA_codes;

/** Method Overriding : same method name and same parameters 
 * Default: JVM will consider the */

public class MethodOverriding {
	public void displayInf() {
		System.out.println("I am Ashok Kumar");
	}
}

class Dog extends MethodOverriding {
	@Override
	public void displayInf() {
		System.out.println("I am Bhajanthri");
	}
}

class Main1 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.displayInf();
	}
}
