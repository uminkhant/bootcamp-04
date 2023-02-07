package com.jdc.mkt;

public class DDDTest {

	public static void main(String[] args) {
		
	}
}

interface Four extends Three,Two{

	@Override
	default void doSomething() {
		Two.super.doSomething();
	}
	
}

interface One{
	default void doSomething() {}
}

interface Two extends One{
	@Override
	default void doSomething() {
		
		One.super.doSomething();
	}
}
interface Three extends One{
	@Override
	default void doSomething() {
		
		One.super.doSomething();
	}
}
