package com.tns.encapsulation;

public class testencapsulation {

	public static void main(String[] args) {
		Account acc= new Account();
		acc.setAcc_no(95753892);
		acc.setName("Adesh");
		acc.setEmail("gaonkaradesh017@gmail.com");
		acc.setAmount(90000.57f);
		
		System.out.println("Your account is : " + acc.getAcc_no() + " " + acc.getName()+ " "+ acc.getEmail() + " " + acc.getAmount());
		

	}

}
