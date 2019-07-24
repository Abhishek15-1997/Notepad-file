class Account
{
	int accountId;
	String accountHolderName;
	int initialBalance;
	String accountType;
	String bankName;
	
	Account(int ac_id,String ac_holdername,int ini_bal,String ac_type,String bnk_name)
	{
		accountId=ac_id;
		accountHolderName=ac_holdername;
		initialBalance=ini_bal;
		accountType=ac_type;
		bankName=bnk_name;
	}

	Account(int ac_id,String ac_holdername)
	{
		accountId=ac_id;
		accountHolderName=ac_holdername;
		
	}

	int getBalance()
	{
		return initialBalance;
	}

	void deposite(int dep_val)
	{
		initialBalance+=dep_val;
		System.out.println("deposit amount is "+initialBalance);
	}
	
	void withdraw(int withdraw_bal)
	{	
		if(initialBalance>=withdraw_bal)
		{
			initialBalance-=withdraw_bal;	
			System.out.println("withdrawing amount is "+initialBalance);
		}

		else
		System.out.println("your balance is less than withdrawing amount");
	}

}

class AccountMain
{
	public static void main(String args[])
	{	
		int id=Integer.parseInt(args[0]);
		int bal=Integer.parseInt(args[2]);

		Account a1=new Account(id,args[1],bal,args[3],args[4]);
		System.out.println("your balance is "+a1.getBalance());
		a1.deposite();
		a1.withdraw(bal);

		Account a2=new Account(id,args[1]);
		System.out.println("your balance is "+a2.getBalance());
		a2.deposite(bal);
		a2.withdraw(bal);


		


	
	}
}