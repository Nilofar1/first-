package com.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Person {
	/*//@Parameters({ "url" })
	@Test
	public void personname(String url) {
		System.out.println("name of person");
		System.out.println("url: " + url);
	}*/

	@Test
	public void noofperson() {
		System.out.println("no.of person");
	}

	@Test
	public void personadd() {
		System.out.println("add of person");
	}

	@Test
	public void personcity() {
		System.out.println("city of person");
	}
}
