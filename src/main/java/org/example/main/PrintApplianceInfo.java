package org.example.main;


import org.example.entity.Appliance;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 * Supportive class for printing info of applaince's instance of all types
 */
public class PrintApplianceInfo {

	/**
	 * Method, that prints all appliance's params it contains
	 * @param appliance - object, which info should be printed
	 * @param <T> - class, that represent appliance's type
	 */
	public static<T extends Appliance> void print(T appliance) {
		System.out.println(appliance.getClass().getSimpleName()+":\n{");
		for (Field declaredField : appliance.getClass().getDeclaredFields()) {
			try {
				System.out.println("	"+declaredField.getName()+": "+declaredField.get(appliance));
			} catch (IllegalAccessException e) {

			}
		}
		System.out.println("}\n");
	}
	
	// you may add your own code here

}
