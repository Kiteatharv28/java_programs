class Demo{

	void pattern(){

	  int n=6;
            
	  for(int i=0;i<=n;i++){
		  for(int j=0;j<=n;j--){

			  System.out.print(j+"  ");
		  }
		  System.out.println();
	  }
	}
}
class Client{

	public static void main(String [] args){

		Demo obj=new Demo();

		obj.pattern();
	}
}

