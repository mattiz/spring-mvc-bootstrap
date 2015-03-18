package no.verida.bootstrap.service;


import no.verida.bootstrap.domain.User;
import org.springframework.stereotype.Component;


/**
 * @author Mathias Bjerke
 */
@Component
public class UserService {
	public User getUser() {
		return new User( "Folco" );
	}
}
