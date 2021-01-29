package by.htp.otherAppliance.bean;

public class Speakers extends OtherAppliance {
	private int numberOfSpeakers;
	private String frequensyRange;
	private double cordLength;
	
	public Speakers() {
		
	}

	public Speakers(int powerConsumption,int numberOfSpeakers,String frequensyRange,double cordLength) {
		super(powerConsumption);
		this.numberOfSpeakers = numberOfSpeakers;
		this.frequensyRange  = frequensyRange;
		this.cordLength = cordLength;
		
	}

	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public void setNumberOfSpeakers(int numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public String getFrequensyRange() {
		return frequensyRange;
	}

	public void setFrequensyRange(String frequensyRange) {
		this.frequensyRange = frequensyRange;
	}

	public double getCordLength() {
		return cordLength;
	}

	public void setCordLength(double cordLength) {
		this.cordLength = cordLength;
	}

	@Override
	public String toString() {
		return "Speakers [numberOfSpeakers=" + numberOfSpeakers + ", frequensyRange=" + frequensyRange + ", cordLength="
				+ cordLength + "]";
	}
	

}
