package factory;

import chair.ArtDecoChair;
import chair.Chair;
import coffee_table.ArtDecoCoffe_Table;
import coffee_table.Coffee_Table;
import sofa.ArtDecoSofa;
import sofa.Sofa;

public class ArtDecoFactory extends AbstractFactory {
	public Chair createChair() {
		return new ArtDecoChair();
	}
	public Sofa createSofa() {
		return new ArtDecoSofa();
	}
    public Coffee_Table createCoffee_Table() {
    	return new ArtDecoCoffe_Table();
    }

}
