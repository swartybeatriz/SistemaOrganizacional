package SisOrg.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import SisOrg.daos.UsuarioDAO;
import SisOrg.models.Usuario;

@Controller
public class LoginController {

	@RequestMapping("loginForm")
	public String loginForm() {
		return "usuarios/loginForm";
	}

	@RequestMapping("efetuaLogin")
	public String efetuaLogin(Usuario usuario, HttpSession session) {
		System.out.println(usuario);
		if (new UsuarioDAO().checkLogin(usuario)) {
			session.setAttribute("usuarioLogado", usuario);
			System.out.println(">>> Autenticado");
			return "sistema/home";
		}
		System.out.println(">>> Não Autenticado");
		return "redirect:loginForm";
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session) {
	session.invalidate();
	return "redirect:loginForm";
	}
	
	
}
