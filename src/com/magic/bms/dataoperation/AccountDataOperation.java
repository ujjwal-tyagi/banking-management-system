package com.magic.bms.dataoperation;

import com.magic.bms.beans.Accounts;

public interface AccountDataOperation {

	public abstract boolean writeToFile(Accounts accounts);
	
	public abstract boolean readFromFile();
}
