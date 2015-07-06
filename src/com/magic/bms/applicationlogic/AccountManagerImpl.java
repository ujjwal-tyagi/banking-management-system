package com.magic.bms.applicationlogic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.magic.bms.beans.Accounts;
import com.magic.bms.dataoperation.AccountDataOperationImpl;



public class AccountManagerImpl implements AccountManager{
	
	AccountDataOperationImpl accountDataOperationImpl=new AccountDataOperationImpl();
	
	
	public boolean createAccount(Accounts account) {
		
		   
		    
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date date = new Date();
			
		    account.setCreatedOn(dateFormat.format(date));
		    
		    accountDataOperationImpl.writeToFile(account);
		   
		  
		
		return true;
	}

	
	

}
