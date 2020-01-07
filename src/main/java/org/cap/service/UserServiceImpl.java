package org.cap.service;
import org.cap.dao.IUserDao;
import org.cap.entities.Employee;
import org.cap.exceptions.UserNotFoundException;
import org.springframework.stereotype.Service;



import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements IUserService {
	private IUserDao userDao;
	public IUserDao getUserDao() {
		return userDao;
		
	}

	@Autowired
	public void setUserDao(IUserDao dao)
	{
		this.userDao=dao;
	}
	
	@Override
    public Employee getUserByName(String name) {
       
        
        if (name==null) {
            throw new UserNotFoundException("Name not found");
        }
        Employee user = userDao.getUserByName(name);
        return user;
    }

    @Override
    public boolean credentialsCorrect(String name, String password) {
        boolean correct = userDao.credentialsCorrect(name, password);
        return correct;
    }
}
