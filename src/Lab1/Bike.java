package Lab1;

public class Bike extends Automobile{

	int wheelCount = 2;
	String tireType = "Thin";
	
	public int numOfTires() {
		// TODO Auto-generated method stub
		return wheelCount ;
	}
	
	public String tireType() {
		return tireType;
	}
	
	public void getBikeInfo() {
		numOfTires = wheelCount;
		typeOfTires = tireType;
	}
	
}
