class Employee{

	int EmpId=10;
	String str="kanha";


	void EmpInfo(){

		System.out.println("ID ="+ EmpId);
		System.out.println("Name="+str);

	}
}

class Client{

	public static void main(String [] args){

		Employee obj=new Employee();
		obj.EmpInfo();
	}
}


