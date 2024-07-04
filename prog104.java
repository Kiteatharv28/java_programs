class One{

	public void print_geek(){

		System.out.println("Geeks");
	}
}
class Two extends One{
	public void Print_for(){
		System.out.println("For");
	}
}
class Three extends Two{
	public void Print_geek(){
		System.out.println("Geeks");
	}
}
class Client{

	public static void main(String [] args){

		Three g=new Three();
		Two g1=new Two();
		g.print_geek();
		g.print_for();
		g.print_geek();
	}
}
