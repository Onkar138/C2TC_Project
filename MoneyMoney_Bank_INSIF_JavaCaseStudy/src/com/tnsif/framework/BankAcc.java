package com.tnsif.framework;

public abstract class BankAcc {

	private final int accNo;
	private String accNm;
	private final float accBal;
	
	public BankAcc(int accNo,String accNm,float accBal) {
		this.accNo=accNo;
		this.accNm=accNm;
		this.accBal=accBal;
	}
	
	public abstract void withdrow(float accBal);
	
	public abstract void deposite(float accBal);
	
	@Override
	public String toString() {
		return "SavingAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public int getAccNo() {
		return accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getAccBal() {
		return accBal;
	}
	
	//declare methods
			public void withdraw(float amount) {
				System.out.println("Withdrawn amount is: "+amount);
			}
			public void deposit(float amount) {
				System.out.println("Total amount deposited is: "+amount);
			}

}
