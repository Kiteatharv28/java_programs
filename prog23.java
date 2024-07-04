//amstrong no


class Amstrong{

	public static void main(String [] args){

		int N=153;
		int sum=0;
		int temp=N;



		while(N!=0){

			int rem=N/10;

			sum=sum+(rem*rem*rem);

				N=N/10;
		}
		if(temp==sum){
			System.out.println("No is Amstrong");
		}
		else{
			System.out.println("No is not amstrong");
		}
	}
}
