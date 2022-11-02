package org.example.entity.criteria;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/**
 * Class, that provides effective search of specific appliance,
 * using certain criteria
 */
public class Criteria {

	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<>();

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}

	/**
	 * Returns short name of appliance,
	 * that is searched using this critearia
	 * @return short name of appliance group
	 */
	public String getGroupSearchName() {
		return groupSearchName;
	}

	/**
	 * Add specific appliance param for criteria
	 * @param searchCriteria - name of appliance param, that should be rewritten
	 * @param value - object, that contains value of appliance param
	 */
	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria.toLowerCase(Locale.ROOT), value);
	}

	/**
	 * Returns all appliance param it should fit
	 * @return set of appliance params' names
	 */
	public Set<String> getKeys() {
		return criteria.keySet();
	}

	/**
	 * Returns appliance params and values they should fit
	 * @return map of appliance params' names and their values
	 */
	public Map<String,Object> getMap() {
		return new HashMap<>(criteria);
	}

	/**
	 * Support method, that print all appliance params and their values
	 */
	public void showCriteria() {
		criteria.forEach((str, obj) -> System.out.println(str+" "+obj));
	}

}
