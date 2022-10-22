/**
 * 
 */
package br.com.carvalho.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.carvalho.main.AppList;
import br.com.carvalho.main.User;
import br.com.carvalho.main.UserService;



/**
 * @author manoel.carvalho
 *
 */
public class UsersTests {
	
	@Test
	public void returnUsersNull() {
		
		ArrayList<User> usuariosEsperados = new ArrayList<User>();
		
		UserService service = new UserService();

		
		ArrayList<User> usuariosVindosDoService = service.getUsers();
		
		
		Assert.assertEquals(usuariosEsperados, usuariosVindosDoService);
	}
	

	
	@Test
	public void testUser() {
			
			
		
		ArrayList<String> nomesF = new ArrayList<String>();
		nomesF.add("Maria");
		nomesF.add("Daniele");
		nomesF.add("Edna");
		
		User user = new User(nomesF);
			
			ArrayList<String>  expectedName = user.getName();
			//String genre = user.getGenre();
			
			
			String[] name = {"Maria","Daniele","Edna"};
			List<String> nameList = new ArrayList<String>(Arrays.asList(name));
			
			Assert.assertEquals(nameList, expectedName);
			
			
		}
	
	public void aappTest() {
		AppList app = new AppList();
	
	}


}
