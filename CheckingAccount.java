class CheckingAccount {
	String accountNumber;
	String accountHolder;
	private int balance;
	CheckingAccount(String accNumber, String Holder, int start) {
		this.accountNumber = accNumber;
		this.accountHolder = Holder;
		this.balance = start;
	}
	public int getBalance() {
 		return this.balance;
 	}

}
class CheckingAccountTester {
	public static void main( String[] args ) {
	CheckingAccount account1 = new CheckingAccount( "123", "Bob", 100 );
	CheckingAccount account2 = new CheckingAccount( "92a-44-33", "Kathy Emerson", 0);
	System.out.println( account1.accountNumber + " " + account1.getBalance() + " $" + account1.accountHolder );
	System.out.println( account2.accountNumber + " " + account2.getBalance() + " $" + account2.accountHolder );
	}
}
