class Parent{

	static int x=10;
static{
	System.out.println("In parent static block");
}
 static void acess(){

	 System.out.println(x);
    }
}

class Child extends Parent{
	static{
		System.out.println("In child constructor");
	System.out.println("In child ststic ");
	acess();
	}
}
class Client{

	public static void main(String [] args){
		System.out.println("In main");
		Child obj=new Child();
	}
}
