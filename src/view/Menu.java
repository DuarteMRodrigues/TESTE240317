package view;

import java.util.Scanner;

import controller.GestorDefault;
import controller.GestorExposicao;
import controller.GestorObra;

public class Menu {
	public Menu(){
		int escolha;
		boolean criarDefaultReturn;
		Scanner s = new Scanner(System.in);
		
		GestorObra go = new GestorObra();
		GestorExposicao ge = new GestorExposicao();
		GestorDefault gd = new GestorDefault();
		
		do{
			System.out.println("\n\n\n\t\t\t\t\t---------------Menu Principal--------------");
			System.out.println("1 - Operacoes Obra");
			System.out.println("2 - Operacoes Exposicao");
			System.out.println("3 - Criar Obras e Exposicoes default");
			System.out.println("99 - Sair");
			escolha = s.nextInt();
			s.nextLine();
			
			switch(escolha){
				case 1:
					new MenuObra();
					break;
					
				case 2:
					new MenuExposicao();
					break;
					
				case 3:
					criarDefaultReturn = gd.criarDefault();
					
					if(criarDefaultReturn){
						System.out.println("\n\nObras e Exposicoes Default Criados com sucesso!");
					}
					else
						System.out.println("\n\nJa existem Obras e/ou Exposicoes!");
					
					new Pausa();
					break;
					
				case 99:
					System.out.println("\n\nAdeus");
					
					new Pausa();
					break;
					
				default:
					System.out.println("\n\nEscolha Invalida");
					break;
			}
		}while(escolha != 99);
	}
}
