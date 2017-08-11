package org.multiplinheritance;

interface A{
	default void doSth(){
		System.out.println("Inside A");
	}
}

interface B{
	default void doSth(){
		System.out.println("Inside B");
	}
}

interface C extends A{
	default void doSth(){
		System.out.println("Inside C");
	}
}

public class App implements  A{

	
	public void doSth() {
		//B.super.doSth();
		System.out.println("Inside App");
	}
	public static void main(String[] args) {
		
		A obj = new App();
		obj.doSth();

	}

}
