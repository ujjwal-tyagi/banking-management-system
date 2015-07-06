package com.magic.bms.dataoperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.magic.bms.beans.Accounts;
import com.magic.bms.collection.AccountList;

public class AccountDataOperationImpl implements AccountDataOperation {

	AccountList accountList= new AccountList();
	
	public boolean writeToFile(Accounts account) {
		
		try{
        
        accountList.add(account);
			
		FileOutputStream fos = new FileOutputStream("accounts.ser",true);
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(accountList);
		oos.close();
		
	   }
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	    catch (IOException e) {
			e.printStackTrace();
		}
		
		return true; 
	}
	
	
	
	public boolean readFromFile() {
		try{
			
			
			FileInputStream fis = new FileInputStream("accounts.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			AccountList result = (AccountList) ois.readObject();
			
			for(Accounts acc :result){
				System.out.println("Name:"+acc.getAccountName());
			}
			
			ois.close();
			
			
		   }
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		
		    catch (IOException e) {
				e.printStackTrace();
				
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
		
		return true;
	}

	

}
