class Shape{

	void getArea(){

		System.out.println("Area of shape");
	}
}

class Rectriangle{

         void getArea(){

		 int length=4;
		 int breadth=3;
		 int Area=length*breadt:h;
                         System.out.println("length ="+length);
		 System.out.println("Breadth="+breadth);
			 System.out.println("Area of rectriangle is"+Area);

	 }
}

class Display{

	public static void main(String [] args){

		Shape S1=new Shape();
		S1.getArea();

		Rectriangle R1=new Rectriangle();
		R1.getArea();

	}
}
