class oopDemo{

	oopDemo(){

		System.out.println("in constructo demo");
	}
	int x=10;
	public static void main(String [] args){

		System.out.println("in main");

		oopDemo obj=new oopDemo();

		System.out.println(obj.x);
		System.out.println(obj.y);

	}
	int y=10;
}
