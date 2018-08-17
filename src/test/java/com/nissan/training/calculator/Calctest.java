package com.nissan.training.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calctest {

	@Test
	public void test1() {
		Calc c= new Calc();
		assertEquals(10,c.add(5,5));
	}
	
	@Test
	public void test2() {
		Calc c= new Calc();
		assertEquals(0,c.sub(5,5));
	}

}
