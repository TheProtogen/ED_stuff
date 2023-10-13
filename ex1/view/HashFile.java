package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Só fiz isso por preguiça de ficar digitando nome por nome, mas enfim, tá aí

public class HashFile {

	public static void main(String[] args) throws Exception {
		char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		
		HashMap<Character, List<String>> hashMap = new HashMap<Character, List<String>>();
		
		//No arquivo, coloque os nomes
		File file = new File("C:\\Users\\vmest\\eclipse-workspace\\ED_stuff\\ex1\\Nomes");
		BufferedReader br = new BufferedReader(new FileReader(file));

		
		for (int i = 0; i < alphabet.length; i++) {
			hashMap.put(alphabet[i], new ArrayList<String>());
		}
		
		String st;
        while ((st = br.readLine()) != null) {
            //System.out.println(st);
            for(int j = 0; j < alphabet.length; j++) {
				if (st.charAt(0) == alphabet[j]) {
					//coloca na lista
					hashMap.get(alphabet[j]).add(st);
					break;
				}
			}
    	}
		
		
		
		
		
		
		
		
		
		//nomes aqui
		System.out.println(hashMap);
	}

}