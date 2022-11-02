package org.example.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Appliance {
	public int price;

	public Appliance() {
		this.price = (int)(Math.random()*1499+1);
	}
}
