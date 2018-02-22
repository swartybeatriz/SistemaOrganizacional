package SisOrg.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import SisOrg.daos.CadernosDAO;

import SisOrg.models.Caderno;



@Controller 
public class CadernoController {
	


	@RequestMapping ("cadernos/form")
	public String formCaderno(){
		System.out.println("Acessando um formulário de cadernos");
		
		return "cadernos/form-cadastro";
	}
	
	 @RequestMapping (value= "cadernos", method=RequestMethod.POST)
		
	 public String gravar (Caderno c) {
		
		CadernosDAO dao = new CadernosDAO ();
		dao.inserir(c);
		
		return "sistema/home";
		
	}
	 @RequestMapping (value= "cadernos", method=RequestMethod.GET)
		public ModelAndView listar () {
			CadernosDAO dao = new CadernosDAO();
			List<Caderno> cadernos = dao.getLista();
			
			ModelAndView modelAndView = new ModelAndView ("cadernos/listar");
			modelAndView.addObject ("cadernos", cadernos);
			
			return modelAndView;
		}
	 @RequestMapping ( value = "removercadernos")
		
		public ModelAndView remover (Caderno c) {

			
			CadernosDAO dao = new CadernosDAO();
			
			dao.remover(c);
			
			System.out.println("Excluindo caderno... ");
			return listar();	
		}
		
		
		@RequestMapping ( value = "cadernos/selecionarContatos")
		
		public ModelAndView CadernoUsuarios (Long id) {
			
			
			CadernosDAO dao = new CadernosDAO() ;
			Caderno c = dao.getById(id);
			
			ModelAndView modelAndView = new ModelAndView ("cadernos/form2");
			modelAndView.addObject ("caderno", c);

			
			return modelAndView;
			
		}
		
		@RequestMapping ( value = "cadernos/alterar")
		
		public ModelAndView alterarcadernos ( Caderno c ){
			
			
			CadernosDAO dao = new CadernosDAO();
			dao.alterar(c);
			return listar() ;
			
		}
		
}
