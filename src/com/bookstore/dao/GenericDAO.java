package com.bookstore.dao;

import java.util.List;

public interface GenericDAO<T> {
	/**
	 * The operations are common to all DAO classes
	 * @param t
	 * @return
	 */
	public T create(T t);
	public T update(T t);
	public T get(Object id);
	public void delete(Object id);
	public List<T> listAll();
	public long count();
}
