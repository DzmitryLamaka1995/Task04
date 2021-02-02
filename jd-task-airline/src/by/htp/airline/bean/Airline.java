package by.htp.airline.bean;

public class Airline {

	private String destination;
	private int numberOfFlight;
	private String airplaneType;
	private String departureTime;
	private String dayOfTheWeek;

	public Airline() {
	}

	public Airline(String destination, int numberOfFlight, String airplaneType, String departureTime,
			String dayOfTheWeek) {

		this.destination = destination;
		this.numberOfFlight = numberOfFlight;
		this.airplaneType = airplaneType;
		this.departureTime = departureTime;
		this.dayOfTheWeek = dayOfTheWeek;
	
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumberOfFlight() {
		return numberOfFlight;
	}

	public void setNumberOfFlight(int numberOfFlight) {
		this.numberOfFlight = numberOfFlight;
	}

	public String getAirplaneType() {
		return airplaneType;
	}

	public void setAirplaneType(String airplaneType) {
		this.airplaneType = airplaneType;
	}

	public String getDayOfTheWeek() {
		return dayOfTheWeek;
	}



	public void setDayOfTheWeek(String dayOfTheWeek) {
		this.dayOfTheWeek = dayOfTheWeek;
	}
	
	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airplaneType == null) ? 0 : airplaneType.hashCode());
		result = prime * result + ((dayOfTheWeek == null) ? 0 : dayOfTheWeek.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + numberOfFlight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if (airplaneType == null) {
			if (other.airplaneType != null)
				return false;
		} else if (!airplaneType.equals(other.airplaneType))
			return false;
		if (dayOfTheWeek == null) {
			if (other.dayOfTheWeek != null)
				return false;
		} else if (!dayOfTheWeek.equals(other.dayOfTheWeek))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (numberOfFlight != other.numberOfFlight)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", numberOfFlight=" + numberOfFlight + ", airplaneType="
				+ airplaneType + ", departureTime=" + departureTime + ", dayOfTheWeek=" + dayOfTheWeek + "]";
	}

}
