class StringDemo {

	public static void main(String [] args){



		StringBuffer str1= new StringBuffer("Atharv");

		StringBuffer rev=new StringBuffer("");

                char ch[]=str1.toCharArray;

		for(int i=ch.length-1;i>=0;i--){


			rev=rev+ch[i];

		}

		System.out.println(rev);

	}
}




