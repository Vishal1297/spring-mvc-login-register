package org.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.model.Login;
import org.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoImpl implements UserDao {

	@Autowired
	DataSource dataSource;

	@Override
	public boolean register(User user) throws SQLException {
		String query = "insert into userdata(username, password, name, email) values(?,?,?,?)";
		Connection connection = null;
		PreparedStatement statement = null;
		boolean valid = false;
		try {
			connection = dataSource.getConnection();
			statement = connection.prepareStatement(query);
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getName());
			statement.setString(4, user.getEmail());
			valid = statement.executeUpdate() > 0;
		} finally {
			statement.close();
			connection.close();
		}
		return valid;
	}

	@Override
	public boolean validateUser(Login login) throws SQLException {
		String query = "select * from userdata where username = ? and password = ?";
		Connection connection = null;
		PreparedStatement statement = null;
		boolean valid = false;
		try {
			connection = dataSource.getConnection();
			statement = connection.prepareStatement(query);
			statement.setString(1, login.getUsername());
			statement.setString(2, login.getPassword());
			valid = statement.executeQuery().isBeforeFirst();
		} finally {
			statement.close();
			connection.close();
		}
		return valid;
	}

}
