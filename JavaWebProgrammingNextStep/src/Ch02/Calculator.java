package Ch02;

public class Calculator {
	int add(int i, int j) {
		return i + j;
	}
	
	int subtract(int i, int j) {
		return i - j;
	}
	
	int multiply(int i, int j) {
		return i * j;
	}
	
	int devide(int i, int j) {
		return i / j;
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(3, 4));
		System.out.println(cal.subtract(3, 4));
		System.out.println(cal.multiply(3, 4));
		System.out.println(cal.devide(3, 4));
	}
}
