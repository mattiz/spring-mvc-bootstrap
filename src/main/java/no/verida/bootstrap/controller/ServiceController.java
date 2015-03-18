package no.verida.bootstrap.controller;


import no.verida.bootstrap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author Mathias Bjerke
 */
@Controller
public class ServiceController {

	@Autowired
	private UserService userService;


	@RequestMapping( value = "/", method = RequestMethod.GET )
	public String index( ModelMap model ) {
		model.addAttribute( "user", userService.getUser() );

		return "index";
	}
}