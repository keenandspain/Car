import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program introduces an object class called car.
 * The user can create objects through a CLI and specify its attributes.
 * @author keenandspain
 *
 */
public class ControlOOP 
{
	

	ArrayList<Car> aL = new ArrayList();
	/**
	 * Creates car object with its specified attributes.
	 * @param make 
	 * @param model 
	 * @param bodyStyle
	 * @param color
	 * @param mpg
	 * @param mileage
	 * @param vin
	 * @param year
	 */
	
	public void cliMenu()
	{
		System.out.println(" Welcome to Keenan's Garage " );
		System.out.println("------------------------");
		System.out.println("|	                |");
		System.out.println("|	1. Build Car	|");
		System.out.println("|	2. Delete Car	|");
		System.out.println("|	3. Modify Car	|");
		System.out.println("|	4. View Car     |");
		System.out.println("|                       |");
		System.out.println("|_______________________|" );
		
		System.out.println(" Please select one of the menu number options above: ");
		cliOptions();

		
	}
	public void cliOptions() 
	{
		Scanner in = new Scanner(System.in);
		String menuOption = in.nextLine();
		menuOption = menuOption.replace(" ","");
		
		
		if (menuOption.equals("1"))
		{
			System.out.println("\n" + "Building car");
			buildCar();

		}
		else if (menuOption.equals("2"))
		{
			System.out.print("\n" +"Deleting Car");
		}
		
		else if (menuOption.equals("3"))
		{
			System.out.print("\n" +"Modify Car");
		}
		
		else
		{
			System.out.print("\n" +"Please select one of the menu number options above: " + "\n");
			cliOptions();
		}
	}
	
	
	public void buildCar() 
	{
		String make;
		String model;
		String bodyStyle;
		String color;
		Integer mileage;
		Integer year;
		Transmission transmission = new Transmission();
		Integer transmissionWeight;
		String transmissionType;
		Wheels wheels = new Wheels();
		Integer wheelDiameter;
		Integer wheelWidth;
		Integer wheelWeight;
		Exhaust exhaust = new Exhaust();
		Float exhaustDiameter;
		Integer exhaustWeight;
		Coilovers coilovers = new Coilovers();
		String coiloverColor;
		Integer coiloverWeight;
		Boolean adjustable = null;
		Intercooler intercooler = new Intercooler();
		Float pipeDiameter;
		Integer intercoolerThickness;
		Integer intercoolerWeight;
		Turbo turbo = new Turbo();
		Float turboPsi;
		Integer turboWeight;
		
		Scanner in;
		
		System.out.print("Enter the Make: " + "\n");
		in = new Scanner(System.in);
		make = in.nextLine();
		make = make.replace(" ","");
		
		System.out.print("Enter the Model: " + "\n");
		in = new Scanner(System.in);
		model = in.nextLine();
		model = model.replace(" ","");
		
		System.out.print("Enter the BodyStyle: " + "\n");
		in = new Scanner(System.in);
		bodyStyle = in.nextLine();
		bodyStyle = bodyStyle.replace(" ","");
		
		System.out.print("Enter the Color: " + "\n");
		in = new Scanner(System.in);
		color = in.nextLine();
		color = color.replace(" ","");
		
		System.out.print("Enter the Mileage as an integer: " + "\n");
		in = new Scanner(System.in);
		mileage = Integer.parseInt(in.nextLine());
		
		System.out.print("Enter the Year as an integer: " + "\n");
		in = new Scanner(System.in);
		year = Integer.parseInt(in.nextLine());
		
		System.out.print("Enter the Transmission Weight as an integer: " + "\n");
		in = new Scanner(System.in);
		transmissionWeight = Integer.parseInt(in.nextLine());
		transmission.setWeight(transmissionWeight);
		
		System.out.print("Enter the Transmission Type : Automatic or Manual " + "\n");
		in = new Scanner(System.in);
		transmissionType = in.nextLine();
		transmissionType = transmissionType.replace(" ","");
		transmission.setType(transmissionType);
		
		System.out.print("Enter the Wheel Diameter as an integer:" + "\n");
		in = new Scanner(System.in);
		wheelDiameter = Integer.parseInt(in.nextLine());
		wheels.setDiameter(wheelDiameter);
		
		System.out.print("Enter the Wheel Width as an integer:" + "\n");
		in = new Scanner(System.in);
		wheelWidth = Integer.parseInt(in.nextLine());
		wheels.setWidth(wheelWidth);
		
		System.out.print("Enter the Wheel Weight as an integer:" + "\n");
		in = new Scanner(System.in);
		wheelWeight = Integer.parseInt(in.nextLine()); 
		wheels.setWeight(wheelWeight);
		
		System.out.print("Enter the Exhaust Diameter as a float:" + "\n");
		in = new Scanner(System.in);
		exhaustDiameter = Float.parseFloat(in.nextLine()); 
		exhaust.setPipeDiameter(exhaustDiameter);
		
		System.out.print("Enter the Exhaust Weight as a integer:" + "\n");
		in = new Scanner(System.in);
		exhaustWeight = Integer.parseInt(in.nextLine()); 
		exhaust.setWeight(exhaustWeight);
		
		System.out.print("Is the Coilover Adjustable : Y or N " + "\n");
		in = new Scanner(System.in);
		String adjustStr = in.nextLine();
		adjustStr = adjustStr.replace(" ","");
		
		if(adjustStr.equals("Y") || adjustStr.equals("y") ) 
		{
			adjustable = true;
		}
		else if(adjustStr.equals("N") || adjustStr.equals("n") ) 
		{
			adjustable = false;
		}
		
		coilovers.setAdjustable(adjustable);
		
		System.out.print("Enter the Coilover Color :" + "\n");
		in = new Scanner(System.in);
		coiloverColor = in.nextLine();
		coiloverColor = coiloverColor.replace(" ","");
		coilovers.setColor(coiloverColor);
		
		System.out.print("Enter the Coilover Weight as an integer :" + "\n");
		in = new Scanner(System.in);
		coiloverWeight = Integer.parseInt(in.nextLine()); 
		coilovers.setWeight(coiloverWeight);
		
		System.out.print("Enter the Intercooler Diameter as a float:" + "\n");
		in = new Scanner(System.in);
		pipeDiameter = Float.parseFloat(in.nextLine()); 
		intercooler.setPipeDiameter(pipeDiameter);
		
		System.out.print("Enter the Intercooler Core thickness as an integer :" + "\n");
		in = new Scanner(System.in);
		intercoolerThickness = Integer.parseInt(in.nextLine()); 
		intercooler.setCoreThickness(intercoolerThickness);
		
		System.out.print("Enter the Intercooler Weight as an integer :" + "\n");
		in = new Scanner(System.in);
		intercoolerWeight = Integer.parseInt(in.nextLine());
		intercooler.setWeight(intercoolerWeight);
		
		System.out.print("Enter the Turbo Weight as a float:" + "\n");
		in = new Scanner(System.in);
		turboPsi = Float.parseFloat(in.nextLine()); 
		turbo.setPsi(turboPsi);
		
		System.out.print("Enter the Turbo Weight as an integer :" + "\n");
		in = new Scanner(System.in);
		turboWeight = Integer.parseInt(in.nextLine());
		turbo.setWeight(turboWeight);
		
		
		Car car = new Car(make,model,bodyStyle, color,mileage, year,transmission,
				wheels, exhaust, coilovers, intercooler, turbo);
		
		aL.add(car);
		
				
		
		
		
	}
	
