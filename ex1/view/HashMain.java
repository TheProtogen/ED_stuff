
package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

public class HashMain {

	public static void main(String[] args) {
		char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		
		HashMap<Character, List<String>> hashMap = new HashMap<Character, List<String>>();
		
		
		for (int i = 0; i < alphabet.length; i++) {
			hashMap.put(alphabet[i], new ArrayList<String>());
		}
		
		//Só definir quantos nomes vão ser colocados
		String[] nome = new String[26];
		
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
		
		
		
		
		
		
		//nomes aqui
		System.out.println(hashMap);
	}

}
