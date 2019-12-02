package cashRegister;

public class Gun {

	private String name;
	private String gunType;
	private int singlePrice;
	private int shipmentPrice;
	
	protected Gun(String gunType, String name, int singlePrice, int shipmentPrice) {
		this.gunType = gunType;
		this.singlePrice = singlePrice;
		this.shipmentPrice = shipmentPrice;
	}
	
	public String getGunType() {
		return gunType;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSinglePrice() {
		return singlePrice;
	}
	
	public int getShipmentPrice() {
		return shipmentPrice;
	}
}
