class A{

	void print_A(){

		System.out.println("Class A");
	}
}
class B extends A{

	void print_B(){

		System.out.println("Class B");
	}
}
class C extends A{

	void print_C(){

		System.out.println("Class C");
	}
}
class D extends A{

	void print_D(){

		System.out.println("Class D");
	}
}
class Client{

	public static void main(String [] args){

		B obj_B=new B();
		obj_B.print_A();
		obj_B.print_B();

		 C obj_C=new C();
                obj_C.print_A();
                obj_C.print_C();

                 B obj_B=new D();
                obj_D.print_A();
                obj_D.print_D();


                

	}
}
