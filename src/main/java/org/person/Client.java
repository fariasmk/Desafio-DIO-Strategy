package org.person;


import org.person.strategies.eat.MeatFoodStrategy;
import org.person.strategies.eat.VeggieFoodStrategy;
import org.person.strategies.transportation.AirplaneStrategy;
import org.person.strategies.transportation.BikeStrategy;
import org.person.strategies.transportation.CarStrategy;
import org.person.strategies.transportation.WalkStrategy;
import org.person.strategies.work.DeveloperStrategy;
import org.person.strategies.work.NoWorkStrategy;
import org.person.strategies.work.PilotStrategy;

public class Client {

	public static void presentYourself(Person person) {
		System.out.println("Hi, I'm " + person.getName());
		person.eat();
		person.move();
		person.work();
		System.out.println("----------------");
	}
	
	public static void main(String[] args) {
		Person jhon = new Person("Jhon", new MeatFoodStrategy(),
				new CarStrategy(), new DeveloperStrategy());
		presentYourself(jhon);
		
		Person ann = new Person("Ann", new MeatFoodStrategy(), 
				new AirplaneStrategy(), new PilotStrategy());
		presentYourself(ann);
		
		Person carol = new Person("Carol", new VeggieFoodStrategy(),
				new BikeStrategy(), new DeveloperStrategy());
		presentYourself(carol);
		
		Person alan = new Person("Alan", new VeggieFoodStrategy(), 
				new WalkStrategy(), new NoWorkStrategy());
		presentYourself(alan);
	}
}