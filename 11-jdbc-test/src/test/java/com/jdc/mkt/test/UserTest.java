package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jdc.mkt.ds.User;
import com.jdc.mkt.service.UserServiceImpl;

@TestMethodOrder(OrderAnnotation.class)
public class UserTest {

	private static UserServiceImpl libraryService;
	
	@BeforeAll
	static void createObject() {
		libraryService = new UserServiceImpl();
		
	}
	
	@ParameterizedTest
	@Order(1)
	@CsvSource({"admin,admin,true","user,user,true","mkt,mkt,true"})
	void insertUser(String name,String password,boolean isActive) {
		User user = new User(name, password, isActive);
		assertEquals(1, libraryService.save(user));
		
		
	}
	@ParameterizedTest
	@Order(2)
	@CsvSource({"2,mkt,admin,true"})
	void updateUser(int id ,String name,String password,boolean isActive) {
		User user = libraryService.findById(id);
		
		assertNotNull(user);
		
		user.setName(name);
		user.setPassword(password);
		user.setActive(isActive);
		
		assertEquals(1, libraryService.update(user));
	}
	
	@ParameterizedTest
	@Order(3)
	@ValueSource(ints= {1,2})
	void deleteUser(int id) {
		assertEquals(1, libraryService.delete(id));
	}
	
	@Test
	@Order(4)
	void findAllUser() {
		assertEquals(1,libraryService.findAll().size());
	}
	
	
	
}
