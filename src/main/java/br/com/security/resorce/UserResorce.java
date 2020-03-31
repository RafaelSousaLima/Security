package br.com.security.resorce;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import br.com.security.model.user.User;

@Path("/user")
public class UserResorce {

	@GET
	public List<User> findUsers() {
		return Arrays.asList(new User());
	}
	
}
