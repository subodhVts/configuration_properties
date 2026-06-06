package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;

	public UserService() {
		System.out.println("UserService::constructor");
	}
	
	public String getUserById() {
		return userDao.findUserById();
	}
	
	

}
