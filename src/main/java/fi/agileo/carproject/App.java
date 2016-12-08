package fi.agileo.carproject;

import fi.agileo.carproject.domain.Ajaja;
import fi.agileo.carproject.domain.Ajaja.Ajotapa;
import fi.agileo.carproject.domain.Auto;
import fi.agileo.carproject.domain.Moottori;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		Moottori engine1 = new Moottori(200,8,0);
		Moottori engine2 = new Moottori(300,8,0);
		Moottori engine3 = new Moottori(500,12,0);

		Auto car1 = new Auto("BMW","328",200,engine1,null);
		Auto car2 = new Auto("Ford","Mustang",250,engine2,null);
		Auto car3 = new Auto("Ferrari","FF",280,engine3,null);
		Ajaja driver1 = new Ajaja(car1,"Kuski1",Ajotapa.RAUHALLINEN);
		Ajaja driver2 = new Ajaja(car2,"Kuski2",Ajotapa.TAVALLINEN);
		Ajaja driver3 = new Ajaja(car3,"Kuski3",Ajotapa.AGGRESSIIVINEN);

		car1.setDriver(driver1);
		car2.setDriver(driver2);
		car3.setDriver(driver3);
		
		/*
		// System.out.println(car2.driver.behavior + ", " + car2.engine.power);
		System.out.println(car2.engine.getCylinders() + ", " + 
				car2.engine.getBrokenCylinders() + ", " + car2.getTopSpeed());
		System.out.println(car2.laskeNopeus(car2.engine.getCylinders(),
				car2.engine.meneRikki(),car2.getTopSpeed()));
		//System.out.println(car2.laskeNopeus(4, car2.engine.meneRikki(), 100));
		System.out.println(car2.driver.behavior.getBehavior());
		//System.out.println(car2.engine.meneRikki());
		System.out.println(car2.driver.aja(2));
		*/
    }
}
