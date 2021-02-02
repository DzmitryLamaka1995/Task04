package by.htp.airline.view;

import java.util.List;

import by.htp.airline.bean.Airline;

public class AirlineView {
	public void printAirlines(String message, List<Airline> list) {
		System.out.println("*******" + message + "*******");
		for (Airline airline : list) {
			System.out.print(
					"����� ���������� : " + airline.getDestination() + " | ����� ����� : " + airline.getNumberOfFlight()
							+ " | ��� �������� : " + airline.getAirplaneType() + " | ����� ������ : "
							+ airline.getDepartureTime() + " | ���� ������ : " + airline.getDayOfTheWeek());

			System.out.println();
		}
	}
}
