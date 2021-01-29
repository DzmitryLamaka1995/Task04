package by.htp.otherAppliance.bean;

public class OtherAppliance {
	private int powerConsumption;

	public OtherAppliance() {

	}

	public OtherAppliance(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	@Override
	public String toString() {
		return "OtherAppliance [powerConsumption=" + powerConsumption + "]";
	}

}
