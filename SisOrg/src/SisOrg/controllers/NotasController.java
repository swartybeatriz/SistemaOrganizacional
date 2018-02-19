package SisOrg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import SisOrg.daos.NotasDAO;
import SisOrg.models.Notas;

@Controller
public class NotasController {

	@RequestMapping ("notas/form-cadastro")
	public String form(){
		System.out.println("Acessando um formulário de notas");
		
		return "notas/form-cadastro";
	}
	
	 @RequestMapping (value= "notas", method=RequestMethod.POST)
		
	 public String gravar ( Notas n) {
		
		NotasDAO dao = new NotasDAO();
		dao.inserir(n);
		
		return "sistema/home";
		
	}
	 
	
	 
}
