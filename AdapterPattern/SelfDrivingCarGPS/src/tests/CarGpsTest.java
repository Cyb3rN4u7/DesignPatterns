package tests;

import api.WeatherPointApi;
import model.CarGPS;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarGpsTest {
    CarGPS carGPS;
    WeatherPointApi api;

    @BeforeEach
    public void setup(){
        api = new WeatherPointApi();
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
