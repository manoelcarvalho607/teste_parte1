/**
 * 
 */
package br.com.carvalho.main;

import java.util.ArrayList;

/**
 * @author manoel.carvalho
 *
 */
public class User {
	
	private ArrayList<String> name;
	private String genre;
	
	/**
	public User(String name, String genre) {	
		this.name = name;
		this.genre = genre;
	}
	
	**/
	public User() {	
		
		
	}
	
	public User(ArrayList<String> strList) {	
		this.name = strList;
		
	}

	public ArrayList<String> getName() {
		
		return name;
	}

	public String getGenre() {
		
		return genre;
	}

}
