class Vehicle{

void start(){
	System.out.println("Vehicle started");
}

}
class Car extends Vehicle{
	void start(){

System.out.println("Car started");
    }
}
class Main{
public static void main(String [] args){

     Vehicle v1=new Vehicle();
     v1.start();

     Car c1=new Car();
	     c1.start();
}
}
