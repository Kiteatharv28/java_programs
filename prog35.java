class Demo{
             
        Demo(){
		System.out.println("In-constructor Demo");
		
	}
}
class Client{

	public static void main(String [] args){
             Demo obj=new Demo();
             int n=20;
	     for(int i=0;i<=n;i++){

			if(i%2==0){

				System.out.println(i);
			}
		}
	}
}
