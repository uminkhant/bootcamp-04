package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.SQLException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.jdc.mkt.utils.Connector;


@TestMethodOrder(OrderAnnotation.class)
public class ConnectionTest {

	
	private static Connector connector;
	
	@BeforeAll
	static void createConnectorObj() {
		connector = new Connector();
	}
	
	@Test
	@Order(1)
	void testConnection() throws SQLException {
		assertNotNull(connector.getConnection());
	}
	
	
	
}
