package adapter;

import api.WeatherOracle;
import api.WeatherPoint;

public class WeatherPointToOracleAdapter implements WeatherPoint {

    private WeatherOracle weatherOracle;

    public WeatherPointToOracleAdapter(WeatherOracle weatherOracle){
        this.weatherOracle = weatherOracle;
    }

    @Override
    public String getWeather(String location) {
        // we use the weather oracle method to get weather
        return weatherOracle.getWeatherData(location);
    }

    @Override
    public String getLocation() {
        // we use the weather oracle method to get location
        return weatherOracle.getTheLocation();
    }
}
