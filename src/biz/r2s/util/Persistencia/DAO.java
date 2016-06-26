package biz.r2s.util.Persistencia;

import java.util.List;

public interface DAO<T> {
 
	public T create(T object);
	public T edit(T object);
	public void delete(T object);
	public List<T> findAll();
	public T find(Long id);
}
 
