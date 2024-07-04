class Demo{
     void fun(){

	  int n=7;
       int number;
	     for(int i=0;i<n;i++){
                    number=1;
		     for(int j=0;j<=i;j++){

			     System.out.print(number+" ");

			     number++;
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
