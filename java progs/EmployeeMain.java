class Address
{
	int hNo;
	String street,locality,city;
	int pinCode;
	
	Address(int hNo,String street,String locality,String city,int pinCode)
	{
		this.hNo=hNo;
		this.street=street;
		this.locality=locality;
		this.city=city;
		this.pinCode=pinCode;
	}

	void AddressDetails()
	{
		System.out.println("PRINTING THE ADDRESS DETAILS");
		System.out.println("======================================");
		System.out.println("the house no is "+hNo);
		System.out.println("the street is "+street);
		System.out.println("the locality is "+locality);
		System.out.println("the city is "+city);
		System.out.println("the pinCode is "+pinCode);
	}
	
}


class Employee
{
	int employeeId;
	String employeeName;
	double basicSalary;
	Address address;
	
	Employee(int empid,String empNm,double bsal,Address ad)
	{
		employeeId=empid;
		employeeName=empNm;
		basicSalary=bsal;
		address=ad;	
	}
	
	void employeeDetails()
	{
		address.AddressDetails();
		System.out.println("=========================================");
		System.out.println("PRINTING THE EMPLOYEE DETAILS");
		System.out.println("the employeeId is "+employeeId);
		System.out.println("the employeeName is "+employeeName);
		System.out.println("the basic salary is "+basicSalary);

	}
	
}

class PermanentEmployee extends Employee
{
	double providentFund;
	double hra;	
	
	PermanentEmployee(int empid,String empnm,double bsal,Address ad,double pFund,double hra)
	{
		super(empid,empnm,bsal,ad);
		providentFund=pFund;
		this.hra=hra;
	}

	void employeeDetails()
	{
		super.employeeDetails();
		System.out.println("provident Fund is "+providentFund);
		System.out.println("hra is "+hra);
	}
}

class EmployeeMain
{
	public static void main(String args[])
	{
		Address ad=new Address(10,"sc road","shibpur","howrah",711102);

		PermanentEmployee pe1=new PermanentEmployee(10,"abhishek",25000.0,ad,400,2000);
		pe1.employeeDetails();


			
	}
}