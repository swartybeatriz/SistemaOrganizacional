package SisOrg.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import SisOrg.daos.CadernosDAO;
import SisOrg.daos.NotaDAO;

import SisOrg.models.Caderno;
import SisOrg.models.Nota;


@Controller
public class NotasController {

	@RequestMapping("notas/form-cadastro")
	public ModelAndView form() {
		System.out.println("Acessando um formulário de notas");

		CadernosDAO cadernosDAO = new CadernosDAO();

		List<Caderno> cadernos = cadernosDAO.getLista();

		System.out.println("QTD Cadernos: " + cadernos.size());

		ModelAndView modelAndView = new ModelAndView("notas/form-cadastro");
		modelAndView.addObject("cadernos", cadernos);

		return modelAndView;

	}
	
	
	@RequestMapping(value = "notas", method = RequestMethod.POST)

	public String gravar(Nota n) {

		NotaDAO dao = new NotaDAO();
		dao.inserir(n);

		return "redirect:notas";

	}
	
	@RequestMapping ( "/listar")
	public ModelAndView listar (Caderno caderno) {
		CadernosDAO dao = new CadernosDAO();
		caderno = dao.getById(caderno.getId());
		
		
		NotaDAO Notasdao = new NotaDAO ();
		List <Nota> notas = Notasdao.getLista(caderno);  
		
		System.out.println(notas.size());
		System.out.println("entrando");
		
		ModelAndView modelAndView = new ModelAndView( "notas/listar");
		modelAndView.addObject ( "notas", notas);
		modelAndView.addObject ( "caderno", caderno);
		return modelAndView; 
		
	}
	
	 @RequestMapping (value= "notas", method=RequestMethod.GET)
		public ModelAndView listarNotas () {
			NotaDAO dao = new NotaDAO();
			List<Nota> notas = dao.getListaa();
			
			ModelAndView modelAndView = new ModelAndView ("notas/listar");
			modelAndView.addObject ("notas", notas);
			
			return modelAndView;
		}
	
	 @RequestMapping ( value = "removernotas")
		
		public ModelAndView remover (Nota n) {

			
			NotaDAO dao = new NotaDAO();
			
			dao.remover(n);
			
			System.out.println("Excluindo Nota... ");
			
			return new ModelAndView("redirect:notas")	;
		}
		
		@RequestMapping ( value = "notas/selecionar")
		
		public ModelAndView Selecionar (Long id) {
			
			
			NotaDAO dao = new NotaDAO() ;
			Nota n = dao.getById(id);
			
			ModelAndView modelAndView = new ModelAndView ("notas/form-alterar");
			modelAndView.addObject ("nota", n);

			
			return modelAndView;
			
		}
@RequestMapping ( value = "notas/alterar", method = RequestMethod.POST )
		
public ModelAndView alterar ( Nota n){
	
	NotaDAO dao = new NotaDAO();
	dao.alterar(n);
	System.out.println("Alterando nota... ");
	return listarNotas() ;
	
}
		
		

}
