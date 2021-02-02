package by.htp.airline.main;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import by.htp.airline.bean.Airline;
import by.htp.airline.bean.AirlineCompany;
import by.htp.airline.logic.AirlineCompanyLogic;
import by.htp.airline.view.AirlineView;

public class Main {

	public static void main(String[] args) {
		AirlineCompany belavia = new AirlineCompany();
		AirlineCompanyLogic airlineCompanyLogic = new AirlineCompanyLogic();
		AirlineView airlineView = new AirlineView();

		Airline a1 = new Airline("London", 5434, "n20", "16:30", "Monday");
		Airline a2 = new Airline("Moscow", 5863, "n20","18:40" , "Monday");
		Airline a3 = new Airline("London", 8451, "n20","11:30", "Saturday");
		Airline a4 = new Airline("Minsk", 9814, "n20", "12:50", "Monday");
		Airline a5 = new Airline("Kiev", 1687, "n20", "04:05", "Monday");

		belavia.add(a1);
		belavia.add(a2);
		belavia.add(a3);
		belavia.add(a4);
		belavia.add(a5);

		List<Airline> airlines = new ArrayList<Airline>();
		airlines = airlineCompanyLogic.searchByDestination(belavia.getAirlines(), "London");
		airlineView.printAirlines("Пункт назачения London", airlines);
		airlines = airlineCompanyLogic.searchByDayOfTheWeek(belavia.getAirlines(),"Saturday");
		airlineView.printAirlines("День недели Saturday", airlines);
		try {
			airlines = airlineCompanyLogic.searchByDayOfTheWeek(belavia.getAirlines(), "Monday", "08:00");
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		
		airlineView.printAirlines("Monday, after 08:00", airlines);

	}

}
