package activities;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	Car(String color,String transmission,int make){
		this.transmission=transmission;
		this.make=make;
		this.color= color;
		this.tyres=4;
		this.doors=4;
	}
	
	public void displayCharacteristics() {
		
		System.out.println("Colors:" + color);
		System.out.println("Transmission Type:" + transmission);
		System.out.println("Year of making:" + make);
		System.out.println("No.of tyres:" + tyres);
		System.out.println("No.of doors:" + doors);
	}
	
	public void accelarate() {
		System.out.println("Car is moving forward");
	}
	
	public void brake() {
	System.out.println("Car is stopped");
	}
	
}
