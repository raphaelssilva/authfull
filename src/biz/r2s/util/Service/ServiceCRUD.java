package biz.r2s.util.Service;

import java.util.List;

public interface ServiceCRUD<T> {	
	
	public T inserir(T obj);
	public T alterar(T obj);
	public void excluir(T obj);
	public T consultar(T obj);
	public List<T> listar();

}
