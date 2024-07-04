class Demo{

	String ProjName="Online education";
	int noofEmployee=20;

	void clientInfo(){

		String ClientName="MESCOE";
		System.out.println(ClientName);
		System.out.println(ProjName);
		System.out.println(noofEmployee);
	}
}

class Demo2{

	public static void main(String [] args){

		Demo obj=new Demo();
		obj.clientInfo();
	}
}
