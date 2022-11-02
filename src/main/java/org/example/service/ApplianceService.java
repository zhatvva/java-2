package org.example.service;


import org.example.entity.Appliance;
import org.example.entity.Appliances;
import org.example.entity.Kettle;
import org.example.entity.criteria.Criteria;

import java.util.List;

/**
 * Service, that contains methods for appliance interaction,
 * using ApplianceDAO for XML file connectivity
 */
public interface ApplianceService {

	/**
	 * Write appliances instance to "goods.xml" file
	 * @param appliances - instance of object, that contains lists of all appliances
	 */
	void write(Appliances appliances);

	/**
	 * Returns first appliance of appliances' list,
	 * that fit criteria params
	 * @param criteria - search criteria
	 * @return first element of appliance list,
	 * which instances fit all criteria params
	 */
	Appliance find(Criteria criteria);

	/**
	 * Returns all appliances,
	 * that file "goods.xml" contains
	 * @return instance of Appliances
	 */
	Appliances getAll();

	/**
	 * Returns the cheepest appliance,
	 * that "goods.xml" file contains
	 * @return instance of appliance
	 */
	Appliance getTheCheepest();

	/**
	 * Returns all kettles,
	 * that "goods.xml" file contains
	 * @return List of Kettles
	 */
	List<Kettle> getAllKettles();
}
