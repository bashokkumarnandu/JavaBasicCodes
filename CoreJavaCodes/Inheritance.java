package core_JAVA_codes;

/**
 * Inheritance is the process by which objects of one class acquire some
 * properties of objects of another class. should use extends keyword
 */
class Inheritance {
	void getDisplay() {
		System.out.println("Step-1");
	}
}

class Inheritance1 extends Inheritance {
	void getDestroy() {
		super.getDisplay();
		System.out.println("Step-2");
	}
}

class Inheritance2 extends Inheritance1 {
	void setMethod() {
		super.getDestroy();
		System.out.println("Step-3");
	}
}

class Inheritance3 extends Inheritance2 {
	void setCheck() {
		super.setMethod();
		System.out.println("Step-4");
	}
}

class Kumara {
	public static void main(String[] args) {
		Inheritance3 R1 = new Inheritance3();
		R1.setCheck();
	}
}
