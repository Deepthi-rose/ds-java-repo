package JavaSessions;

public class ConditonalStatements {

	public static void main(String[] args) {

		int a = 10;
		int b = 10;

		if (a == b) {
			System.out.println("both are equal");
		} else {
			System.out.println("both are not equal");
		}

		System.out.println(a == b);

		if (a >= b) {
			System.out.println("Hi");
		} else {
			System.out.println("Bye");
		}

		// > < >= <= == !=
		int total = 100;
		if (total != 100) {
			System.out.println("wrong");
		} else {
			System.out.println("right");
		}

		// dead code
		if (false) {
			System.out.println("Java");
		} else {
			System.out.println("JavaScript");
		}

		//
		boolean flag = false;
		if (flag) {
			System.out.println("Hey!!!!");
		} else {
			System.out.println("Hello!!!");
		}

		// if - if - if - else
		String browser = "chrome";

		if (browser.equals("chrome")) {
			System.out.println("chrome launch");
		}

		if (browser.equals("firefox")) {
			System.out.println("ff launch");
		}

		if (browser.equals("safari")) {
			System.out.println("safari launch");
		}

		if (browser.equals("edge")) {
			System.out.println("edge launch");
		}

		else {
			System.out.println("plz pass the right browser name....");
		}

		// if - else if
//		String browser = "edge";
//		if (browser.equals("chrome")) {
//			System.out.println("chrome launch");
//		}
//
//		else if (browser.equals("firefox")) {
//			System.out.println("ff launch");
//		}
//
//		else if (browser.equals("safari")) {
//			System.out.println("safari launch");
//		}
//
//		else if (browser.equals("edge")) {
//			System.out.println("edge launch");
//		} 
//		else {
//			System.out.println("plz pass the right browser name....");
//		}

		// WAP to print the highest number (three diff numbers are given):
		int x = 500;
		int y = 600;
		int z = 300;
		// && - short circuit operator

		if (x > y && x > z) {// false && true = false
			System.out.println("x is the highest number");
		}

		else if (y > z) {// true
			System.out.println("y is the highest number");
		} 
		else {
			System.out.println("z is the highest number");
		}
		
		
	}

}
