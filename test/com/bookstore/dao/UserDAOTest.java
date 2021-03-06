package com.bookstore.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bookstore.entity.Users;

public class UserDAOTest {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static UserDAO userDao;
	
	/**
	 * The method must be static to be re-used and instantiated once
	 */
	@BeforeClass
	public static void setUpClass()
	{
		entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
		entityManager = entityManagerFactory.createEntityManager();
		userDao = new UserDAO(entityManager);
	}
	
	@Test
	public void testCreateUsers() {
		Users user1 = new Users();
		user1.setEmail("mimi@gmail.com");
		user1.setFullName("Mimi");
		user1.setPassword("mimi");
		
		user1 = userDao.create(user1);
		
		assertTrue(user1.getUserId() > 0);
		
	}

	/**
	 * When we test for a specific exception
	 * We add expected in Test
	 */
	@Test(expected = PersistenceException.class)
	public void testCreateUsersFieldNotSet()
	{
		Users user1 = new Users();
		user1 = userDao.create(user1);
		//assertTrue(user1.getUserId() > 0);
	}
	
	
	@Test
	public void testUpdateUser()
	{
		Users user = new Users();
		user.setEmail("noLongerTman@gmail.com");
		user.setFullName("T-junction");
		user.setPassword("tjunction");
		user.setUserId(3);
		
		user = userDao.update(user);
		
		String expected = "tjunction";
		String actual = user.getPassword();
		assertEquals(expected,actual);
	}
	@Test
	public void testFindUser()
	{
		Integer userId =1;
		Users user = new Users();
		user = userDao.get(userId);
		assertNotNull(user);
	}
	
	@Test
	public void testUserNotFound()
	{
		Integer userId = 400;
		Users user = new Users();
		user = userDao.get(userId);
		assertNull(user);
	}
	
	@Test
	public void testDeleteUser()
	{
		Integer userId = 3;
		userDao.delete(userId);
		
		Users user = userDao.get(userId);
		assertNull(user);
	}
	
	@Test(expected=EntityNotFoundException.class)
	public void testDeleteNonExist()
	{
		Integer userId = 55;
		userDao.delete(userId);
		
	}
	
	@Test
	public void testListAll()
	{
		List<Users> listUsers = userDao.listAll();
		assertTrue(listUsers.size() > 0);
	}
	
	@Test
	public void testCountAll()
	{
		Long count = userDao.count();
		assertTrue(count > 0);
	}
	
	@AfterClass
	public static void tearDownClass()
	{
		entityManager.close();
		entityManagerFactory.close();
	}
}
