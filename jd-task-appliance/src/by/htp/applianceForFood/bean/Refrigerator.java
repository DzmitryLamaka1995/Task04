package by.htp.applianceForFood.bean;

public class Refrigerator extends AppliaceForFood {
	private double freezerCapacity;
	private double overallCapacity;
	
	public Refrigerator() {
		
	}

	public Refrigerator(int powerConsumption, double weight,double freezerCapacity,double overallCapacity, double height, double width) {
		super(powerConsumption, weight, height, width);
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
		
	}

	public double getFreezerCapacity() {
		return freezerCapacity;
	}

	public void setFreezerCapacity(double freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}

	public double getOverallCapacity() {
		return overallCapacity;
	}

	public void setOverallCapacity(double overallCapacity) {
		this.overallCapacity = overallCapacity;
	}

	@Override
	public String toString() {
		return "Refrigerator [freezerCapacity=" + freezerCapacity + ", overallCapacity=" + overallCapacity + "]";
	}
	
	
	


}
