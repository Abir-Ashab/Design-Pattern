package Main;

import chair.Chair;
import coffee_table.Coffee_Table;
import factory.ArtDecoFactory;
import factory.AbstractFactory;
import factory.VictorianFactory;
import factory.ModernFactory;
import sofa.Sofa;

public class Main {
	
	public static void main(String[] args) {
		VictorianFactory myFactory = new VictorianFactory();
		Chair myChair = myFactory.createChair();
		myChair.Print();
		
		Sofa mySofa = myFactory.createSofa();
		mySofa.Print();
		
		Coffee_Table myCoffee_Table = myFactory.createCoffee_Table();
		myCoffee_Table.Print();
	}

}
