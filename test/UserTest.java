import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.entity.Users;

public class UserTest {

	public static void main(String[] args)
	{
		Users user1 = new Users();
		user1.setEmail("ggmochoana@gmail.com");
		user1.setFullName("Gontse");
		user1.setPassword("Password");
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(user1);
		entityManager.getTransaction().commit();
		entityManager.close();
		
		System.out.println("User persisted:"+user1.toString());
	}
}
