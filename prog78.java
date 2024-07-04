class ArrayDemo{

	public static void main(String [] args){

		int arr=new int [2][3];

		int arr[0][0]=2;
		 int arr[0][1]=4;
		int arr[0][2]=6;
		int arr[1][0]=8;
		 int arr[1][1]=10;
		 int arr[1][2]=12;

	for(int i=0;i<2;i++){
		for(int j=0;j<3;j++){

			System.out.println(arr[i][j]);
		}
	}
	}
}
