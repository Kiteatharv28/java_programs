class Demo{

	void pattern(){

		int n=6;

		for(int i=1;i<=n;i++){
                   for(int j=1;j<=n-1;j++){
                           System.out.print(" ");

		   }
		   for(int j=1;j<=1;j++){

			   System.out.print(i+" ");
		   }
		   System.out.println();
		}
	}
}
class Client{

	public static void main(String [] args){

		Demo obj= new Demo();
                  obj.pattern();
	}
}




