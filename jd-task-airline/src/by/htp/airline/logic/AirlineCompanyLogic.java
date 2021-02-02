package by.htp.airline.logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import by.htp.airline.bean.Airline;

public class AirlineCompanyLogic {
	public List<Airline> searchByDestination(List<Airline> airlines, String destination) {
		List<Airline> result = new ArrayList<Airline>();
		for (Airline airline : airlines) {
			if (airline.getDestination().equals(destination)) {
				result.add(airline);

			}

		}
		return result;
	}

	public List<Airline> searchByDayOfTheWeek(List<Airline> airlines, String dayOfTheWeek) {
		List<Airline> result = new ArrayList<Airline>();
		for (Airline airline : airlines) {
			if (airline.getDayOfTheWeek().equals(dayOfTheWeek)) {
				result.add(airline);

			}

		}
		return result;
	}

	public List<Airline> searchByDayOfTheWeek(List<Airline> airlines, String dayOfTheWeek, String departureTime)
			throws ParseException {
		List<Airline> result = new ArrayList<Airline>();
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		Date date = format.parse(departureTime);
		Date date1 = new Date();

		for (Airline airline : airlines) {
			date1 = format.parse(airline.getDepartureTime());

			if (airline.getDayOfTheWeek().equals(dayOfTheWeek)) {
				if (date1.after(date)) {
					result.add(airline);
				}
			}
		}
		return result;
	}



}
