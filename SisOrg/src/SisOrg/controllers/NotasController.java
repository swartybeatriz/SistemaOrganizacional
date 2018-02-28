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

		return "sistema/home";

	}

}
