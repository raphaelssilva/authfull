package biz.r2s.util.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.support.SessionStatus;

public interface ControllerCRUD<T> {
	
	public String index(ModelMap modelMap);
	public String indexB(ModelMap modelMap);
	public String getFormNew(ModelMap modelMap);
	public String getFormEdit(@ModelAttribute T obj, ModelMap modelMap);
	public String list(ModelMap modelMap);
	public String save(@ModelAttribute T obj, BindingResult result, SessionStatus status, ModelMap modelMap);
	public String delete(@ModelAttribute T obj, BindingResult result, SessionStatus status, ModelMap modelMap);
	public String find(@ModelAttribute T obj, ModelMap modelMap);
	
	
}
