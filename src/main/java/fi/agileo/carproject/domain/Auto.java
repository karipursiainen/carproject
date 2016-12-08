package fi.agileo.carproject.domain;

public class Auto {
	
	private String mark;
	private String model;
	private int topSpeed;
	private Moottori engine;
	private Ajaja driver;
	
	public Auto() {
		super();
	}
	
	public Auto(String mark, String model, int topSpeed, Moottori engine,
			Ajaja driver) {
		super();
		this.mark = mark;
		this.model = model;
		this.topSpeed = topSpeed;
		this.engine = engine;
		this.driver = driver;
	}
	
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	public Moottori getEngine() {
		return engine;
	}
	public void setEngine(Moottori engine) {
		this.engine = engine;
	}
	public Ajaja getDriver() {
		return driver;
	}
	public void setDriver(Ajaja driver) {
		this.driver = driver;
	}
	
	public Double laskeNopeus(int sylinterienMaara, int sylintereitaRikki, int huippuNopeus){
		double paluuArvo = 0.0;
		paluuArvo = ((1.0 * (sylinterienMaara - sylintereitaRikki) / (1.0 * sylinterienMaara)) * huippuNopeus);
		return paluuArvo;
	}

	public double laskeNopeus1() {
		double paluuArvo;
		paluuArvo = ((engine.getCylinders() - engine.getBrokenCylinders()) * getTopSpeed()/engine.getCylinders());
		return paluuArvo;
	}
}
 