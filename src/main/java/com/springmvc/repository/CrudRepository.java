package com.springmvc.repository;

import java.util.List;

public interface CrudRepository<T> {
	List<T> findAll();
}
