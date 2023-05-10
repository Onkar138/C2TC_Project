package com.tnsif.framework;

public abstract class CurrentAcc extends BankAcc{
	
	private final float creditLimit = 20000;

	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
	}
	
	@Override
	public abstract void withdrow(float accBal);
	@Override
	public abstract void deposite(float accBal); 
	
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getCreditLimit()=" + getCreditLimit() + ", toString()="
				+ super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()="
				+ getAccBal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public float getCreditLimit() {
		return creditLimit;
	}
}
