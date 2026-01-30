public class Ticket {
	private static int lastSerialNumber = 0;
	private int serialNumber;	
	
	public static int getLastSerialNumber() {
		return lastSerialNumber;
	}
	
	public Ticket() {
		this.serialNumber = lastSerialNumber;
		lastSerialNumber++;
	}
	
	public int getSerialNumber() {
		return serialNumber;
	}
}
