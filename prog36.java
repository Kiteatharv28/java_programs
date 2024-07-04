class Client{

	void factorial(){

             int n=6;
             int fact=1;
             for(int i=1;i<=n;i++){

                      fact=fact*i;
	     }
	System.out.println(fact);
	}
}

class Demo{

	public static void main(String [] args){

		Client obj=new Client();
	           obj.factorial();
	}


}





