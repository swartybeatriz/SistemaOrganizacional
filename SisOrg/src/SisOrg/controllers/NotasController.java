package SisOrg.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import SisOrg.daos.UsuarioDAO;
import SisOrg.models.Usuario;

public class NotasController {

	@RequestMapping ("sistema/index")
	public String index() {
		
		return "sistema/index";
	}

	@RequestMapping ("notas/form-cadastro")
	public String form(){
		System.out.println("Acessando um formulário de contatos");
		
		return "notas/form-cadastro";
	}
	
	 @RequestMapping (value= "notas", method=RequestMethod.POST)
		
	 public String gravar (Usuario u) {
		
		UsuarioDAO dao = new UsuarioDAO ();
		dao.inserir(u);
		
		return "sistema/home";
		
	}
}
