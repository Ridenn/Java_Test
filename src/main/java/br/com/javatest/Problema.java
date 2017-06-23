package br.com.javatest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problema {

	public static String chamaAcao(String comando){
		String comandoFinal = "";
		String oldCommand = comando;
		int x = 0, y = 0, z = 0;
		int aux = 0;
		
		Map<Integer, String> direcao = new HashMap<Integer, String>();
		direcao.put(0, "NORTE");
		direcao.put(1, "LESTE");
		direcao.put(2, "SUL");
		direcao.put(3, "OESTE");
		
		while(oldCommand.length() != 0){
			comando = oldCommand.substring(0, 1).toUpperCase();
			oldCommand = oldCommand.substring(1, oldCommand.length());
			
			switch (comando) {
			case "L":
				aux--;
				if(aux < 0)
					aux = 3;
				break;
			case "R":
				aux++;
				if(aux > 3)
					aux = 0;
				break;
			case "M":
				if(aux % 2 == 0){
					if(aux == 0)
						y++;
					y--;
				}else{
					if(aux == 1)
						x++;
					x--;
				}
				break;
			case "U":
				
				break;
			case "D":
				
				break;
			default:
				break;
			}
			
			executaAcao(comando);
		}
		
		return comandoFinal;
	}
	
	
	private static void executaAcao(String comando) {
		
	}


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String commands = input.next();
		input.close();
		
		chamaAcao(commands);
	}

}