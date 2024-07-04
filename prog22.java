//perfect no  
    
class PerfectNo{

	public static void main(String [] args){

		int N=6;
		int sum=0;
		for(int i=1;i<N;i++){

			if(N%i==0){
				sum=sum+i;
			}
		}
		if(sum==N){
			System.out.println("perfrct no");
		}
		else{
                        System.out.println("not perfect no");
		}
	}
}
