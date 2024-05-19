package factory;

import chair.Chair;
import coffee_table.Coffee_Table;
import sofa.Sofa;

public abstract class AbstractFactory {
	abstract Chair createChair();
	abstract Sofa createSofa();
	abstract Coffee_Table createCoffee_Table();
}
