package com.jdc.mkt.service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jdc.mkt.ds.User;
import static com.jdc.mkt.utils.Connector.*;

public class UserServiceImpl implements LibraryService<User> {
	
	public UserServiceImpl() {
		tableReset("user_tbl");
	}

	@Override
	public int save(User user) {
		String sql = "insert into user_tbl (password,name,isActive) values (?,?,?)";
		
		try (var con = getConnection();
				var stmt = con.prepareStatement(sql)) {

			stmt.setString(2, user.getName());
			stmt.setString(1, user.getPassword());
			stmt.setBoolean(3, user.isActive());

			return stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(User u) {
		String sql = "update user_tbl set name=?,password=?,isActive=? where id=?";
		try (var con = getConnection();
				var stmt = con.prepareStatement(sql)) {
			
			stmt.setString(1, u.getName());
			stmt.setString(2, u.getPassword());
			stmt.setBoolean(3, u.isActive());
			stmt.setInt(4, u.getId());
			
			return stmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from user_tbl where id = ?";
		try (var con = getConnection(); 
				var stmt = con.prepareStatement(sql)) {

			stmt.setInt(1, id);
			return stmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public User findById(int id) {
		String sql = " select * from user_tbl where id=?";
		try (var con = getConnection(); 
				var stmt = con.prepareStatement(sql)) {
			
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				return user;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<User> findAll() {
		String sql = "select * from user_tbl where isActive = true";
		List<User>list = new ArrayList<>();
		
		try (var con = getConnection(); 
				var stmt = con.prepareStatement(sql)) {
			
			var rs = stmt.executeQuery();
			
			while(rs.next()) {
				User u = new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setPassword(rs.getString("password"));
				u.setActive(rs.getBoolean("isActive"));
				
				list.add(u);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
