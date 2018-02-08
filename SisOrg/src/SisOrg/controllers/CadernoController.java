package SisOrg.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import SisOrg.daos.CadernosDAO;
import SisOrg.models.Cadernos;


public class CadernoController {
	@RequestMapping ("sistema/index")
	public String index() {
		
		return "sistema/index";
	}

	@RequestMapping ("cadernos/form-caderno")
	public String form(){
		System.out.println("Acessando um formulário de cadernos");
		
		return "cadernos/form-caderno";
	}
	
	@RequestMapping (value= "cadernos", method=RequestMethod.POST)
	
	 public String gravar (Cadernos c) {
		
		CadernosDAO dao = new CadernosDAO ();
		dao.inserir(c);
		
		return "sistema/home";
		
	}
	
	
}
