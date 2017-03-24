package view;

import java.util.Scanner;

public class MenuExposicao {
	public MenuExposicao(){
		int escolha;
		Scanner s = new Scanner(System.in);
		
		OperacoesExposicao opExp = new OperacoesExposicao();
		
		do{	
			System.out.println("\n\n\n\t\t\t\t\t---------------Menu Exposicao--------------");
			System.out.println("1 - Criar Exposicao");
			System.out.println("2 - Listar Exposicoes");
			System.out.println("3 - Listar Exposicoes e as suas Obras");
			System.out.println("4 - Procurar Exposicao");
			System.out.println("5 - Apagar Exposicao");
			System.out.println("6 - Remover Obra de uma Exposicao");
			System.out.println("7 - Exposicao mais lucrativa");
			System.out.println("99 - Menu Principal");
			escolha = s.nextInt();
			s.nextLine();
			
			switch(escolha){
				case 1:
					opExp.inserirExposicao();
					System.out.println("\n\nExposicao criada com sucesso!");
					break;
				
				case 2:
					opExp.listarExposicao();
					break;
					
				case 3:
					opExp.listarExposicaoComObras();
					break;
					
				case 4:
					opExp.procurarExposicao();
					break;
					
				case 5:
					opExp.apagarExposicao();
					break;
					
				case 6:
					opExp.apagarObraExposicao();
					break;
				
				case 7:
					opExp.exposicaoMaisLucrativa();
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
