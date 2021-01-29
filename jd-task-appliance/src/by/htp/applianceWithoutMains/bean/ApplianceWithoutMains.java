package by.htp.applianceWithoutMains.bean;

public class ApplianceWithoutMains {
	private double batteryCapacity;
	private int memoryRom;
	private double displayInches;
	
	public ApplianceWithoutMains() {
		
	}
	
	public ApplianceWithoutMains(double batteryCapacity, int memoryRom, double displayInches) {
		super();
		this.batteryCapacity = batteryCapacity;
		this.memoryRom = memoryRom;
		this.displayInches = displayInches;
	}

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getMemoryRom() {
		return memoryRom;
	}

	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}

	public double getDisplayInches() {
		return displayInches;
	}

	public void setDisplayInches(double displayInches) {
		this.displayInches = displayInches;
	}

	@Override
	public String toString() {
		return "ApplianceWithoutMains [batteryCapacity=" + batteryCapacity + ", memoryRom=" + memoryRom
				+ ", displayInches=" + displayInches + "]";
	}

}
