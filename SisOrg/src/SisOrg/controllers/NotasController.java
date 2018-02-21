package SisOrg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import SisOrg.daos.NotaDAO;
import SisOrg.models.Nota;

@Controller
public class NotasController {

	@RequestMapping ("notas/form-cadastro")
	public String form(){
		System.out.println("Acessando um formulário de notas");
		
		return "notas/form-cadastro";
	}
	
	 @RequestMapping (value= "notas", method=RequestMethod.POST)
		
	 public String gravar ( Nota n) {
		
		NotaDAO dao = new NotaDAO();
		dao.inserir(n);
		
		return "sistema/home";
		
	}
	 
	
	 
}
