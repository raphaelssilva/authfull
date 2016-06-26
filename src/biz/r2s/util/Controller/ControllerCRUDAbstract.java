package biz.r2s.util.Controller;

import java.lang.reflect.ParameterizedType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import biz.r2s.util.CommonsUtil;
import biz.r2s.util.Service.ServiceCRUD;

public abstract class ControllerCRUDAbstract<T> implements ControllerCRUD<T> {
	
	private Class<T> classe;
	
	protected ServiceCRUD<T> serviceCRUD;
	protected String path;
	
	@SuppressWarnings("unchecked")
	public ControllerCRUDAbstract(){
		this.classe = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

	
	@Override
	@RequestMapping(value="")
	public String index(ModelMap modelMap) {
		List<T> objList = serviceCRUD.listar();
		modelMap.addAttribute("list"+classe.getSimpleName(),objList);
		return path+"/list";
	}
	
	@Override
	@RequestMapping(value="/")
	public String indexB(ModelMap modelMap) {
		List<T> objList = serviceCRUD.listar();
		modelMap.addAttribute("list"+classe.getSimpleName(),objList);
		return path+"/list";
	}
	
	@SuppressWarnings("unchecked")
	@Override
	@RequestMapping("/new")
	public String getFormNew(ModelMap modelMap) {
		T obj = (T) CommonsUtil.newObjeto(classe);
		modelMap.addAttribute(classe.getSimpleName().toLowerCase(),obj);		
		return "form"+classe.getSimpleName();
	}

	@Override
	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public String getFormEdit(T obj, ModelMap modelMap) {
		T objReturn = serviceCRUD.consultar(obj);
		modelMap.addAttribute(classe.getSimpleName().toLowerCase(),objReturn);
		return "form"+classe.getSimpleName();
	}

	@Override
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(ModelMap modelMap) {
		List<T> objList = serviceCRUD.listar();
		modelMap.addAttribute("list"+classe.getSimpleName(),objList);
		return "list"+classe.getSimpleName();
	}

	@Override
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(T obj, BindingResult result, SessionStatus status, ModelMap modelMap) {
		
		T objeto = null;
		
		if(CommonsUtil.getIdByObjeto(obj)==null){
			objeto = serviceCRUD.inserir(obj);
		}
		else{
			objeto = serviceCRUD.alterar(obj);
		}
		
		if(objeto==null){
			
			modelMap.addAttribute(classe.getSimpleName(),obj);
			modelMap.addAttribute("error", "Erro ao salvar objeto");
			return "form"+classe.getSimpleName();
		}
		return "redirect:list";
	}

	@Override
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete(T obj, BindingResult result, SessionStatus status, ModelMap modelMap) {

		serviceCRUD.excluir(obj);
		return "redirect:list";
	}

	@Override
	@RequestMapping(value="/find", method=RequestMethod.GET)
	public String find(T obj, ModelMap modelMap) {
		T objReturn = serviceCRUD.consultar(obj);
		modelMap.addAttribute(classe.getSimpleName(),objReturn);
		return "find"+classe.getSimpleName();
	}
	
	
	/*public T mergeObject(T obj1, T obj2 ){
		
	}*/
	
}
