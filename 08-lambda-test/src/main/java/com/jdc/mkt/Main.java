package com.jdc.mkt;

public class Main {

	public static void main(String[] args) {

		// before lambda

		final String ss = "Myo thu";

		Human human = new Human() {

			@Override
			public String show(int a, String str) {
				System.out.println("Hello lambda :" + a);
				return ss;

			}
		};

		human.show(34, "Thiha");

		class Person {
			String doSome() {
				return ss;
			}
		}
		
		

	}

}
