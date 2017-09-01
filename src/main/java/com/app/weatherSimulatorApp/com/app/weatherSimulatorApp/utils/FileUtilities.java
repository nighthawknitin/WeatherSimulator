package com.app.weatherSimulatorApp.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.app.weatherSimulatorApp.model.WeatherDataModel;

public class FileUtilities {

	public static List<WeatherDataModel> readFromFile()
	{
		String csvFile = "/Users/mkyong/csv/country.csv";
        String line = "";
        String cvsSplitBy = ",";
        
        WeatherDataModel weatherData = null;
        List<WeatherDataModel> weatherDataList = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] inputLine = line.split(cvsSplitBy);

                //System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");

                weatherData.setLocation(inputLine[0]);
                weatherData.setLatitude(inputLine[1]);
                weatherData.setLongitude(inputLine[2]);
                weatherData.setElevation(inputLine[3]);
                
                weatherDataList.add(weatherData);
                }

        } catch (IOException e) {
            e.printStackTrace();
        }
		return weatherDataList;
	}
	
	public static String prepareOutputString()
	{
		return null;
	}
}
