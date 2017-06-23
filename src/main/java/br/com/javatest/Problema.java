package br.com.javatest;

import java.util.Scanner;

public class Problema {

	public static String chamaAcao(String comando){
		String comandoFinal = "";
		String oldCommand = comando;
		
		while(oldCommand.length() != 0){
			comando = oldCommand.substring(0, 1);
			oldCommand = oldCommand.substring(1, oldCommand.length());
			
			executaAcao(comando);
		}
		
		return comandoFinal;
	}
	
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String commands = input.next();
		input.close();
		
		chamaAcao(commands);
	}

}