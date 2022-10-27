/**
 * 
 */
package br.com.carvalho.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



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
		System.out.println("Digite abaixo nomes masculinos e femininos separados por virgula (,):");
		System.out.println("Obs: Identifique o sexo do nome: masculino com a letra M- maiscúlo mas o nome, ex: (M-xxxxxxx),");
		System.out.println("     nomes feminínos com a letra F- maiscúlo, ex: (F-xxxxxxx):");
		System.out.println("");
		String nameList = s.next();
		
		
		
		String[] nomes = nameList.split(",");
		
		
		
		ArrayList<String> strList = new ArrayList<String>(Arrays.asList(nomes));
		
	

		User user2 = new User(strList);
		users.add(user2);
		
		List<String> resultName = strList.stream()
			.filter(name -> name.startsWith("F"))
			.collect(Collectors.toList());
		
		resultName.forEach(element -> System.out.println("nome feminíno: " + element));
		
		
	}

}
