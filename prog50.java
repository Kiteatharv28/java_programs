class Demo{
	void fun(){

		int i,j,rows=9;
		
		for(i=rows;i>=1;i--){
			for(j=1;j<=i;j++){

                           System.out.print(j+" ");
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
