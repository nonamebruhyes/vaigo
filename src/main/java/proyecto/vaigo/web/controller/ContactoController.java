package proyecto.vaigo.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ContactoController {

	@GetMapping("/contacto")
	public ModelAndView mostrarExplorar(){
		ModelAndView mav = new ModelAndView("./paginashtml/contactos.html");
		return mav;
	}

}