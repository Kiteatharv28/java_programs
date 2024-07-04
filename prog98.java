class Parent{
	int x=10;
	Parent(){
		System.out.println("In parent constructor");
	}
	void acess(){
		System.out.println("In Parent Constructor");
	}
}
class child extends Parent{

	int y=20;
	child(){
		System.out.println("In child constructor");
		System.out.println(x);
		System.out.println(y);
	}
}
class Client{
	public static void main(String [] args){

		child obj=new child();
		obj.acess();
	}
}

