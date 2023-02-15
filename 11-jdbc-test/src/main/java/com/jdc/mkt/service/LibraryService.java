package com.jdc.mkt.service;

import java.util.List;

public interface LibraryService<T> {

	int save(T t);
	int update(T t);
	
	int delete(int id);
	T findById(int id);
	
	List<T> findAll();
	
}