	public void createCar(String make, String model, String bodyStyle, String color, int mpg, int mileage, String vin, int year)
	{
		
		//Car car = new Car(make, model, bodyStyle, color, mpg, mileage, vin, year);
		
		//console.append("Car object created" + "\n");
		System.out.println(aL);
		//aL.add(car);
		
		
		
	}
	/**
	 * Removes the specified car object from memory.
	 * @param car
	 */
	public void deleteCar(Car car)
	{
		car = null;
		System.gc();
	}
	
	public void display()
	{
		for(int i = 0;i < aL.size();i++)
		{
			//console.append (aL.get(i) + "\n");
		}
	}
	/**
	 * The clear method clears the textfields in the GUI.
	 */
	 public void clear()
	 {
		 /*
		makeTF.setText(" ");
		modelTF.setText(" ");
		bodyStyleTF.setText(" ");
		colorTF.setText(" ");
		mpgTF.setText(" ");
		mileageTF.setText(" ");
		vinTF.setText(" ");
		yearTF.setText(" ");
		console.setText(" ");
		*/
	 }
	 /**
	  * Displays a list of helpful instructions in the output window.
	  */
	 public void help() 
	 {
		 
	 }
	
	public ControlOOP()
	{
		cliMenu();

	}
	
	public static void main(String[] args)
	{    
		ControlOOP c = new ControlOOP();  
		
	}

	
}
