package springmvc.dao;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import springmvc.modal.User;

@Repository
public class UserDao {

	@Autowired
	HibernateTemplate template;
	
	@Transactional
	public String insert(User user)
	{
		String res = (String) template.save(user);
		
		System.out.println("user saved successfully "+res);
		
		return  res;
	}
}
