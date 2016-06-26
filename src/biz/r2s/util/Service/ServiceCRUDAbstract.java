package biz.r2s.util.Service;

import java.util.List;

import biz.r2s.util.CommonsUtil;
import biz.r2s.util.Persistencia.DAO;

public abstract class ServiceCRUDAbstract<T> implements ServiceCRUD<T> {

	protected DAO<T> dao;

	@Override
	public T inserir(T obj) {
		return dao.create(obj);
	}

	@Override
	public T alterar(T obj) {
		return dao.edit(obj);
	}

	@Override
	public void excluir(T obj) {
		dao.delete(obj);
	}

	@Override
	public T consultar(T obj) {
		return dao.find(CommonsUtil.getIdByObjeto(obj));
		
	}

	@Override
	public List<T> listar() {
		return dao.findAll();
	}
	


}
