package tests;

import adapter.WeatherPointToOracleAdapter;
import api.WeatherOracle;
import api.WeatherOracleApi;
import api.WeatherPoint;
import model.CarGPS;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChangedApiCarGpsTest {
    CarGPS carGPS;
    WeatherPoint api;
    WeatherOracle oracleApi;

    @BeforeEach
    public void setup(){
        oracleApi = new WeatherOracleApi("London");
        api = new WeatherPointToOracleAdapter(oracleApi);
        carGPS = new CarGPS(api,"Athens");

    }


    @Test
    public void testGps(){
        carGPS.getWeatherData();
        carGPS.planTrip();
        // change destination
        carGPS.setLocation("London");
        carGPS.getWeatherData();
        carGPS.planTrip();

    }
}
