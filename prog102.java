class Employee{

	int Salary=60000;
	}
class Engineer extends Employee{

	int benefits=10000;
}
class Client{
	public static void main(String [] args){
		Engineer E1= new Engineer();
		System.out.println("Salary: "+E1.Salary + "\nBenefits :"+E1.benefits);
	}
}

	
