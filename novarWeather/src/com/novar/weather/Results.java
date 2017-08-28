/**
  * Copyright 2017 aTool.org 
  */
package com.novar.weather ;
import java.util.List;



import com.fasterxml.jackson.annotation.*;
/**
 * Auto-generated: 2017-07-15 21:32:43
 *
 * @author aTool.org (i@aTool.org)
 * @website http://www.atool.org/json2javabean.php
 */
public class Results {

  @JsonProperty("currentcity")
    public String currentcity;
    private String pm25;
    private List<Index> index;
    @JsonProperty("weather_data")
    public List<WeatherData> weatherData;
    public void setCurrentcity(String currentcity) {
         this.currentcity = currentcity;
     }
     public String getCurrentcity() {
         return currentcity;
     }

    public void setPm25(String pm25) {
         this.pm25 = pm25;
     }
     public String getPm25() {
         return pm25;
     }

    public void setIndex(List<Index> index) {
         this.index = index;
     }
     public List<Index> getIndex() {
         return index;
     }

    public void setWeatherData(List<WeatherData> weatherData) {
         this.weatherData = weatherData;
     }
     public List<WeatherData> getWeatherData() {
         return weatherData;
     }

}