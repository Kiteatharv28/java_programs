//palindrome number

class Palindrome{

	public static void main(String [] args){

		int N=2332;
		int rev=0;
		int temp=N;

		while(N!=0){
			int rem=N%10;

			rev=rev*10+rem;
			N=N/10;
		}

		if(temp==rev){
			System.out.println(temp  +"is palindrome number");
		}
		else{
			System.out.println(temp  +"is not palindrome number ");
		}
	}
}

