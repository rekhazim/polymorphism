package org.remo;

public class B {
	public int b1(int a, int b) {
		int c = a+b;
		return c;
	}
public String b1(String a, String b) {
	String c = a+b;
	return c;
}
public void b1() {
System.out.println("Method without return type");
}
public static void main(String[] args) {
	B b = new B();
	b.b1();
	int b1 = b.b1(10, 20);
	System.out.println(b1);
	String b12 = b.b1("a", "z");
	System.out.println(b12);
}
}
