class BankAcc{

	int accountNo=12;
	int balance =2000;
	int intrestRate=12;

	void deposit(){

		int NewBalance=balance+2000;
		System.out.println(NewBalance);
	}
}

class SavingAcc extends BankAcc{
	int accountNo=12;
        int balance =NewBalance;
        int intrestRate=12;
	int minbalance=500;;

	void Withdraw(){

		System.out.println(NewBalance-500);
	}
}

Class Demo{

	public static void main(String [] args){

	   BankAcc B1=new BankAcc();
	   B1.deposit();


	   SavingAcc S1=new SavingAcc();
	   S1.Withdraw();

	}
}
