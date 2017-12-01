package ui;

import adapter.WeatherPointToOracleAdapter;
import api.WeatherOracleApi;
import api.WeatherPoint;
import model.CarGPS;

public class Demo {
    public static void main(String[] args) {
        // Our new api
        WeatherOracleApi weatherOracle = new WeatherOracleApi("London");
        // adapting the api from WeatherOracle to WeatherPoint
        WeatherPoint adaptedApi = new WeatherPointToOracleAdapter(weatherOracle);
        // using our class with no changes!
        CarGPS carGPS = new CarGPS(adaptedApi,adaptedApi.getLocation());

        carGPS.getWeatherData();
        carGPS.planTrip();
    }
}
