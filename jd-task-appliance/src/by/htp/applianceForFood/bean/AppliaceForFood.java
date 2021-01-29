package by.htp.applianceForFood.bean;

public class AppliaceForFood {
	private int powerConsumption;
	private double weight;
	private double height;
	private double width;
	
	public AppliaceForFood() {
		
	}

	public AppliaceForFood(int powerConsumption, double weight, double height, double width) {
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.height = height;
		this.width = width;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "AppliaceForFood [powerConsumption=" + powerConsumption + ", weight=" + weight + ", height=" + height
				+ ", width=" + width + "]";
	}
	
	
	
	

}
