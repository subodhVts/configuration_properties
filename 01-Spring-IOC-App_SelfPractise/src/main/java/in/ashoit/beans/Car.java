package in.ashoit.beans;

public class Car {
	
	private IEngine eng;

	public Car(IEngine eng) {
		
		this.eng = eng;
	}

   public void setEng(IEngine eng) {
		this.eng = eng;
	}
	
	public void drive() {
		boolean start = eng.start();
		if(start) {
			System.out.println("car started ::happy journey");
		}
	}
	

}
