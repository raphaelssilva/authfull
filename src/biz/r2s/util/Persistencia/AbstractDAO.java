package biz.r2s.util.Persistencia;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.annotations.Transactional;

public abstract class AbstractDAO<T> implements DAO<T> {

	private Class<T> classe;
	
	@SuppressWarnings("unchecked")
	public AbstractDAO(){
		this.classe = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	@Override
	@Transactional
	public T create(T object) {
		PersistenceManager pm = Conexao.get().getPersistenceManager();
		
		try {
			return pm.makePersistent(object);
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		finally{
			pm.close();
		}
		
		
	}

	@Override
	@Transactional
	public T edit(T object) {
		PersistenceManager pm = Conexao.get().getPersistenceManager();
		
		try {
			return pm.makePersistent(object);
			
		} catch (Exception e) {
			e.fillInStackTrace();
			return null;
		}
		finally{
			pm.close();
		}		
	}

	@Override
	@Transactional
	public void delete(T object) {
		PersistenceManager pm = Conexao.get().getPersistenceManager();
		
		try {
			T obj = getObject(object, pm);
			pm.deletePersistent(obj);
			
		} catch (Exception e) {
			e.fillInStackTrace();
		}
		finally{
			pm.close();
		}
	}

	@SuppressWarnings("unchecked")
	
	private T getObject(T object, PersistenceManager pm)
			throws IllegalAccessException, InvocationTargetException,
			NoSuchMethodException {
		return (T) pm.getObjectById(object.getClass(), object.getClass().getMethod("getId").invoke(object));
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<T> findAll() {
		PersistenceManager pm = Conexao.get().getPersistenceManager();
		List<T> list = null;
		
		try {
			String query = "select from "+classe.getName();
			Query q = (Query) pm.newQuery(query);
			
			list = (List<T>)q.execute();
			list.size();
			
		} catch (Exception e) {
			e.fillInStackTrace();
		}
		finally{
			pm.close();
		}
		
		return list;
	}

	@Override
	@Transactional
	public T find(Long id) {
		PersistenceManager pm = Conexao.get().getPersistenceManager();
		T obj = null;
		
		try {
			obj = (T) pm.getObjectById(classe, id);
			
		} catch (Exception e) {
			e.fillInStackTrace();
		}
		finally{
			pm.close();
		}
		return obj;
	}
	
	

}
