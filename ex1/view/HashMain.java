
package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

public class HashMain {

	public static void main(String[] args) {
		//Cria o hashmap onde vai ir os nomes, junto com a letra na ordem
		HashMap<Character, List<String>> hashMap = new HashMap<Character, List<String>>();
		
		char[] alphabet = makeAlphabet();
		for (int i = 0; i < alphabet.length; i++) {
			hashMap.put(alphabet[i], new ArrayList<String>());
		}
		
		makeHash(hashMap,alphabet);
		
		//nomes aqui
		System.out.println(hashMap);
	}
	
	//Faz o hashmap com as informações que o user vai dando
	public static void makeHash(HashMap<Character, List<String>> hashMap, char[] alphabet) {
		String[] nome = new String[4];
		
		for(int i = 0; i < nome.length; i++) {
			//pega o nome
			nome[i] = JOptionPane.showInputDialog(null,"Insira o nome aqui");
			
			//verifica a primeira letra e tals
			for(int j = 0; j < alphabet.length; j++) {
				if (nome[i].charAt(0) == alphabet[j]) {
					//coloca na lista
					hashMap.get(alphabet[j]).add(nome[i]);
					break;
				}
			}
			
		}
	}
	
	//É só o alfabeto
	public static char[] makeAlphabet() {
		char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		return alphabet;
	}
	

}
