package com.apap.tutorial6.service;

import java.util.List;
import java.util.Optional;

import com.apap.tutorial6.model.FlightModel;

/**
 * FlightService
 */
public interface FlightService {
    FlightModel addFlight(FlightModel flight);
    
    void deleteByFlightNumber(String flightNumber);

    Optional<FlightModel> getFlightDetailByFlightNumber(String flightNumber);

	FlightModel getFlightDetailById(long flightId);

	List<FlightModel> getAllFlight();

	void deleteFlight(FlightModel flight);
}