package test;
import java.time.LocalDate;

import baseball.Baseball;
import baseball.Types;

public class TestBaseball {
	
	public static void main(String[] args) {
		//We will first try to test the Baseball Class
		Baseball b1 = new Baseball(Types.CU,LocalDate.of(2019, 8, 9),45.5,"Pablo Fdez", "null","walks",3,true,"Boston","NY");
		Baseball b2 = new Baseball(Types.FF,LocalDate.of(2021, 11, 12),50.5,"Carmen Perez", "strikeout","walks",2,true,"NY","Texas");
		Baseball b3 = new Baseball(Types.CH,LocalDate.of(2020, 9, 11),30.5,"Nacho Gonzalez", "homerun","run",4,false,"Chicago","Celties");
		Baseball b4 = new Baseball(Types.CU,LocalDate.of(2019, 5, 3),45.5,"Pablo Fdez", "null","walks",3,true,"Boston","NY");							
		Baseball b5 = b2;
		
		//Now we test the second constructor
		Baseball b6 = new Baseball(Types.SL,LocalDate.of(2017, 1, 2),15.7,"Pablo Fdez", "homerun","NY","Boston" );
		System.out.println(b6);
		
		//Getters and setters
		b3.setSpeed(30.0);
		System.out.println("The ball speed of " + b3.getPlayer() +" is: "+ b3.getSpeed());
		System.out.println(b3);
		
		b2.setHome_team("Californa");
		System.out.println("The home team of the match played at "+ b2.getDate()+ "is " + b2.getHome_team());
		System.out.println(b2);
		
		System.out.println(b1.getTotalDescription());
		
		//We now test for equality and Natural Order
		System.out.println("Are new1 and new2 equals? "+ b1.equals(b4));
		System.out.println("Are new1 and new5 equals? "+ b1.equals(b5));
		System.out.println(b1.compareTo(b2));

	}
	
}
