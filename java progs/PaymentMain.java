class Payment
{
	 double amount;

	Payment(double amount)
	{
		this.amount=amount;				
	}	

	void paymentDetails()
	{
		System.out.println("Hey user! U need to make payment of Rs. "+amount);
	}
}

class CashPayment extends Payment
{

	CashPayment(double x)
	{
		super(x);
	}
	void cashPaymentDetails()
	{
		super.paymentDetails();
		System.out.println("Payment is by cash");
	}
	
}
class CreditCardPayment extends Payment 
{
	long  CreditCardNumber ;
	String nameOnCard;
	int cvv;
	String expiryDate;
	
	
	CreditCardPayment(double amt,long ccn,String noc,int cvv,String ed)
	{	
		super(amt);
		CreditCardNumber=ccn;
		nameOnCard=noc;
		this.cvv=cvv;
		expiryDate=ed;	
	}
		
	void CreditCardPaymentDetails()
	{	
		super.paymentDetails();
		System.out.println("your credit card no. is :"+CreditCardNumber);
		System.out.println("your name of card. is :"+nameOnCard);
		System.out.println("your cvv. is :"+cvv);
		System.out.println("your expiry date of card. is :"+expiryDate);
	}	
}

class PaymentMain
{
	public static void main(String args[])
	{
		CashPayment cp=new CashPayment(2000.0);
		cp.cashPaymentDetails();
		System.out.println("=====================================");
		System.out.println("printing credit card payment details");
		CreditCardPayment ccp=new CreditCardPayment(4789.23,12345647,"Abhishek",245,"24th july 2020");
		ccp. CreditCardPaymentDetails();
	}
}
