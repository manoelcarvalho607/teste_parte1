package br.com.carvalho.test;

import org.junit.Test;

import br.com.carvalho.main.ListNames;



/**
 * @author manoel.carvalho
 * 
 * Nessa classe realizo o teste do método: generoLista, da classe ListPeople.
 * 
 * Objetivo do teste:
 * 
 * O método generoLista recebe como parametro o número 2 do tipo Integer, que por meio de uma estrutura de condicional 
 * if/else define o tipo de genero a lista vai ter (feminino). 
 * Em seguida após solicitar os nomes do usuário armazena numa lista (String[]) e  após converter para uma list é feito forEach aplicando a api
 * de stream, para retornar no console uma lista ordenada em ordem alfabética (usando arrays.sort) os nomes femininos.  
 *
 */

public class ListNamesTest {
	
	
	@Test
	public void testList() {
		
		ListNames list = new ListNames();
		list.NomePessoas();
		
	
		
	}
	
	

}
