package org.example.service;


import org.example.service.impl.ApplianceServiceImpl;

/**
 * Support class, that crates and returns instance of ApplianceService
 */
public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();

	private final ApplianceService applianceService = new ApplianceServiceImpl();
	
	private ServiceFactory() {}

	public ApplianceService getApplianceService() {

		return applianceService;
	}

	public static ServiceFactory getInstance() {
		return instance;
	}

}
