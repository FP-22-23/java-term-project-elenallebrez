package test;
import java.time.LocalDate;

import baseball.Baseball;
import baseball.Types;

public class TestBaseball {
	
	public static void main(String[] args) {
		Baseball new1 = new Baseball("CU",2019-8-10,45.5,"Pablo Fdez", "null","walks",3,"R","Boston","NY");
		Baseball new2 = new Baseball("FF",2021-1-12,50.5,"Carmen Perez", "strikeout","walks",2,"R","NY","Texas");
		Baseball new3 = new Baseball("CH",2020-9-11,30.5,"Nacho Gonzalez", "homerun","run",4,"L","Chicago","Celties");
		Baseball new4 = new Baseball("CU",2019-8-10,45.5,"Pablo Fdez", "null","walks",3,"R","Boston","NY");							
		Baseball new5 = new2;
	
		System.out.println(new1);
		System.out.println("Are new1 and new2 equals? "+ new1.equals(new4));
		System.out.println("Are new1 and new5 equals? "+ new1.equals(new5));
		
		new3.setPlayer("Miguel Sanchez");
		System.out.println(new3);
		
		new2.setHome_team("Javier Lopez");
		System.out.println(new2);
	}
	

}
