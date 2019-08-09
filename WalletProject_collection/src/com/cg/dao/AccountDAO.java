package com.cg.dao;
import java.sql.SQLException;
import java.util.Map;

import com.cg.bean.*;

public interface AccountDAO {
	public Account addAccount(Account ob);
	public boolean updateAccount(Account ob);
	public boolean deleteAccount(Account ob) ;
	public Account findAccount(Long mobileno) ;
	public Map<Long,Account> getallAccount();

}
