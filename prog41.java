class Demo{

	void fun(){

		int n=6;

		for(int i=1;i<=n;i++){

			for(int j=1;j<i;j++){

				System.out.print("  ");
			}

			for(int j=i;j<=n;j++){

				if(j==i||j==n||i==1){

					System.out.print("*  ");
				}
				else{

					System.out.println("  ");
				}
				System.out.println();
			}
			for(i=n-1;i>=1;i--){
				for(int j=1;j<i;j++){

					System.out.print(" ");
				}
				for(int j=i;j<=n;j++){
					if(j==i||j==n||i==1){
                                                 System.out.print("* ");
					}
					else{
						System.out.print(" ");
					}
					System.out.println();
				}
			}
		
		}
      }
}
class Client{

	public static void main(String [] args){

		Demo obj=new Demo();
		obj.fun();
	}
}
