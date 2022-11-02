package org.example.dao.impl;


import org.example.dao.ApplianceDAO;
import org.example.entity.Appliance;
import org.example.entity.Appliances;
import org.example.entity.Oven;
import org.example.entity.criteria.Criteria;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

public class ApplianceDAOImpl implements ApplianceDAO {
	private static JAXBContext jaxbContext;
	private static Marshaller marshaller;
	private static Unmarshaller unmarshaller;
	public ApplianceDAOImpl() {
		try {
			jaxbContext = JAXBContext.newInstance(Appliances.class);
			marshaller = jaxbContext.createMarshaller();
			unmarshaller = jaxbContext.createUnmarshaller();
		}
		catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List find(Criteria criteria) {
		List applianceGroup = getAll().get(criteria.getGroupSearchName());
		Map<String,Object> criteriaMap = criteria.getMap();
		applianceGroup = (List) applianceGroup.stream().filter((obj) -> {
			for (Map.Entry<String, Object> entry: criteriaMap.entrySet()) {
				for (Field declaredField : obj.getClass().getDeclaredFields()) {
					try {
						if(!declaredField.getName().toLowerCase(Locale.ROOT).equals(entry.getKey())) continue;
						else if (!declaredField.get(obj).equals(entry.getValue()))
							return false;
					} catch (IllegalAccessException e) {
						throw new RuntimeException(e);
					}
				}
			}
			return true;
		}).collect(Collectors.toList());
		System.out.println(applianceGroup.size());
		criteria.showCriteria();
		return applianceGroup;
	}


	@Override
	public Appliances getAll() {
		try {
			return (Appliances) unmarshaller.unmarshal(new File("src/main/resources/goods.xml"));
		}
		catch (JAXBException ex) {
			return null;
		}
	}


	@Override
	public void write(Appliances appliances) {
		try {
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(appliances,new FileWriter("src/main/resources/goods.xml"));
		}
		catch (JAXBException | IOException exception) {

		}
	}


	// you may add your own code here

}
