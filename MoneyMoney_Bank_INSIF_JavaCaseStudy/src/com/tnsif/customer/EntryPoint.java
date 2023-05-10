package com.tnsif.customer;

import com.tnsif.applicationPart.MMBankFactory;
import com.tnsif.applicationPart.MMCurrentAcc;
import com.tnsif.applicationPart.MMSavingAcc;
import com.tnsif.framework.BankFactory;
import com.tnsif.framework.CurrentAcc;
import com.tnsif.framework.SavingAcc;

public class EntryPoint {

	public static void main(String[] args) {
		
		//Class Upcasting
		BankFactory bf=new MMBankFactory();
		
		bf.getNewSavingAcc(101,"Raj",50000,true);
		
		bf.getNewCurrentAcc(102,"Dev",70000,2000);
	
	}

}
