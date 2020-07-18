package org.service;

import java.sql.SQLException;

import org.dao.UserDao;
import org.model.Login;
import org.model.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author vishal
 */

public class UserService {

	@Autowired
	UserDao userDao;

	public boolean verifyLogin(Login login) throws SQLException {
		if (login.getUsername().isEmpty() || login.getPassword().isEmpty()) {
			return false;
		} else {
			return userDao.validateUser(login);
		}
	}

	public boolean isRegistered(User user) throws SQLException {
		if (user.getUsername().isEmpty() || user.getPassword().isEmpty() || user.getName().isEmpty()
				|| user.getEmail().isEmpty()) {
			return false;
		} else {
			return userDao.register(user);
		}
	}

}
