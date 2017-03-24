package view;

import java.util.Scanner;

public class Pausa {
	public Pausa(){
		Scanner s = new Scanner(System.in);
		System.out.print("\n\nPressione a tecla [ENTER] para continuar...");
		s.nextLine();
	}
	
	public static boolean PausaLista(){
		String cont;
		boolean continuar;
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n\nInsira 0 para parar a listagem e qualquer valor para continuar...");
		cont = s.nextLine();
		
		if(cont == "0")
			continuar = false;
		else
			continuar = true;
		
		return continuar;
	}
}
