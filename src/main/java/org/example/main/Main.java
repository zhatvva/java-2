package org.example.main;


import org.example.entity.*;
import org.example.entity.Oven;
import org.example.entity.criteria.Criteria;
import org.example.entity.criteria.SearchCriteria;
import org.example.service.ApplianceService;
import org.example.service.ServiceFactory;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws JAXBException, IOException {
		Appliances appliances = new Appliances();
//		appliances.add((new Oven(1000,10,32,60,45.5,59.5)));
//		appliances.add(new Oven(1500,12,33,60,45,68));
//		appliances.add(new Oven(2000,11,33,60,40,70));
//		appliances.add(new Laptop(1,"Windows",4000,1000,1.2,18));
//		appliances.add(new Laptop(1.5,"Linux",8000,1000,2.2,19));
//		appliances.add(new Laptop(3,"Windows",8000,1500,3.2,22));
//		appliances.add(new Refrigerator(100,20,10,300,200,70));
//		appliances.add(new Refrigerator(200,30,15,300,180,80));
//		appliances.add(new Refrigerator(150,35,20,350.5,250,75));
//		appliances.add(new VacuumCleaner(100,'A',"A2","all-in-one",3000,20));
//		appliances.add(new VacuumCleaner(110,'B',"AA-89","all-in-one",2900,25));
//		appliances.add(new VacuumCleaner(90,'C',"XX00","all-in-one",2950,30));
//		appliances.add(new Kettle(500,1.4,100,false,"brown"));
//		appliances.add(new Kettle(1300,2,95,true,"white"));
//		appliances.add(new Kettle(1000,2.3,90,true,"black"));
//		appliances.add(new Speakers(15,2,2,4,2));
//		appliances.add(new Speakers(20,3,3,4,3));
//		appliances.add(new Speakers(17,4,2,3.5,4));
//
		Appliance appliance = null;
		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();
		appliances = service.getAll();
		List<Oven> list = appliances.get("Oven");
		for (Oven oven : list) {
			System.out.println(oven.capacity);
		}
		service.write(appliances);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
		criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 32.0);
		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 68.0);
		criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 60.0);

		Oven oven = (Oven) service.find(criteriaOven);
		PrintApplianceInfo.print(oven);

		//////////////////////////////////////////////////////////////////

//		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
//		criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "BLUE");
//		criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 14);
//		criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), 4);
//
//		appliance = service.find(criteriaOven);// find(Object...obj)
//
//		PrintApplianceInfo.print(appliance);

	}

}
