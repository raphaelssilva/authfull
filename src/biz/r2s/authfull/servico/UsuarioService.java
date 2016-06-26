package biz.r2s.authfull.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import biz.r2s.authfull.DAO.UsuarioDAO;
import biz.r2s.authfull.model.Usuario;
import biz.r2s.util.Service.ServiceCRUDAbstract;

@Component
public class UsuarioService extends ServiceCRUDAbstract<Usuario>{

	@Autowired
	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.dao = usuarioDAO;
	}
}
