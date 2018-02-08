package SisOrg.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import SisOrg.daos.UsuarioDAO;
import SisOrg.models.Usuario;

@Controller
public class UsuariosController {
	
	@RequestMapping ("sistema/index")
	public String index() {
		
		return "sistema/index";
	}

	@RequestMapping ("usuarios/form-cadastro")
	public String form(){
		System.out.println("Acessando um formulário de contatos");
		
		return "usuarios/form-cadastro";
	}
	
	 @RequestMapping (value= "usuarios", method=RequestMethod.POST)
		
	 public String gravar (Usuario u) {
		
		UsuarioDAO dao = new UsuarioDAO ();
		dao.inserir(u);
		
		return "sistema/home";
		
	}
	 @RequestMapping (value= "usuarioss", method=RequestMethod.GET)
		public ModelAndView listar () {
			UsuarioDAO dao = new UsuarioDAO ();
			List<Usuario> contatos = dao.getLista();
			
			ModelAndView modelAndView = new ModelAndView ("contatos/listar");
			modelAndView.addObject ("contatos", contatos);
			
			return modelAndView;
		}
	 @RequestMapping ( value = "removerusuarios")
		
		public ModelAndView remover (Usuario u) {

			
			UsuarioDAO dao = new UsuarioDAO();
			
			dao.remover(u);
			
			System.out.println("Excluindo contato... ");
			return listar();	
		}
		
		
		@RequestMapping ( value = "contatos/selecionarContatos")
		
		public ModelAndView SelecionarUsuarios (Long id) {
			
			
			UsuarioDAO dao = new UsuarioDAO() ;
			Usuario u = dao.getById(id);
			
			ModelAndView modelAndView = new ModelAndView ("usuarios/form2");
			modelAndView.addObject ("usuario", u);

			
			return modelAndView;
			
		}
		
		@RequestMapping ( value = "usuarios/alterar")
		
		public ModelAndView alterarcontatos ( Usuario u ){
			
			
			UsuarioDAO dao = new UsuarioDAO();
			dao.alterar(u);
			return listar() ;
			
		}
		
		
		public ModelAndView validarLogin (Usuario u) {
			
			UsuarioDAO dao = new UsuarioDAO();
			
			dao.checkLogin(u);
			
			if ( ) {
				
				return " sistema/home" ;
			}
			
			
			return null;
			
			
			
		}
		
		
	
}
