package com.cg.dao;

import java.util.HashMap;
import java.util.Map;

import javax.swing.plaf.synth.SynthSpinnerUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cg.bean.Account;

public class AccountDAOImpl implements AccountDAO{
	
    Map<Long,Account> acc=new HashMap<Long,Account>();
        
	@Override
	public Account addAccount(Account ob){
		// TODO Auto-generated method stub
		acc.put(ob.getMobile(), ob);
		acc.put(ob.getMobile(), ob);
		return ob;	}

	@Override
	public boolean updateAccount(Account ob) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean deleteAccount(Account ob){
		// TODO Auto-generated method stub
		acc.remove(ob.getAid());
		return true;
	}

	@Override
	public Account findAccount(Long mobileno){
		// TODO Auto-generated method stub
		Account ob=acc.get(mobileno);
				
		return ob;
	}

	@Override
	public Map<Long, Account> getallAccount(){
		// TODO Auto-generated method stub
		
		return acc;
	}
	

}
