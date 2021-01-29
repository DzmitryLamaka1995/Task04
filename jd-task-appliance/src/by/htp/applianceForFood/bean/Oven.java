package by.htp.applianceForFood.bean;

public class Oven extends AppliaceForFood{
	private int capacity;
	private double depth;
	
    public Oven() {
    	
    }

	public Oven(int powerConsumption, double weight,int capacity, double depth, double height, double width) {
		super(powerConsumption, weight, height, width);
		this.capacity = capacity;
		this.depth = depth;
		
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	@Override
	public String toString() {
		return "Oven [capacity=" + capacity + ", depth=" + depth + "]";
	}
	
    
    

}
