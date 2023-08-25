package core_JAVA_codes;

/**
 * Super keyword: Inheritance compulsory. whenever base class & derived class
 * has same data members. JVM will get confused and return derived class values
 * But if we want to call Base class, super Keyword is used
 */

class SuperKeyword { // Superclass(parent)
	public void display() {
		System.out.print("Im a good boy");
	}
}

class SuperKey extends SuperKeyword { // Subclass(child)
	public void display() {
		super.display(); // Call the superclass method
		System.out.print("Im a bad boy");
	}
}

class Ashok {
	public static void main(String[] args) {
		SuperKeyword R1 = new SuperKeyword();
		R1.display();
	}
}