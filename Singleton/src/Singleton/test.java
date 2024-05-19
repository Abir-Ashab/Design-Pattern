package Singleton;

public class test {
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance("naam");
		System.out.println(s);//here I am calling toString explicitly
		System.out.println(s.value);
		
		//checking singleton
		Singleton s2 = Singleton.getInstance("naam nai");
		System.out.println(s.value);
	}
}