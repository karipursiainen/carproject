package fi.agileo.carproject.domain;

public class Moottori {
	
	private int power;
	private int cylinders;
	private int brokenCylinders;
	
	public Moottori(int power, int cylinders, int brokenCylinders) {
		super();
		this.power = power;
		this.cylinders = cylinders;
		this.brokenCylinders = brokenCylinders;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getCylinders() {
		return cylinders;
	}
	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}
	public int getBrokenCylinders() {
		return brokenCylinders;
	}
	public void setBrokenCylinders(int brokenCylinders) {
		this.brokenCylinders = brokenCylinders;
	}
	
	public int meneRikki() {
		int sylintereitaRikki = 0;
		//sylintereitaRikki = 1 + (int)( Math.random() * (getCylinders() - getBrokenCylinders()) );
		sylintereitaRikki = (int)( (getCylinders() - getBrokenCylinders()) ); // Testausta varten
		return sylintereitaRikki;
	}
}
