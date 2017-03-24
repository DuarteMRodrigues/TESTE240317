package view;

import java.util.Scanner;

public class MenuObra {
	public MenuObra(){
		int escolha;
		Scanner s = new Scanner(System.in);
		
		OperacoesObra opObra = new OperacoesObra();
		
		do{	
			System.out.println("\n\n\n\t\t\t\t\t---------------Menu Obras--------------");
			System.out.println("1 - Inserir Obra");
			System.out.println("2 - Listar Obras");
			System.out.println("3 - Procurar Obra");
			System.out.println("4 - Apagar Obra");
			System.out.println("99 - Menu Principal");
			escolha = s.nextInt();
			s.nextLine();
			
			switch(escolha){
				case 1: 
					opObra.inserirObra();
					System.out.println("\n\nObra Inserida com sucesso!");
					break;
				
				case 2:
					opObra.listarObra();
					break;
					
				case 3:
					opObra.procurarObra();
					break;
					
				case 4:
					opObra.apagarObra();
					break;
				
				case 99:
					
					break;
					
				default:
					System.out.println("\n\nEscolha Invalida");
					break;
			}
			
			new Pausa();
		}while(escolha != 99);
	}
}