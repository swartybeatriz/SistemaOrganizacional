package SisOrg.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import SisOrg.daos.CadernosDAO;
import SisOrg.daos.UsuarioDAO;
import SisOrg.models.Cadernos;
import SisOrg.models.Usuario;



public class CadernoController {
	
	@RequestMapping ("sistema/index")
	public String index() {
		
		return "sistema/index";
	}

	@RequestMapping ("Cadernos/form-cadastro")
	public String formCaderno(){
		System.out.println("Acessando um formulário de cadernos");
		
		return "Cadernos/form-cadastro";
	}
	
	 @RequestMapping (value= "cadernos", method=RequestMethod.POST)
		
	 public String gravar (Cadernos c) {
		
		CadernosDAO dao = new CadernosDAO ();
		dao.inserir(c);
		
		return "sistema/home";
		
	}
	 @RequestMapping (value= "usuarios", method=RequestMethod.GET)
		public ModelAndView listar () {
			UsuarioDAO dao = new UsuarioDAO ();
			List<Usuario> cadernos = dao.getLista();
			
			ModelAndView modelAndView = new ModelAndView ("cadernos/listar");
			modelAndView.addObject ("cadernos", cadernos);
			
			return modelAndView;
		}
	 @RequestMapping ( value = "removerusuarios")
		
		public ModelAndView remover (Usuario u) {

			
			UsuarioDAO dao = new UsuarioDAO();
			
			dao.remover(u);
			
			System.out.println("Excluindo caderno... ");
			return listar();	
		}
		
		
		@RequestMapping ( value = "cadernos/selecionarContatos")
		
		public ModelAndView CadernoUsuarios (Long id) {
			
			
			CadernosDAO dao = new CadernosDAO() ;
			Cadernos c = dao.getById(id);
			
			ModelAndView modelAndView = new ModelAndView ("cadernos/form2");
			modelAndView.addObject ("caderno", c);

			
			return modelAndView;
			
		}
		
		@RequestMapping ( value = "cadernos/alterar")
		
		public ModelAndView alterarcadernos ( Cadernos c ){
			
			
			CadernosDAO dao = new CadernosDAO();
			dao.alterar(c);
			return listar() ;
			
		}
		
}
