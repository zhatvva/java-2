package org.example.dao;


import org.example.entity.Appliance;
import org.example.entity.Appliances;
import org.example.entity.criteria.Criteria;

import javax.xml.bind.JAXBException;
import java.util.List;

/**
 * Class, that provides connection between services and XML files
 */
public interface ApplianceDAO {
	/**
	 * Returns list of appliances that fit out criteria.
	 * If no appliances fit that criteria, returns empty list
	 * @param criteria
	 * @return list of appliances fit criteria
	 */
	List find(Criteria criteria);

	/**
	 * Returns all appliances, that file "goods.xml" contains
	 * @return instance of class Appliances, that contains all appliances inside it
	 */
	Appliances getAll();

	/**
	 * Rewrites appliance's list of "goods.xml" file
	 * @param appliances, that should be written instead of current one.
	 */
	void write(Appliances appliances);
}
