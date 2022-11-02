package org.example.service.impl;


import org.example.dao.ApplianceDAO;
import org.example.dao.DAOFactory;
import org.example.entity.Appliance;
import org.example.entity.Appliances;
import org.example.entity.Kettle;
import org.example.entity.criteria.Criteria;
import org.example.service.ApplianceService;
import org.example.service.validation.Validator;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {
	private DAOFactory factory = DAOFactory.getInstance();
	private ApplianceDAO applianceDAO = factory.getApplianceDAO();

	@Override
	public void write(Appliances appliances) {
		applianceDAO.write(appliances);
	}

	@Override
	public Appliance find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		List applianceList = applianceDAO.find(criteria);
		if(applianceList.size()>0)
			return (Appliance) applianceList.get(0);
		return null;
	}

	@Override
	public Appliances getAll() {
		return applianceDAO.getAll();
	}

	@Override
	public Appliance getTheCheepest() {
		Appliances appliances = getAll();
		Appliance minAppliance = new Appliance();
		minAppliance.price = Integer.MAX_VALUE;
		for (Class supportedAppliance : Appliances.getSupportedAppliances()) {
			List<Appliance> list = appliances.get(supportedAppliance.getSimpleName());
			for (Appliance o : list) {
				if(minAppliance.price>o.price) minAppliance = o;
			}
		}
		return minAppliance;
	}

	@Override
	public List<Kettle> getAllKettles() {
		return getAll().getKettles();
	}
}

//you may add your own new classes
