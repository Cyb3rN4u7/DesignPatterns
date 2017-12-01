package model;

import api.WeatherPoint;

public class CarGPS {
    private WeatherPoint api;
    private String location;

    public CarGPS(WeatherPoint api, String location){
        this.api = api;
        this.location = location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void getWeatherData(){
        System.out.println("-------------------------------------");
        System.out.println("Getting weather for "+location+"...");
        System.out.println("-------------------------------------");
        api.getWeather(location);
    }

    public void planTrip(){
        String data = api.getWeather(location);
        System.out.println("We are headed to " + location);
        System.out.println("The weather is " + api.getWeather(location));

    }
}
