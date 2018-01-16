package com.webservicedemo;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/UserService")
public class UserService {
UserDao userDao = new UserDao();
@GET
@Path("/users")

//@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Produces(MediaType.APPLICATION_JSON)
//@Produces(MediaType.APPLICATION_XML)
public List<User> getUsers(){
	System.out.println("2");
return userDao.getAllUsers();
}

}
