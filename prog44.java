class Demo{

	void fun(){

		int i,j,k;
		int row=9;
		 for(i=row;i>=1;i--){
			 for(j=i;j<row;j++){

				 System.out.print(" ");
			 }
			 for(k=1;k<=(2*i-1);k++){
				 if(k==1||i==row||k==(2*i-1)){
					 System.out.print("*");
				 }
				 else{
					 System.out.print(" ");
				 }
			 }System.out.println(" ");
		 }
	}
}

class Client{
      public static void main(String [] args){

	      Demo obj=new Demo();
	      obj.fun();
      }
}

