class Demo{
void fun(){
	int n=6;
        int num=1;   
	for(int i=0;i<=n;i++){

		for(int j=0;j<=n-i;j++){

			System.out.print(" ");
		}
		for(int j=1;j<=2*i-1;j++){

			System.out.print("*");
		}
		System.out.println();
	}
     }
}

class Client{

	public static void main(String [] args){

		Demo obj= new  Demo();

		obj.fun();
	}
}

