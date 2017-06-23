package br.com.javatest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problema {

	public static String chamaAcao(String comando){
		String comandoFinal = "";
		String oldCommand = comando;
		int x, y, z = 0;
		int aux = 0;
		
		while(oldCommand.length() != 0){
			comando = oldCommand.substring(0, 1).toUpperCase();
			oldCommand = oldCommand.substring(1, oldCommand.length());
			
			switch (comando) {
			case "L":
				
				break;
			case "R":
				
				break;
			case "M":
				
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