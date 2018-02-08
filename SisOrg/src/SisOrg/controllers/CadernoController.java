package SisOrg.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import SisOrg.daos.CadernosDAO;
import SisOrg.daos.UsuarioDAO;
import SisOrg.models.Cadernos;
import SisOrg.models.Usuario;


public class CadernoController {
	
	@RequestMapping ("sistema/index")
	public String index() {
		
		return "sistema/index";
	}

	@RequestMapping ("cadernos/form-cadastro")
	public String form(){
		System.out.println("Acessando um formulário de contatos");
		
		return "cadernos/form-cadastro";
	}
	
	 @RequestMapping (value= "usuarios", method=RequestMethod.POST)
		
	 public String gravar (Usuario u) {
		
		UsuarioDAO dao = new UsuarioDAO ();
		dao.inserir(u);
		
		return "sistema/home";
		
	}
}
