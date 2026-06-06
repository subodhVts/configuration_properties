package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.IUserDao;

@Service
public class UserService {

	private IUserDao  userDao;
	
  // @Autowired //setter injection
   public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
   
//   public UserService() {
//	   System.out.println("0 param  cons UserService");		  
//			 
//   }
 
//	 @Autowired //cons injection
	public UserService(IUserDao userDao) {
    	 System.out.println("1 arg constructor UserService");
	     this.userDao = userDao;
}



	
	public String getUserById() {
		return userDao.getNameBiId(100);
	}
	
	

}
