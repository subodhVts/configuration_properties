package in.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao implements IUserDao{

	public UserDao() {
		System.out.println("UserDao::constructor");
	}
	
	public String getNameBiId(int id) {
		System.out.println("DI Happened");
		if(id==100){
			return "john";
		}
		
		else {
			return "Smith";
		}
		
	}
	

}
