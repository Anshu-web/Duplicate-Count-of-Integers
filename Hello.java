package com.test;

public class Hello {

	public static void main(String[] args) {

		Test h = new Test();

		h.a++;
		h.b++;
		h.a++;

		Test h1 = new Test();

		h1.a++;
		h1.b++;
		h1.b++;
		h1.b++;

		System.out.println(h.a + " " + h.b);

	}
}

class Test {

	public static int a = 10;
	public int b = 20;

}
