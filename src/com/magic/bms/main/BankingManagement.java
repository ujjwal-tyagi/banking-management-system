package com.magic.bms.main;

import java.util.Scanner;

import com.magic.bms.applicationlogic.AccountManagerImpl;
import com.magic.bms.beans.Accounts;
import com.magic.bms.dataoperation.AccountDataOperationImpl;

public class BankingManagement {

	/**
	 * @param args
	 */
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		AccountDataOperationImpl accountDataOperationImpl=new AccountDataOperationImpl();
		
		
		while(true)
		{
			
		Accounts accounts=new Accounts();
		AccountManagerImpl accountManager = new AccountManagerImpl();
		
		System.out.println("Press c to create account");
		System.out.println("Press t for transaction");
		System.out.println("Press s to show accounts");
		 
		 sc=new Scanner(System.in);
		char option = sc.next().charAt(0);
		
		
		switch(option)
		{
			case 'c':
				
				System.out.println("Enter Account Name");
				accounts.setAccountName(sc.next());
				
				
				System.out.println("Enter Account Number");
				accounts.setAccountNo(sc.nextInt());
				
				
				System.out.println("Enter Account Type");
				accounts.setAccountType(sc.next());
			
				
				System.out.println("Enter Initial Amount");
				accounts.setAccountBalance(sc.nextInt());
				
				
				accountManager.createAccount(accounts);
			    break;
			    
			case 't':
				System.out.println("Enter type of transaction '0' for debit and '1' for credit ");
				int tr=sc.nextInt();
				if(tr==0)
				{
					//debit
					
				}
				else if (tr==1)
				{
					//credit
				}
				else 
				{
				System.out.println("You entered wrong input.");
				
				}
				break;
				
			case 's':
				accountDataOperationImpl.readFromFile();
				
		} //switch
		
			
	}//while

}//main
}//class