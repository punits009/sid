package com.cg.bean;

public class SavingAccount extends Account{
	private double interest;
	private final double Min_Balance=1000.00;
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}
	public SavingAccount(int aid, int mobile, String accountholder, double balance) {
		super(aid, mobile, accountholder, balance);
		// TODO Auto-generated constructor stub
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	@Override
	public String toString() {
		return super.toString()+"SavingAccount [interest=" + interest + "]";
	}
	
	

}
