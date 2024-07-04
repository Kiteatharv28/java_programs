import java.util.*;
class Loops{

      public static void main(String [] args){

                Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int coloumns=sc.nextInt();

		for(int i=0;i<=rows;i++){
			for(int j=rows;j>=i;j--){

				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){

				System.out.print("*");
			}
			System.out.println();
		}
      }
}
