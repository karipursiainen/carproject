package fi.agileo.carproject.domain;

public class Ajaja extends Auto {
	
	private Auto car;
	private String name;
	private Ajotapa behavior;
	
	public enum Ajotapa {
		AGGRESSIIVINEN(1.0), TAVALLINEN(0.7), RAUHALLINEN(0.4);
		// 1.0, 0.7, 0.4;
		
		private final double behavior;

/*
		public void setBehavior(Double behavior) {
			this.behavior = behavior;
		}
*/
		private Ajotapa(Double behavior){
			this.behavior = behavior;
		}
		
		public Double getBehavior() {
			return behavior;
		}

	}

	public Ajaja(Auto car, String name, Ajotapa behavior) {
		//super();
		this.car = car;
		this.name = name;
		this.behavior = behavior;
	}
	
	public Auto getCar() {
		return car;
	}

	public void setCar(Auto car) {
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double aja(double tuntia) {
		double paluuArvo = 0.0;
		double ajotapa;
		ajotapa = behavior.getBehavior();
		paluuArvo = car.laskeNopeus(car.getEngine().getCylinders(),car.getEngine().meneRikki(),car.getTopSpeed()) * tuntia * ajotapa;
		return paluuArvo;
	}
	
	public double aja1(double tuntia) {
		double paluuArvo;
		if (tuntia < 0.0){
			return 0.0;
		}
		paluuArvo = car.laskeNopeus1() * tuntia * behavior.getBehavior();
				
		return paluuArvo;
	}
	
}
