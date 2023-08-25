package core_JAVA_codes;

/**
 * It is a predefined keyword also called current class object. whenever we have
 * both global and local variables, JVM will get confusion and will take
 * priority as local variables. If we want to give priority for global variables
 * then this keyword is used. This keyword should not be used under static area.
 * 
 * This keyword will plays key-role at three levels: variable, method &
 * constructor
 */

class ThisKeyword {
	// declare variables
	int x;
	int y;

	ThisKeyword(int x, int y) {
		// assign values of variables inside constructor
		this.x = x;
		this.y = y;

		// value of x and y before calling add()
		System.out.println("Before passing this to addTwo() method:");
		System.out.println("x = " + this.x + ", y = " + this.y);

		// call the add() method passing this as argument
		add(this);

		// value of x and y after calling add()
		System.out.println("After passing this to addTwo() method:");
		System.out.println("x = " + this.x + ", y = " + this.y);
	}

	void add(ThisKeyword a) {
		a.x = a.x + 2;
		a.y = a.y + 2;
	}
}

class Main2 {
	public static void main(String[] args) {
		ThisKeyword R1 = new ThisKeyword(1, 2);
		System.out.println();
		System.out.println(R1.x + " " + R1.y);
	}
}
