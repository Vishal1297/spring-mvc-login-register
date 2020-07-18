package org.dao;

import java.sql.SQLException;

import org.model.Login;
import org.model.User;

/**
 * @author vishal
 */
public interface UserDao {

	boolean register(User user) throws SQLException;

	boolean validateUser(Login login) throws SQLException;

}
