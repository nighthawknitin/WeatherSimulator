package serviceImpl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import com.app.weatherSimulatorApp.utils.RandomNumberGenerator;

public class WeatherSimulator {

	public static List<Date> timeListGenerator()
	{
		Calendar startingDateCalendar = Calendar.getInstance();
    	Date currentDate = startingDateCalendar.getTime();
    	startingDateCalendar.add(Calendar.YEAR, -1);
    	
    	List<Date> timeList = new ArrayList<Date>();
    	
    	while (startingDateCalendar.getTime().compareTo(currentDate) < 0)
    		
    	{
    		startingDateCalendar.add(Calendar.HOUR_OF_DAY, RandomNumberGenerator.randInt(0, 22));
    		startingDateCalendar.add(Calendar.MINUTE, RandomNumberGenerator.randInt(0, 59));
    		timeList.add(startingDateCalendar.getTime());
    		
    		
    		startingDateCalendar.add(Calendar.HOUR_OF_DAY, 1);
    		startingDateCalendar.add(Calendar.MINUTE, RandomNumberGenerator.randInt(0, 59));
    		timeList.add(startingDateCalendar.getTime());
    		
    		if(timeList.size() > 20)
    		{
    			break;
    		}
    	}
    	
    	return timeList;
	}
	
	
	
}
