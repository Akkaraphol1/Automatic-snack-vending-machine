/**
 * 
 * Create by ESP Asian Center Co., Ltd.
 *
 */

public interface VendingMachineIF {

	public double getTotalBalance();
	public void addStock(String code, Supply arg);
	public void updateStock(String code, int amount);
	public void vending(Customer user, String code);
	public void printStatus();
    public void VendingMachiners();
}
