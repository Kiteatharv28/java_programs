class Demo{

	void fun(){

		int row=5;
		

		for(int i=0;i<=row;i++){

			for(int j=0;j<=i;j++){

				System.out.print("*"+" ");
			}
			System.out.println();
	}
	for(int i=row-1;i>=0;i--){
		for(int j=0;j<=i-1;j++){

			System.out.print("*"+" ");
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
