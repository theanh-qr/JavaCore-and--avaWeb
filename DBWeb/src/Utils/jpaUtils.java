package Utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class jpaUtils {
public static EntityManager getEntityManager() {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("DBWeb");
	return emf.createEntityManager();
}


}

