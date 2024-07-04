class Temprature{

	public static void main(String [] args){

		float temp=98.3f;

		if(temp>98.6f){

			System.out.println("Tempreture is High");

		}else if(temp>=98 && temp<=98.6) {
			System.out.println("Tempreture is normal");
		}
		else{
			System.out.println("Temreture is low");
		}
	}
}
