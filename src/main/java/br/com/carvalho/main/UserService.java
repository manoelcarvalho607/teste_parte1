/**
 * 
 */
package br.com.carvalho.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



/**
 * @author manoel.carvalho
 *
 */
public class UserService {
	
private ArrayList<User> users = new ArrayList<User>();
	
	
	public  ArrayList<User>  getUsers() {
		
		
		return users;
	}
	
	
	
	public void updateName() {
		Scanner s = new Scanner(System.in);

	
		
		System.out.println("----- Lista de nomes  ------");
		System.out.println("");
		System.out.println("Digite abaixo nome femininos separados por virgula (,):");
		System.out.println("");
		
		String nameList = s.next();
		
		
		
		String[] nomes = nameList.split(",");
		
		
		
		ArrayList<String> strList = new ArrayList<String>(Arrays.asList(nomes));
		
		UserService service = new UserService();

		User user2 = new User(strList);
		users.add(user2);
		
		ArrayList<String> namesF = user2.getName();
		
		
		
		for(String n: namesF) {
			System.out.println("nomes femininos: " + n);
		}
		
		
	}

}
