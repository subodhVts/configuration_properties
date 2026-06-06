package in.ashokit.bean;

public class PetrolEngine implements IEngine {
	
	public PetrolEngine(){
		System.out.println("PetrolEngine::constructor");
	}

	@Override
	public boolean start() {
		System.out.println("PetrolEngine start ");
		return true ;
	}
	

}
