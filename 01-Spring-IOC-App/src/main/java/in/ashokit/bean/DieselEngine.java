package in.ashokit.bean;

public class DieselEngine implements IEngine {
	
	public DieselEngine(){
		System.out.println("DieselEngine::constructor");
	}

	@Override
	public boolean start() {
		System.out.println("DieselEngine start ");
		return true ;
	}
	

}
