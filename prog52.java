class Demo{
             Demo(){
                System.out.println("In Demo constructor");

}
	void fun(){

		int row=5;

		for(int i=0;i<=row;i++){
			for(int j=row;j>=i;j--){

				System.out.print("*");

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
