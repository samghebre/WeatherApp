package com.samghebremedhin.WeatherApp;

import com.samghebremedhin.WeatherApp.model.Weather;
import com.samghebremedhin.WeatherApp.model.WeatherResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WeatherAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WeatherAppApplication.class, args);
	}
		public RestTemplate restTemplate = new RestTemplate();


		private static final Logger logger = LoggerFactory.getLogger(WeatherAppApplication.class);

		@Override
		public void run(String... args) throws Exception {
		    String city_name = "Newark";
			String state_code = "DE";
			String country_code = "US";
			String API_key = "b1b51bd98abaa0756f3c1cd18a24761b";
			String weatherResourceURL = String.format("http://api.openweathermap.org/data/2.5/weather?q=%s,%s,%s&appid=%s", city_name, state_code, country_code, API_key);

			ResponseEntity<WeatherResponse> response = restTemplate.getForEntity(weatherResourceURL , WeatherResponse.class);
			Weather[] data = response.getBody().getWeather().toArray(new Weather[0]);
			for(Weather weather : data)
				logger.info(weather.toString());
	}
}


