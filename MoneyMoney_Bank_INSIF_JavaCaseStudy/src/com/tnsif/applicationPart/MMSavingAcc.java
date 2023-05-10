package com.tnsif.applicationPart;

import java.util.Scanner;

import com.tnsif.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{

	private static final float MINBAL = 500; 
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalarie) {
		super(accNo, accNm, accBal, isSalarie);
	}

	@Override
	public void withdrow(float accBal) {
		System.out.println("Withdrow The Amount In SavingAcc");
		System.out.println("Dear "+getAccNm());
		System.out.println("Your Account Number is: "+getAccNo());
		System.out.println("Enter Amount For Withdrowing: ");
		Scanner s1=new Scanner(System.in);
		float a = s1.nextFloat();
		float sub=getAccBal()-a;
		if (sub>=MINBAL) {
			System.out.println("Collect Your Cash: "+a);
			System.out.println("After Withdrowing Your Account Balance are: "+sub);
		} else {
			System.out.println("Your Account Balance Is Not Sufficient Your Account Balance are : "+getAccBal());
			System.out.println("You Keep Maintain Minimum Account Balance Is: "+MINBAL);
		}
	}

	@Override
	public void deposite(float accBal) {
			
	} 
	
	public static float getMinbal() {
		return MINBAL;
	}

	@Override
	public String toString() {
		return "MMSavingAcc [MINBAL=" + MINBAL + ", toString()=" + super.toString() + ", isSalarie()=" + isSalarie()
				+ ", getMINBAL()=" + getMINBAL() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
