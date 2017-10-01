package com.marcos.ryanair.interconnectingflights.adapter;

import com.fasterxml.jackson.databind.JsonNode;
import com.marcos.ryanair.interconnectingflights.model.dto.SchedulesDto;

/**
 * Schedules adapter.
 * 
 * @author mlg
 *
 */
public interface SchedulesAdapter {

	/**
	 * Adapts JSON-format schedules.
	 * 
	 * @param jsonNode
	 *            json with the schedules info.
	 * @param year
	 *            year of the schedules
	 * @return {@link SchedulesDto}
	 */
	public SchedulesDto adaptSchedules(JsonNode jsonNode, int year);

}
