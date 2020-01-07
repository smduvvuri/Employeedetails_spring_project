package org.cap.dao;
import java.util.HashMap;
import java.util.Map;

import org.cap.entities.Employee;
import org.cap.exceptions.UserNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao{

	 private Map<String, Employee> store = new HashMap<>();

	    public UserDaoImpl() {
	        Employee user1 = new Employee("Shree","1234", 1);
	        store.put("Shree", user1);
	        Employee user2 = new Employee("Shobha", "4321",2);
	        store.put("Shobha", user2);
	    }

	    @Override
	    public boolean credentialsCorrect(String name, String password) {
	        Employee user = store.get(name);
	        if (user == null) {
	            return false;
	        }
	        return user.getPassword().equals(password);
	    }

	    @Override
	    public Employee getUserByName(String name) {
	        Employee user = store.get(name);
	        if (user == null) {
				throw new UserNotFoundException("Account not found for name=" +name);
			}
			return user;
}
}