class Home{

       void Work(){

	       System.out.println("HouseHold Work");
       }
}

class Office extends Home{

	void Work(){

		System.out.println("Offie Work");
	}
}
class Client{

	public static void main(String [] args){

		Home obj=new Home();
		Office obj1=new Office();
		obj.Work();
		obj1.Work();
	}
}

