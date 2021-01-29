package by.htp.applianceWithoutMains.bean;

public class TabletPC extends ApplianceWithoutMains{
	private int flashMemoryCapacity;
	private String color;
	
	public TabletPC() {
		
	}

	public TabletPC(double batteryCapacity, double displayInches, int memoryRom, int flashMemoryCapacity,
			String color) {
		super(batteryCapacity, memoryRom, displayInches);
		this.flashMemoryCapacity = flashMemoryCapacity;
		this.color = color;
		
	}

	public int getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}

	public void setFlashMemoryCapacity(int flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "TabletPC [flashMemoryCapacity=" + flashMemoryCapacity + ", color=" + color + "]";
	}
	
	
	
	

}
