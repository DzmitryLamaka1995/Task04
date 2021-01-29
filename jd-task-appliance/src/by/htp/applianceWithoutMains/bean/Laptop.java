package by.htp.applianceWithoutMains.bean;

public class Laptop extends ApplianceWithoutMains {
	private String oS;
	private int systemMemory;
	private double cPU;
	
	public Laptop() {
		
	}

	public Laptop(double batteryCapacity, String oS, int memoryRom,int systemMemory,
			 double cPU, double displayInches ) {
		super(batteryCapacity, memoryRom, displayInches);
		this.oS = oS;
		this.systemMemory = systemMemory;
		this.cPU = cPU;
		
	}

	public String getoS() {
		return oS;
	}

	public void setoS(String oS) {
		this.oS = oS;
	}

	public int getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}

	public double getcPU() {
		return cPU;
	}

	public void setcPU(double cPU) {
		this.cPU = cPU;
	}

	@Override
	public String toString() {
		return "Laptop [oS=" + oS + ", systemMemory=" + systemMemory + ", cPU=" + cPU + "]";
	}
	
	
	

}
