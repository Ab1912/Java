//Type Casting in Java
/*
	Widening Casting
		byte -> short -> char -> int -> long -> float -> double
	Narrowing Casting
		double -> float -> long -> int -> char -> short -> byte
*/

class type_casting {
	public static void main(String[] args) {
		int a = 10;
		double b = a;
		double d = 25.1456;
		int c = (int)d;
		System.out.println("a Int : " + a);
		System.out.println("b Double : " + b);
		System.out.println("c Int : " + c);
		System.out.println("d Double : "+ d);
	}
}