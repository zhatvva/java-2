package org.example.entity.criteria;

/**
 * Supportive locked class, which static enums should be used for adding criteria params
 */
public final class SearchCriteria {
	
	public static enum Oven{
		POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
	}
	
	public static enum Laptop{
		BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHS
	}
	
	public static enum Refrigerator{
		POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH
	}
	
	public static enum VacuumCleaner{
		POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH
	}
	
	public static enum Kettle{
		POWER_CONSUMPTION, VOLUME, TEMPERATURE,
	}
	
	public static enum Speakers{
		POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH
	}
	
	private SearchCriteria() {}
}

