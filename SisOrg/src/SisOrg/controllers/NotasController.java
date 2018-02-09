package SisOrg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import SisOrg.daos.UsuarioDAO;
import SisOrg.models.Usuario;
@Controller
public class NotasController {

	@RequestMapping ("sistema/index")
	public String index() {
		
		return "sistema/index";
	}

	@RequestMapping ("notas/form-cadastro")
	public String form(){
		System.out.println("Acessando um formulário de notas");
		
		return "notas/form-cadastro";
	}
	
	 @RequestMapping (value= "notas", method=RequestMethod.POST)
		
	 public String gravar (Usuario u) {
		
		UsuarioDAO dao = new UsuarioDAO ();
		dao.inserir(u);
		
		return "sistema/home";
		
	}
}
