
/**
 * 
 */
public class Car extends Vehicle
{
			
		private Transmission transmission;
		private Wheels wheels;
		private Exhaust exhaust;
		private Coilovers coilovers;
		private Intercooler intercooler;
		private Turbo turbo;
		
	
	private void Car()
	{
		
	}
	
	/**
	 * Constructs car object with many attributes.
	 * @param carMake
	 * @param carModel
	 * @param carBodyStyle
	 * @param carColor
	 * @param carMpg
	 * @param carMileage
	 * @param carVin
	 * @param carYear
	 * @return 
	 */
	
	//Full build
	public Car(String make,String model, String bodyStyle, String color, Integer mileage, Integer year, Transmission transmission,
			Wheels wheels, Exhaust exhaust, Coilovers coilovers,Intercooler intercooler, Turbo turbo) 
	{
		this.make = make;
		this.model = model;
		this.bodyStyle = bodyStyle;
		this.color = color;
		this.mileage = mileage;
		this.year = year;
		this.transmission = transmission;
		this.wheels = wheels;
		this.exhaust = exhaust;
		this.coilovers = coilovers;
		this.intercooler = intercooler;
		this.turbo = turbo;
		
	}
	
	//Build with no Coilovers
	public Car(String make,String model, String bodyStyle, String color, Integer mileage, Integer year, Transmission transmission,
			Wheels wheels, Exhaust exhaust,Intercooler intercooler, Turbo turbo) 
	{
		this.make = make;
		this.model = model;
		this.bodyStyle = bodyStyle;
		this.color = color;
		this.mileage = mileage;
		this.year = year;
		this.transmission = transmission;
		this.wheels = wheels;
		this.exhaust = exhaust;
		this.intercooler = intercooler;
		this.turbo = turbo;
		
	}
}
	
	
	
	
	
	
