package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTakeOffTime;
	private Date lastLandingTime;

	Plane(int maxPassengers) {
		this.maxPassengers = maxPassengers;
		this.passengers = new ArrayList<String>();
	}

	public void onboard(String passengerName) {
		this.passengers.add(passengerName);

	}

	public void setTakeOff() {
		this.lastTakeOffTime = new Date();

	}

	public Date getTakeOffTime() {
		return this.lastTakeOffTime;

	}

	public void setLand() {
		this.lastLandingTime = new Date();
		this.passengers.clear();
	}

	public Date getLastTimeLanded() {
		return this.lastLandingTime;

	}

	public List<String> getPassengers() {
		return this.passengers;
	}

}

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// Create and Obj of Plane
		Plane b474 = new Plane(10);
		// onboard passengers
		b474.onboard("Akash");
		b474.onboard("Sunil");
		b474.onboard("Veni");
		b474.onboard("Aarna");

		// set take off time
		b474.setTakeOff();
		System.out.println("Plane took off at:" + b474.getTakeOffTime());
		System.out.println("The Passengers in the Plane:" + b474.getPassengers());
		// Flying
		System.out.println("Plane is Flying");
		Thread.sleep(5000);

		// set the Landing
		b474.setLand();
		System.out.println("Plane Landed at:" + b474.getLastTimeLanded());
		System.out.println("The Passengers in the Plane after landing:" + b474.getPassengers());

	}

}
