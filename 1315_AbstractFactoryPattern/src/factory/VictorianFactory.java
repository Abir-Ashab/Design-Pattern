package factory;

import chair.Chair;
import chair.VictorianChair;
import coffee_table.Coffee_Table;
import coffee_table.VictorianCoffee_Table;
import sofa.Sofa;
import sofa.VictorianSofa;

public class VictorianFactory extends AbstractFactory {
	public Chair createChair() {
		return new VictorianChair();
	}
	public Sofa createSofa() {
		return new VictorianSofa();
	}
    public Coffee_Table createCoffee_Table() {
    	return new VictorianCoffee_Table();
    }

}
