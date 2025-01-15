/**
 * 
 * Create by ESP Asian Center Co., Ltd.
 *
 */

public class Constants {
	
	//Currency rate
	public static final int CURRENCY_1THB  = 1;
	public static final int CURRENCY_5THB  = 5 ;
	public static final int CURRENCY_10THB = 10;
	
	//Message
	public static final String LINE_FEED = "\n";
	public static final String MESSAGE_INFO_MACHINE_STATUS = "==== User Status ===="+LINE_FEED;
	//public static final String MESSAGE_INFO_MACHINE_STATUS = "==== Vending Machine Status ===="+LINE_FEED;
	public static final String MESSAGE_INFO_USER_STATUS = "==== User Status ===="+LINE_FEED;
	public static final String MESSAGE_INFO_ORDER_STATUS = "==== Order Status ===="+LINE_FEED;
	public static final String MESSAGE_INFO_CODE = "Code: %s"+LINE_FEED;
	public static final String MESSAGE_INFO_TITLE = "     Title: %s"+LINE_FEED;
	public static final String MESSAGE_INFO_PRICE = "     Price: %.2f THB"+LINE_FEED;
	public static final String MESSAGE_INFO_AMOUNT = "    Amount: %d"+LINE_FEED;
	public static final String MESSAGE_INFO_BALANCE = "Total Balance: %.2f THB"+LINE_FEED;
	
	public static final String MESSAGE_INFO_ORDER = "Your order: %s"+LINE_FEED;
	public static final String MESSAGE_INFO_CHANGE = "Change: %.2f THB"+LINE_FEED;
	public static final String MESSAGE_INFO_10THB = "     10 THB >> %d Coin(s)"+LINE_FEED;
	public static final String MESSAGE_INFO_5THB  = "      5 THB >> %d Coin(s)"+LINE_FEED;
	public static final String MESSAGE_INFO_1THB  = "      1 THB >> %d Coin(s)"+LINE_FEED;
	
	public static final String MESSAGE_ERROR_OTHER_COINS = "Please insert cash 1, 5, and 10 THB only."+LINE_FEED;
	public static final String MESSAGE_ERROR_NO_PRODUCT = "Error, there is no order code \"%s\"."+LINE_FEED;
	public static final String MESSAGE_ERROR_OUT_OF_STOCK = "Sorry, your order \"%s\" has out of stock."+LINE_FEED;
	public static final String MESSAGE_ERROR_NO_CHANGE = "Sorry, the machine has no change."+LINE_FEED;
	public static final String MESSAGE_ERROR_MONEY_NOT_ENOUGH = "Please insert more %.2f THB"+LINE_FEED;
	
}
