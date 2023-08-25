package core_JAVA_codes;

/**
 * Abstraction is the act of reducing programming complexity by representing
 * essential features without including background explanations(data hiding) or
 * details.
 * 
 * An abstract class is a class with an abstract keyword. An abstract method is
 * a method declared without a method body. An abstract class may not have all
 * the abstract methods. Some methods are concrete. A method-defined abstract
 * must have its implementation in the derived class, thus making method
 * overriding compulsory. Making a subclass abstract avoids overriding. Classes
 * that contain abstract method(s) must be declared with abstract keywords. The
 * object for an abstract class cannot be instantiated with the new operator. An
 * abstract class can have parameterized constructors.
 * 
 * Ways to achieve abstraction: Using abstract keyword & Using interfaces
 */

abstract class Ashok1 {
	// constructor
	Ashok1() {
		System.out.println("I'm a good boy");
	}

	// abstract method
	abstract void Kumar();

	void grChge() {
		System.out.println("I'm a bad boy");
	}
}

class Nandu extends Ashok1 {
	void Kumar() {
		System.out.println("Abstraction is acheived");
	}
}

class Abstraction {
	public static void main(String args[]) {
		Nandu obj = new Nandu();
		obj.Kumar();
		obj.grChge();
	}
}
