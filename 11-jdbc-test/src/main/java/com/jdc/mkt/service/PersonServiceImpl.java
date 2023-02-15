package com.jdc.mkt.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.jdc.mkt.ds.Person;

import static com.jdc.mkt.utils.Connector.*;

public class PersonServiceImpl implements LibraryService<Person> {

	public PersonServiceImpl() {
		tableReset("person_tbl");
	}

	@Override
	public int save(Person p) {
		String sql = "insert into person_tbl (name,address_id) values(?,?)";

		try (Connection con = getConnection(); PreparedStatement stmt = con.prepareStatement(sql)) {

			stmt.setString(1, p.getName());
			stmt.setInt(2, p.getAddress().getId());

			return stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(Person p) {
		String sql = "update person_tbl  set name=?,address_id=? where id=?";

		try (Connection con = getConnection(); PreparedStatement stmt = con.prepareStatement(sql)) {

			stmt.setString(1, p.getName());
			stmt.setInt(2, p.getAddress().getId());
			stmt.setInt(3, p.getId());

			return stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int id) {

		String sql = "delete from person_tbl where id =?";

		try (Connection con = getConnection();
				PreparedStatement stmt = con.prepareStatement(sql)) {

			stmt.setInt(1, id);

			return stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Person findById(int id) {
		return null;
	}

	@Override
	public List<Person> findAll() {
		return null;
	}

}
