package com.example.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.User;
import com.example.Repository.UserRepository;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepo;
	@Override
	public int login(String name, String password) {
		// TODO Auto-generated method stub
		User user=userRepo.readByName(name);
		System.out.println(user.getName());
		if(user.getPassword().equals("test"))
			return 1;
		return 0;
	}

}
