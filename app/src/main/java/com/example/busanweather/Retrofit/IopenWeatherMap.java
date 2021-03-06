package com.example.busanweather.Retrofit;

import com.example.busanweather.Model.WeatherForecastResult;
import com.example.busanweather.Model.WeatherResult;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IopenWeatherMap {
    @GET ("weather")
    Observable<WeatherResult> getWeahterByLating(@Query("lat") String lat,
                                                 @Query("lon") String lng,
                                                 @Query("appid") String appid,
                                                 @Query("units") String unit);

    @GET ("weather")
    Observable<WeatherResult> getWeahterByCityName(@Query("q") String cityName,

                                                 @Query("appid") String appid,
                                                 @Query("units") String unit);


    @GET ("forecast")
    Observable<WeatherForecastResult> getForecastWeahterByLating(@Query("lat") String lat,
                                                                 @Query("lon") String lng,
                                                                 @Query("appid") String appid,
                                                                 @Query("units") String unit);
}
