package biz.r2s.authfull.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import biz.r2s.authfull.model.Usuario;
import biz.r2s.authfull.servico.UsuarioService;
import biz.r2s.util.Controller.ControllerCRUDAbstract;

@Controller
@RequestMapping(value="/user")
public class UsuarioController extends ControllerCRUDAbstract<Usuario>{
	
	@Autowired
	public void setUsuarioService(UsuarioService usuarioService) {
		this.serviceCRUD = usuarioService;
		this.path = "user";
	}
}
