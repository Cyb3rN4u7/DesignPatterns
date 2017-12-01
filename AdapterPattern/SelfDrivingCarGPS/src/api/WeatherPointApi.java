package api;

import java.util.HashMap;

public class WeatherPointApi implements WeatherPoint {
    private HashMap<String,String> weather;
    private String location;

    public WeatherPointApi(){
        weather = new HashMap<>();
        // populate with data
        populateWithData();

    }



    @Override
    public String getWeather(String location) {
        this.location = location;
        return weather.get(location);
    }

    @Override
    public String getLocation() {
        return location;
    }


    private void populateWithData() {
        weather.put("Athens","Temp : 26 C, Sunny , humidity 40%");
        weather.put("London","Temp : 12 C, Cloudy , humidity 60%");
        weather.put("New York","Temp : 13 C, Cloudy , humidity 50%");
        weather.put("New Delhi","Temp : 14 C, Broken Clouds , humidity 54%");
        weather.put("Paris","Temp : 16 C, Some Clouds , humidity 64%");
    }
}
