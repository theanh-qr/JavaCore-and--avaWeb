package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import Utils.jpaUtils;

public class UserD {
	public int insert(User user) {
		EntityManager em=jpaUtils.getEntityManager();
		EntityTransaction trans=em.getTransaction();
		try{
					trans.begin();
					em.persist(user);
					trans.commit();
}catch (Exception e) {
	trans.rollback();
	System.out.println("loi la" + e.toString());
	return -1;
}
		finally {
			em.close();
		}
		return 1;
	}
	// hàm update 
	public int update(User user) {
		EntityManager em=jpaUtils.getEntityManager();
		EntityTransaction trans=em.getTransaction();
		try {
			trans.begin();
			em.merge(user);
			trans.commit();
		}catch (Exception e) {
			trans.rollback();
			System.out.println("lỗi là " +e.toString());
			return -1;
		}
				finally {
					em.close();
				}
				return 1;
	}
	public User tkId(String id) {
		EntityManager em = jpaUtils.getEntityManager();
		User user = em.find(User.class, id);
		return user;
		
	}
	//ham tim tat ca
	public List<User> tkAll(){
		EntityManager em = jpaUtils.getEntityManager();
		TypedQuery<User> query = em.createNamedQuery("User.findAll",User.class);
		return query.getResultList();
	}
	
	public boolean checkLogin1(String username, String password) {
		EntityManager em=jpaUtils.getEntityManager();
		String jpql="SELECT U FORM User u where u.id=:usernam and u.password=:pass";
		TypedQuery<User> query=em.createQuery(jpql,User.class);
		query.setParameter("usernam", username);
		query.setParameter("pass", password);
		User user=query.getSingleResult();
		if(user !=null) {
			return true;
		}
		return false;
		}
	//
	public List<User> tktheoten(String name){
		EntityManager em = jpaUtils.getEntityManager();
		String jpql="SELECT U FROM User u where u.fullname like:ht";
		TypedQuery<User> query=em.createQuery(jpql, User.class);
		query.setParameter("ht","%"+name+"%");
		return query.getResultList();
	}
}