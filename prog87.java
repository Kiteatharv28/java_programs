class oopDemo{

	oopDemo(){
		System.out.println("In constuctor");
	}
	void fun(){

		oopDemo obj=new oopDemo();
	}
	public static void main(String [] args){

		oopDemo obj1=new oopDemo();
                oopDemo obj2=new oopDemo();

	        obj1.fun();
	}
}


