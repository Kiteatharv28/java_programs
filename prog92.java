class Demo{

	int numCourse=8;
	private String favCourse="CPP";

	void display(){
		System.out.println(numCourse);
		System.out.println(favCourse);
	}
}

class Student{

	public static void main(String [] args){

		Demo obj=new Demo();
		obj.display();
		System.out.println(obj.numCourse);
		System.out.println(obj.favCourse);
	}
}
