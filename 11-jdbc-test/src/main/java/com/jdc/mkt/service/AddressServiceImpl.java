package com.jdc.mkt.service;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdc.mkt.ds.Address;

import static com.jdc.mkt.utils.Connector.*;

public class AddressServiceImpl implements LibraryService<Address> {

	public AddressServiceImpl() {
		// tableReset("address_tbl");
	}

	@Override
	public int save(Address a) {
		String sql = "insert into address_tbl (city,township,Street) values (?,?,?)";

		try (var con = getConnection(); var stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

			stmt.setString(1, a.getCity());
			stmt.setString(2, a.getTownship());
			stmt.setString(3, a.getStreet());

			stmt.executeUpdate();

			ResultSet rs = stmt.getGeneratedKeys();

			while (rs.next()) {
				return rs.getInt(1);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(Address a) {
		String sql = "update address_tbl set city=?,township=?,Street=? where id=? ";

		try (var con = getConnection(); var stmt = con.prepareStatement(sql)) {

			stmt.setString(1, a.getCity());
			stmt.setString(2, a.getTownship());
			stmt.setString(3, a.getStreet());
			stmt.setInt(4, a.getId());

			return stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from address_tbl where id =?";

		try (var con = getConnection(); var stmt = con.prepareStatement(sql)) {

			stmt.setInt(1, id);
			return stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Address findById(int id) {
		String sql = "select * from address_tbl where id=?";

		try (var con = getConnection(); var stmt = con.prepareStatement(sql)) {

			stmt.setInt(1, id);

			var rs = stmt.executeQuery();

			while (rs.next()) {
				Address ad = new Address();
				ad.setId(rs.getInt("id"));
				ad.setCity(rs.getString("city"));
				ad.setTownship(rs.getString("township"));
				ad.setStreet(rs.getString("street"));
				return ad;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Address> findAll() {
		String sql = "select * from address_tbl";
		List<Address> list = new ArrayList<>();

		try (var con = getConnection(); var stmt = con.prepareStatement(sql)) {

			var rs = stmt.executeQuery();

			while (rs.next()) {
				Address ad = new Address();
				ad.setId(rs.getInt("id"));
				ad.setCity(rs.getString("city"));
				ad.setTownship(rs.getString("township"));
				ad.setStreet(rs.getString("street"));

				list.add(ad);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
