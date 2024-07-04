class Shape{

	void getArea(){

		System.out.println("Area of shape");
	}
}

class Rectriangle extends Shape{

	void getArea(){

		System.out.println("Length*Breadth");
	}
}
class Client{
	public static void main(String [] args){

		Shape obj=new Shape();
		Rectriangle obj1=new Rectriangle();
		obj.getArea();
		obj1.getArea();
	}
}
