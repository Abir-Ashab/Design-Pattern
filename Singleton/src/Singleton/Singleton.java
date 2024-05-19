package Singleton;

public final class Singleton { //final for no extension or implementation from others classes
    private static volatile Singleton instance;

    public String value;
    
    //this constructor is for creating and initializing an object of this class
    private Singleton(String value) { //private kora hoise karon ami chai just ekta instance
    	//create korte inside the Singleton class 
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        Singleton result = instance;
        // Synchronized korar por arekta problem hoichhe, jeta hochchhe 
        // instance create kora thakleo each time wait korte hoitechhe until thread return soemthing
        // jeta hudai time killing, tai nicher if diye 
        // double-checked locking idiom use kore oi problem o solve kora hoichhe
        if (result != null) {
            return result;
        }
        //synchronized is for restricting multithread problem, 
        //eta deyar fole just ekta thread e at a time etake execute korte parbe
        synchronized(Singleton.class) {
        	//this statement ensures the single instance creation in single thread process
            if (instance == null) {
                instance = new Singleton(value); //instance creation
            }
            return instance;
        }
    }
    @Override
    public String toString() {
        return value; //what I will return from here it will output in the test class
    }
}