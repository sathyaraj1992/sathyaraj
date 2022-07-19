package org.sathya;

public class Customer {
	String name,city;
	int id,adharNo,dateOfBirth;
	public Customer(String customerName, int customerId, int adharNo, String cityName) {
      name=customerName;
      city=cityName;
      id=customerId;
      dateOfBirth=adharNo;
      System.out.println("this is constructor invoking");
	}
	public Customer(int No) {
	adharNo=No;
	}
	public static void main(String[] args) {
		Customer selvam = new Customer("selvam",12345,1025,"madurai");
		Customer anbu = new Customer(5678);
	//selvam.applyLoan();
		//anbu.applyLoan();
	}
    private void applyLoan() {
	System.out.println("Customer Name is"+name);
System.out.println("customer id is "+id);
System.out.println("Customer date of birth"+dateOfBirth);
System.out.println("customer city name"+city);
System.out.println("adhar no is"+adharNo);
}
}
