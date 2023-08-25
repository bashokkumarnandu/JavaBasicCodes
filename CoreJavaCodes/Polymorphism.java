package core_JAVA_codes;

/**
 * A single interface having multiple implementations is also called
 * Polymorphism Polymorphism in Java can be achieved in two ways i.e., method
 * overloading and method overriding
 */

//Parent class : run-time polymorphism
class Parent {
	// creating a method
	void print() {
		System.out.println("Hi, I am parent");
	}
}

class Child extends Parent {
	// overriding above method
	void print() {
		super.print();
		System.out.println("Hi, we are his children");
	}
}

//Overload class :compile-time polymorphism
class Overload {
	// Creating a statement method
	void statement(String name) {
		System.out.println("Hi, my name is " + name);
	}

	// overloading statement method
	void statement(String fname, String lname) {
		System.out.println("Hi, my name is " + fname + " " + lname);
	}
}

class Money {
	public static void main(String[] args) {
		// creating instance of parent class
		Child obj1 = new Child();
		obj1.print();

		// creating instance of overload class
		Overload obj2 = new Overload();
		obj2.statement("Sreeram");
		obj2.statement("Ashok", "Kumar");
	}
}
