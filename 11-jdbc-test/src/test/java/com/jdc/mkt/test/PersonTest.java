package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.mkt.ds.Address;
import com.jdc.mkt.ds.Person;
import com.jdc.mkt.service.AddressServiceImpl;
import com.jdc.mkt.service.PersonServiceImpl;

public class PersonTest {

	private static PersonServiceImpl personService;
	private static AddressServiceImpl addressService;
	
	@BeforeAll
	static void createPersonService() {
		personService = new PersonServiceImpl();
		addressService  = new AddressServiceImpl();
	}
	
	@ParameterizedTest
	@CsvSource({"John willian,mdy,mahar aung myay,35st bet 73 and 74"})
	void insertPerson(String name,
			String city,String township,String street) {
		
		Address a = new Address(city,township,street);
		int id = addressService.save(a);
		
		assertEquals(5,id);
		
//		
//		
//		Person p = new Person(name, a);
//		
//		assertEquals(1, personService.save(p)) ;
	}
}
