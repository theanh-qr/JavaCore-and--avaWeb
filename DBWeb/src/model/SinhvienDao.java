package model;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import Utils.jpaUtils;
public class SinhvienDao {
	public int insert(Sinhvien sinhvien) {
		EntityManager em = jpaUtils.getEntityManager();
		EntityTransaction trans = em.getTransaction();
		try {
			trans.begin();
			em.persist(sinhvien);
			trans.commit();
		} catch (Exception e) {
			// TODO: handle exception
			trans.rollback();
			System.out.println("Lỗi là: " + e.toString());
			return -1;
		}
		finally {
			em.close();
		}
		return 1;
	}
//	 ham update
	public int update(Sinhvien sinhvien) {
		EntityManager em = jpaUtils.getEntityManager();
		EntityTransaction trans = em.getTransaction();
		try {
			trans.begin();
			em.merge(sinhvien); //update
			trans.commit();
		} catch (Exception e) {
			// TODO: handle exception
			trans.rollback();
			System.out.println("Lỗi là: " + e.toString());
			return -1;
		}
		finally {
			em.close();
		}
		return 1;
	}

	// ham tim theo id
	public Sinhvien tkId(String MaSV) {
		EntityManager em = jpaUtils.getEntityManager();
		Sinhvien sinhvien = em.find(Sinhvien.class, MaSV);
		return sinhvien;
		
	}
	//ham tim tat ca
	public List<Sinhvien> tkAll(){
		EntityManager em = jpaUtils.getEntityManager();
		TypedQuery<Sinhvien> query = em.createNamedQuery("Sinhvien.findAll",Sinhvien.class);
		return query.getResultList();
	}
	// ham dem
	public int count() {
		return tkAll().size();
	}

	//ham checklogin 1
//	public boolean checkLogin(String username, String password ) {
//		User user = tkId(username);
//		if(user != null) {
//			if(user.getPassword().equals(password)) {
//				return true;
//			}
//		}
//		return false;
//	}

	//ham checklogin 2
//	public boolean checkLogin1(String username, String password ) {
//		EntityManager em =jpaUtils.getEntityManager();
//		String jpql = "SELECT u User u where u.id= :username and u.password=: pass";
//		TypedQuery<User> query = em.createQuery(jpql,User.class);
//		query.setParameter("username", username);
//		query.setParameter("password", password);
//		User user = query.getSingleResult();
//		if(user != null) {
//			return true;
//		}else {
//			return false;
//		}
//		}
	// tim theo ten
	public List<Sinhvien> tktheoten (String name){
		EntityManager em =jpaUtils.getEntityManager();
		String jpql = "SELECT u FROM User u where u.fullname like :ht";
		TypedQuery<Sinhvien> query = em.createQuery(jpql,Sinhvien.class);
		query.setParameter("ht","%"+name+"%");
		return query.getResultList();
	}

	//ham xoa
	public int delete(String MaSV) {
		EntityManager em = jpaUtils.getEntityManager();
		EntityTransaction trans = em.getTransaction();
		try {
			trans.begin();
			Sinhvien sinhvien = em.find(Sinhvien.class,MaSV);
			if(sinhvien != null) {
				em.remove(sinhvien);
				System.out.println("Xoa Thanh Cong");
			}
			trans.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			trans.rollback();
			System.out.println("Loi la: " + e.toString());
			return -1;
		}
		finally {
			em.close();
		}
		return 1;
	}
}
