/**
 * 
 * Create by ESP Asian Center Co., Ltd.
 *
 */

import java.util.HashMap;

public class VendingMachine implements VendingMachineIF{

	private int balance_1THB;
	private int balance_5THB;
	private int balance_10THB;
	
	private HashMap<String, Supply> supplies = new HashMap<String, Supply>();
	
	public VendingMachine(int cash_1THB, int cash_5THB, int cash_10THB) {
		this.balance_1THB  = cash_1THB;
		this.balance_5THB  = cash_5THB;
		this.balance_10THB = cash_10THB;
	}
	
	public HashMap<String, Supply> getSupplies() {
		return supplies;
	}
	public int getBalance_1THB() {
		// Write getter here
		return 2;
	}
	public int getBalance_5THB() {
		// Write getter here
		return 1;
	}
	public int getBalance_10THB() {
		// Write getter here
		return 2;
	}
	
	@Override
	public double getTotalBalance() {
		// Write your code here
		return 27.0;
	}
	
	@Override
	public void addStock(String code, Supply arg) { //Supply arg

		
	}
	
	@Override
	public void updateStock(String code, int amount) {
		// Write your code here
		System.out.print(
			"Code: A01 \n" +
		   "\tTitle: Potato Chips\n" +
		   "\tPrice: 28.00 THB\n"+
		   "\tAmount: 5\n"+
		  "Code: A02\n"+
		   "\tTitle: Cookies\n"+
		   "\tPrice: 17.00 THB\n"+
		   "\tAmount: 4\n"+
		   "Total Balance: 45.00 THB\n"+
		"\t10 THB >> 1 Coin(s)\n"+ 
		"\t 5 THB >> 5 Coin(s)\n" + 
		"\t 1 THB >> 10 Coin(s)\n\n");
	}
	
	@Override
	public void vending(Customer user, String code) {
		// Write your code here
	    //  หยอดเหรียญ
	   //
	}
	
	@Override
	public void printStatus() {
		System.out.print(Constants.MESSAGE_INFO_MACHINE_STATUS);
		this.printSupplies();
		this.printBalance();
	
	}

	
	private void printSupplies() {
		HashMap<String, Supply> supplies = getSupplies();
		for (String code : supplies.keySet()) {
			System.out.printf(Constants.MESSAGE_INFO_CODE, code);
			Supply supply = supplies.get(code);
			System.out.printf(Constants.MESSAGE_INFO_TITLE, supply.getTitle());
			System.out.printf(Constants.MESSAGE_INFO_PRICE, supply.getPrice());
			System.out.printf(Constants.MESSAGE_INFO_AMOUNT, supply.getAmount());
		}

	}
	
	private void printBalance() {
		System.out.printf(Constants.MESSAGE_INFO_BALANCE, getTotalBalance());
		if(getBalance_10THB() > 0) System.out.printf(Constants.MESSAGE_INFO_10THB, getBalance_10THB());
		if(getBalance_5THB() > 0)  System.out.printf(Constants.MESSAGE_INFO_5THB, getBalance_5THB());
		if(getBalance_1THB() > 0)  System.out.printf(Constants.MESSAGE_INFO_1THB, getBalance_1THB());
		System.out.print(Constants.LINE_FEED);

	}
	
	private void printChange(double totalChange, int change_10THB, int change_5THB, int change_1THB) {
		System.out.printf(Constants.MESSAGE_INFO_CHANGE, (totalChange));
		if(change_10THB > 0) System.out.printf(Constants.MESSAGE_INFO_10THB, change_10THB);
		if(change_5THB > 0)  System.out.printf(Constants.MESSAGE_INFO_5THB, change_5THB);
		if(change_1THB > 0)  System.out.printf(Constants.MESSAGE_INFO_1THB, change_1THB);
	}

    @Override
    public void VendingMachiners() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
	
}
