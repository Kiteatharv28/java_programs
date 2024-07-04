class Employee{

	private int salary;

	public Employee(int salary){
		this.salary=salary;
	}
	void work(){

		System.out.println("Working as an employee");
	
	}
      public int getSalary(){
	      return salary;
}
}

class HRManager extends Employee{

	 HRManager(int salary){
		 super(Salary);
	 }
	 void work(){
		System.out.println("Managing Employee");
	 }
	 void addEmployee(){
		 System.out.println("Adding new Employee");
	 }
}
class Client{

	public static void main(String [] args){

		Employee emp=new Employee(40000);
		HRManager mgr=new HRManager(70000);
                emp.getSalary();
		mgr.getSalary();
		emp.work();

	}
}



