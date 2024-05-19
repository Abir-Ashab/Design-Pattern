package factory;

import chair.Chair;
import chair.ModernChair;
import coffee_table.Coffee_Table;
import coffee_table.ModernCoffee_Table;
import sofa.ModernSofa;
import sofa.Sofa;

public class ModernFactory extends AbstractFactory{
	public Chair createChair() {
		return new ModernChair();
	}
	public Sofa createSofa() {
		return new ModernSofa();
	}
    public Coffee_Table createCoffee_Table() {
    	return new ModernCoffee_Table();
    }

}
