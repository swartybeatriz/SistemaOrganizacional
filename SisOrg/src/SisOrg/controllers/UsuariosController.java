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
	

	@RequestMapping ("usuarios/form-cadastro")
	public String form(){
		System.out.println("Acessando um formulário de usuarios");
		
		return "usuarios/form-cadastro";
	}
	
	 @RequestMapping (value= "usuarios", method=RequestMethod.POST)
		
	 public String gravar (Usuario u) {
		
		UsuarioDAO dao = new UsuarioDAO ();
		dao.inserir(u);
		
		return "redirect:loginForm";
		
	}
	 @RequestMapping (value= "usuarios", method=RequestMethod.GET)
		public ModelAndView listar () {
			UsuarioDAO dao = new UsuarioDAO ();
			List<Usuario> usuarios = dao.getLista();
			
			ModelAndView modelAndView = new ModelAndView ("usuarios/listar");
			modelAndView.addObject ("usuarios", usuarios);
			
			return modelAndView;
		}
	 @RequestMapping ( value = "removerusuarios")
		
		public ModelAndView remover (Usuario u) {

			
			UsuarioDAO dao = new UsuarioDAO();
			
			dao.remover(u);
			
			System.out.println("Excluindo usuario... ");
			return new ModelAndView("redirect:usuarios");
		}
		
		
		@RequestMapping ( value = "usuarios/selecionar")
		
		public ModelAndView SelecionarUsuarios (Long id) {
			
			
			UsuarioDAO dao = new UsuarioDAO() ;
			Usuario u = dao.getById(id);
			
			ModelAndView modelAndView = new ModelAndView ("usuarios/form-alterar");
			modelAndView.addObject ("usuario", u);

			
			return modelAndView;
			
		}
		
		@RequestMapping ( value = "usuarios/alterar")
		
		public ModelAndView alterar ( Usuario u ){
			
			
			UsuarioDAO dao = new UsuarioDAO();
			dao.alterar(u);
			return listar() ;
			
		}
		
		
		public ModelAndView validarLogin (Usuario u) {
			
		UsuarioDAO dao = new UsuarioDAO();
			
			dao.checkLogin(u);
			
//			if ( ) {
//				
//				return "sistema/home" ;
//			}
			
			
			return null;
			
			
			
		}
		
		
	
}
