package com.jdc.mkt;

public enum Data {

	PERSON {
		@Override
		public void show() {
			System.out.println("person");
			
		}
	},HUMAN {
		@Override
		public void show() {
		System.out.println("Human");
			
		}
	},CHILD {
		@Override
		public void show() {
		System.out.println("child");
			
		}
	};
	
	private String name;
	static int age;
	
	 Data() {
		// TODO Auto-generated constructor stub
	}
	static void doSome() {}
	
	public abstract void show();
	
	
}
