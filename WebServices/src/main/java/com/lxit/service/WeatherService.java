package com.lxit.service;


import javax.jws.WebService;

import com.lxit.bean.City;

@WebService
public interface WeatherService {
	public City getCity();
}
