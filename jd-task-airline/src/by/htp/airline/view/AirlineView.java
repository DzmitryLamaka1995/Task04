package by.htp.airline.view;

import java.util.List;

import by.htp.airline.bean.Airline;

public class AirlineView {
	public void printAirlines(String message, List<Airline> list) {
		System.out.println("*******" + message + "*******");
		for (Airline airline : list) {
			System.out.print(
					"Пункт назначения : " + airline.getDestination() + " | Номер рейса : " + airline.getNumberOfFlight()
							+ " | Тип самолета : " + airline.getAirplaneType() + " | Время вылета : "
							+ airline.getDepartureTime() + " | День недели : " + airline.getDayOfTheWeek());

			System.out.println();
		}
	}
}
