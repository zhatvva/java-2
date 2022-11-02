package org.example.service.validation;


import org.example.entity.*;
import org.example.entity.criteria.Criteria;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;

/**
 * Class, that checks if criteria is valid
 */
public class Validator {

	/**
	 *
	 * @param criteria, that should be checked
	 * @return true, if criteria is valid; false, if criteria is invalid
	 */
	public static boolean criteriaValidator(Criteria criteria) {
		Class class1 = null;
		try {
			class1 = Class.forName("org.example.entity."+criteria.getGroupSearchName());
		} catch (ClassNotFoundException e) {
			return false;
		}
		Set<String> criteriaKeys = criteria.getKeys();
		for (String criteriaKey : criteriaKeys) {
			if(Arrays.stream(class1.getDeclaredFields()).noneMatch((str)->str.getName().toLowerCase(Locale.ROOT).equals(criteriaKey))) return false;
		}

		return true;
	}

}

//you may add your own new classes