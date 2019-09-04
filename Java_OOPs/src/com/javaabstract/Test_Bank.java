package com.javaabstract;

public class Test_Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFC hd = new HDFC();
		
		hd.credit();
		hd.debit();
		hd.loan();
		hd.transaction();
		
		
		
		Bank b = new HDFC();	//b - reference variable.
		b.credit();
		b.loan();
		

	}

}
