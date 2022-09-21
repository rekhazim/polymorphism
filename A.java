package org.remo;

public class A extends B {
	@Override
	public int b1(int a, int b) {
		int c = a + b;
		return c;
	}
@Override
	public String b1(String a, String b) {
		String c = a + b;
		return c;
	}
@Override
	public void b1() {
		System.out.println("Method without return type");
	}
}
