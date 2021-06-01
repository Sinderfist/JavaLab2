package Lab1;

public class Truck extends Automobile {

	int wheelCount = 4;
	String tireType = "Wide";
	
	public int numOfTires() {
		// TODO Auto-generated method stub
		return wheelCount ;
	}
	
	public String tireType() {
		return tireType;
	}
	
	public void getTruckInfo() {
		numOfTires = wheelCount;
		typeOfTires = tireType;
	}
	
	
}
