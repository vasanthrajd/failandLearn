package com.training.daos;
import com.training.*;

public interface UserDao {

	public int addUser(User usr);
	public User findUserbyId(int id);
	
}
