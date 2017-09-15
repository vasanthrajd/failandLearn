package com.training.daos;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.training.Address;
import com.training.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public int addUser(User usr) {
		
		Integer userId = (Integer)getHibernateTemplate().save(usr);
		
		Integer userId2 = (Integer)getHibernateTemplate().save(new Address(67,"A", "B",8798788L));

		
		return userId ;
		
	}

	@Override
	public User findUserbyId(int id) {
		
		    User usr =getHibernateTemplate().get(User.class, id);
		    	
	
		return usr;
	}


}
