package api;

import java.util.HashMap;

public class WeatherOracleApi implements WeatherOracle {
    private HashMap<String,String> weatherData;
    private String location;

    public WeatherOracleApi(String location){
        this.location = location;
        weatherData = new HashMap<>();
        // populate with data
        populateWithData();

    }




    private void populateWithData() {
        weatherData.put("Athens","Weather Oracle api: Temp is 26 C, Sunny , humidity 40%");
        weatherData.put("London","Weather Oracle api: Temp is 12 C, Cloudy , humidity 60%");
        weatherData.put("New York","Weather Oracle api: Temp is 13 C, Cloudy , humidity 50%");
        weatherData.put("New Delhi","Weather Oracle api: Temp is 14 C, Broken Clouds , humidity 54%");
        weatherData.put("Paris","Weather Oracle api: Temp is 16 C, Some Clouds , humidity 64%");
    }

    @Override
    public String getWeatherData(String location) {
        this.location = location;
        return weatherData.get(location);
    }

    @Override
    public String getTheLocation() {
        return location;
    }
}
