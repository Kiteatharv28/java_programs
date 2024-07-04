class Demo{

	int Noofcourses=8;
	String FavCourse="cpp";

	void display(){

		System.out.println(Noofcourses);
		System.out.println(FavCourse);
	}
}

class Student{

	public static void main(String [] args){

		Demo obj=new Demo();
		obj.display();
	}
}
