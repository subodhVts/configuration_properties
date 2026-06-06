package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.UserInfo;
import in.ashokit.repo.UserInfoRepository;

@Service
public class UserService {
	@Autowired
    private UserInfoRepository dao;
	public UserInfo saveUser(UserInfo user) {
		UserInfo save = dao.save(user);
		return save;
		
		
	}

}
