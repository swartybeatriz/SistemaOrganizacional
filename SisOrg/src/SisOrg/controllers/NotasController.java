package SisOrg.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import SisOrg.daos.NotaDAO;
import SisOrg.models.Caderno;
import SisOrg.models.Nota;


@Controller
public class NotasController {

	@RequestMapping ("notas/form-cadastro")
	public ModelAndView  form(Caderno cadernos){
		System.out.println("Acessando um formulário de notas");
	
		
		ModelAndView modelAndView = new ModelAndView ("notas/form-cadastro");
		modelAndView.addObject ("cadernos", cadernos);
		
		return modelAndView;
		
	}
	
	 @RequestMapping (value= "notas", method=RequestMethod.POST)
		
	 public String gravar ( Nota n) {
		
		NotaDAO dao = new NotaDAO();
		dao.inserir(n);
		
		return "sistema/home";
		
	}
	 
	
	 
}
