import java.util.Scanner;

class CheckingAccount2 {
	String accountNumber;
	String accountHolder;
	private int balance;
	CheckingAccount2(String accNumber, String Holder, int start) {
		this.accountNumber = accNumber;
		this.accountHolder = Holder;
		this.balance = start;
	}
	public int WithdrawMoney(){
		System.out.print("Enter your value:")
		Scanner input = new Scanner(System.in);
		int money = input.nextInt();
		if(money > this.balance)
			System.out.println("Uldegdel hureltsehgui bna");
		else
			this.balance = this.balance - money;
		return this.balance;
	}

}
class CheckingAccount2Tester {
	public static void main( String[] args ) {
		CheckingAccount account1 = new CheckingAccount( "123", "Bob", 100 );
		CheckingAccount account2 = new CheckingAccount( "92a-44-33", "Kathy Emerson", 0);
		System.out.println( account1.accountNumber + " " + account1.WithdrawMoney() + " $" + account1.accountHolder );
		System.out.println( account2.accountNumber + " " + account2.WithdrawMoney() + " $" + account2.accountHolder );
	}
}
