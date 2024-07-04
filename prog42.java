class Demo{

	void fun(){

		int i,j,space=1;
		int row=6;
		space=row-1;

		for(j=1;j<row;j++){
			for(i=1;i<=space;i++){

				System.out.print(" ");
			}
			space--;
			for(i=1;i<=2*j-1;i++){

				System.out.print("* ");
			}
			System.out.print("");
		}
		space++;
		for(i=1;i<=2*(row-j)-1;i++){
			System.out.print("* ");
		}
		System.out.println();
	}
}

class Client{
	public static void main(String [] args){
 
		Demo obj=new Demo();
		obj.fun();
	}
}
