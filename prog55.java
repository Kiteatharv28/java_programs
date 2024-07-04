class Demo{

	void fun(){

		int row=5;

		for(int i=1;i<=row;i++){

			for(int j=1;j<=i;j++){

				System.out.print(j+"*  ");

			}
			System.out.println();
		}
	}
}
class Client{

	public static void main(String [] args){

		Demo obj=new Demo();
		obj.fun();
	}
}



