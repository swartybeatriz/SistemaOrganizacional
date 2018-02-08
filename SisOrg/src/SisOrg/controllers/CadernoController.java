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

	@RequestMapping ("usuarios/form")
	public String form2(){
		System.out.println("Acessando um formulário de cadernos");
		
		return "usuarios/form";
	}
	
	@RequestMapping (value= "cadernos", method=RequestMethod.POST)
	
	 public String gravar (Cadernos c) {
		
		CadernosDAO dao = new CadernosDAO ();
		dao.inserir(c);
		
		return "sistema/home";
		
	}
	
	
}
