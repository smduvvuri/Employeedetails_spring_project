package org.cap.dao;

import org.cap.entities.Employee;

public interface IUserDao {
	
	Employee getUserByName(String name);

    boolean credentialsCorrect(String name, String password);

}
