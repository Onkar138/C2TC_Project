package com.tnsif.applicationPart;

import java.util.Scanner;

import com.tnsif.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}
	
	@Override
	public void withdrow(float accBal) {
		
	}
	
	@Override
	public void deposite(float accBal) {
		System.out.println("_____________________________________________________");
		System.out.println("Deposite The Amount In CurrentAcc");
		System.out.println("Dear "+getAccNm());
		System.out.println("Your Account Number is: "+getAccNo());
		System.out.println("Your Account Balance are : "+getAccBal());
		System.out.println("Enter Amount For Deposite In Your Account: ");
		Scanner s1=new Scanner(System.in);
		float a = s1.nextFloat();
		float b=getCreditLimit();
		if (a<=b) {
			float sum=getAccBal()+a;
			System.out.println("After Crediting Your Account Balance are: "+sum);
		} else {
			System.out.println("Your Account CreditLimit are: "+getCreditLimit());
		}
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getCreditLimit()=" + getCreditLimit()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
