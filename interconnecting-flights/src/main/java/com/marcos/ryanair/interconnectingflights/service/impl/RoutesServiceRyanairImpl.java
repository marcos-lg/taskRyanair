package com.marcos.ryanair.interconnectingflights.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.marcos.ryanair.interconnectingflights.adapter.RoutesAdapter;
import com.marcos.ryanair.interconnectingflights.model.RoutesInfo;
import com.marcos.ryanair.interconnectingflights.service.ConnectorManager;
import com.marcos.ryanair.interconnectingflights.service.RoutesService;

@Service
public class RoutesServiceRyanairImpl implements RoutesService {

	@Autowired
	private ConnectorManager connectorManager;
	
	@Autowired
	private RoutesAdapter routesAdapter;

	@Override
	public RoutesInfo getRoutes() {

		// TODO: sacar url a properties
		JsonNode jsonNode = connectorManager.getRestResponseAsJson("https://api.ryanair.com/core/3/routes/");			

		return routesAdapter.adaptRoutesInfo(jsonNode);
	}

}
