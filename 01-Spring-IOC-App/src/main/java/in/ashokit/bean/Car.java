package in.ashokit.bean;

public class Car {
	private IEngine eng ;
	
	
	public Car(IEngine eng) {
		System.out.println("Car constructor got called");
		this.eng=eng;
	}
	
	public void setEngg(IEngine eng) {
		this.eng = eng;
		System.out.println("setter injection called");
	}
	

	
	public boolean drive() {
		System.out.println("heppy journey");
		System.out.println("Line no 21 ="+eng.getClass().getName());
		boolean start = eng.start();
		System.out.println("car started");
		return true;
		
	}

	
	
		
	

}
