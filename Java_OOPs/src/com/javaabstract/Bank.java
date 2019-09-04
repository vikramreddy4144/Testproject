package com.javaabstract;

public abstract class Bank {
	
	public abstract void loan();//abstarct method- no method
	
	public void credit() {
		System.out.println("credit");
	}
public void debit() {
	System.out.println("debit");
	}
public void transaction() {
	System.out.println("transaction");
	
}
}
