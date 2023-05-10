package com.tnsif.framework;

public abstract class SavingAcc extends BankAcc{

	private final boolean isSalarie=true;
	private static final float MINBAL=500; 
	
	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalarie) {
		super(accNo, accNm, accBal);
	}
	
	@Override
	public abstract void withdrow(float accBal);
	@Override
	public abstract void deposite(float accBal);
	
	@Override
	public String toString() {
		return "SavingAcc [isSalarie=" + isSalarie + ", MINBAL=" + MINBAL + ", isSalarie()=" + isSalarie()
				+ ", getMINBAL()=" + getMINBAL() + ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	public boolean isSalarie() {
		return isSalarie;
	}

	public float getMINBAL() {
		return MINBAL;
	}
}
