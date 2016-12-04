package com.chernyshov777.weatherfinder;

import com.github.fedy2.weather.YahooWeatherService;
import com.github.fedy2.weather.data.Channel;
import com.github.fedy2.weather.data.unit.DegreeUnit;

import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 * @author Chernyshov Daniil
 */
public class WeatherFinderImpl implements WeatherFinder {
    public Channel findChannel() {
        Channel channel = null;
        try {
            YahooWeatherService service = new YahooWeatherService();
            channel = service.getForecast("2123260", DegreeUnit.CELSIUS);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return channel;
    }
}
