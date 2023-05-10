package com.tnsif.applicationPart;

import com.tnsif.framework.BankFactory;
import com.tnsif.framework.CurrentAcc;
import com.tnsif.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		
		//Class Upcasting
		SavingAcc sa=new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		sa.withdrow(sa.getMINBAL());
		sa.toString();
		return sa;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		
		//Class Upcasting
		CurrentAcc ca=new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		ca.deposite(ca.getCreditLimit());
		ca.toString();
		return ca;
	}

}
