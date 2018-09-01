package com.semanticsquare.thrillio.managers;

import com.semanticsquare.thrillio.dao.UserDao;
import com.semanticsquare.thrillio.entities.User;

public class UserManager {	
	private static UserManager instance = new UserManager();
	private static UserDao dao = new UserDao();
	
	private UserManager() {}
	
	public static UserManager getInstance(){
		return instance;
	}
	
	public User createUser(long id, String email, String password, String firstName, String lastName, String userType) {
		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setPassword(password);
		user.setFirstname(firstName);
		user.setLastname(lastName);
		user.setUserType(userType);
		return user;
	}
	
	public User[] getUsers() {
		return dao.getUsers();
	}

	public User createUser(long parseLong, String string, String string2, String string3, String string4, int gender,
			String string5) {
		User user = new User();
		return user;
	}
}
