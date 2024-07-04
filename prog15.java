class Division{

	public static void main(String [] args){
		int x=15;

		if(x%3==0 && x%5==0){

			System.out.println("fizz-bizz");
		}
		else if(x%3==0){

			System.out.println("fizz");
		}
		else if(x%5==0){

			System.out.println("bizz");
		}
		else{
			System.out.println("not divisible by both");
		}
	}
}
