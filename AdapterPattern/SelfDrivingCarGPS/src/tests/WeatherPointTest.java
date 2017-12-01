package tests;

import api.WeatherPoint;
import api.WeatherPointApi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherPointTest {
    WeatherPoint weatherPoint;

    @BeforeEach
    public void setup(){
        weatherPoint = new WeatherPointApi();
    }


    @Test
    public void testWeatherData(){
        assertEquals(weatherPoint.getWeather("Athens"),
                "Temp : 26 C, Sunny , humidity 40%");
        assertEquals("Athens",weatherPoint.getLocation());


    }

}
