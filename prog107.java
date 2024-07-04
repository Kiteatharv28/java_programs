class Vehicle{

	void Drive(){

		System.out.println("Driving the car");
	}
}

class Car extends Vehicle{

	void Drive(){

		System.out.println("Repairing a car");


  }
}
class Client{

	public static void main(String [] args){

		Vehicle obj=new Vehicle();
		Car obj1=new Car();
		obj.Drive();
		obj1.Drive();
	}
}
