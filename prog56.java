class Demo{

	void fun(){

		int i,j,k=1;

		for(i=1;i<=5;i++){
			for(j=1;j<i+1;j++){

				System.out.print(k++ +" ");
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
