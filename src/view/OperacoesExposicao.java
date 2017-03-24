package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.GestorExposicao;
import controller.GestorObra;
import model.Exposicao;
import model.Obra;

public class OperacoesExposicao {
	public OperacoesExposicao(){
		
	}
	
	public void inserirExposicao(){
		int qtdVisi, qtdObras;
		int[] idsObra = new int[100];
		double preco;
		String nomeE, dataIni, dataFim;
		Scanner s = new Scanner(System.in);
		
		ArrayList<Obra> obra = new ArrayList<Obra>();
		obra = GestorObra.getObra();
		
		do{
			System.out.println("Insira a quantidade de visitantes da Exposicao: ");
			qtdVisi = s.nextInt();
			s.nextLine();
		}while(qtdVisi <= 0);
		
		do{
			System.out.println("Insira o preco de entrada na Exposicao: ");
			preco = s.nextDouble();
			s.nextLine();
		}while(preco <= 0);
		
		System.out.println("Insira o nome da Exposicao: ");
		nomeE = s.nextLine();
		
		System.out.println("Insira a data de inicio da Exposicao: ");
		dataIni = s.nextLine();
		
		System.out.println("Insira a data de fim da Exposicao: ");
		dataFim = s.nextLine();
		
		do{
			System.out.println("Insira a quantidade de Obras presentes na Exposicao: ");
			qtdObras = s.nextInt();
			s.nextLine();
			
			if(qtdObras > obra.size()){
				System.out.println("Nao existem obras suficientes\n\n");
				qtdObras = 0;
			}
		}while(qtdObras <= 0);
		
		for(int i = 0; i < qtdObras; i++){
			do{
				System.out.println("Insira o id da " + (i+1) + " Obra: ");
				idsObra[i] = s.nextInt();
				s.nextLine();
				
				if(idsObra[i] > obra.size()){
					System.out.println("Esta obra nao existe.\n\n");
					idsObra[i] = -1;
				}
			}while(idsObra[i] < 0);
		}
		
		GestorExposicao.addExposicao(qtdVisi, preco, nomeE, dataIni, dataFim, idsObra, qtdObras);
	}
	
	public void listarExposicao(){
		boolean continuar = false;
		ArrayList<Exposicao> exp = new ArrayList<Exposicao>();
		
		exp = GestorExposicao.getExposicao();
		
		if(exp.size() > 0){
			for(int i = 0; i < exp.size(); i++){
				System.out.print("\n\nNome da Exposicao: " +exp.get(i).getNomeExposicao());
				System.out.print("\nID: " +exp.get(i).getId());
				System.out.print("\nQuantidade de Visitantes: " +exp.get(i).getQtdVisitantes());
				System.out.print("\nPreco de entrada: " +exp.get(i).getPreco());
				System.out.print("\nData de Inicio: " +exp.get(i).getDataInicio());
				System.out.print("\nData de Fim: " +exp.get(i).getDataFim());
				System.out.print("\n\n\nObras presentes na exposicao: ");
			
				if(i != exp.size()-1){
					continuar = Pausa.PausaLista();
					System.out.println("\n\n\n------------Proxima Exposicao------------\n\n");
				}
				
				if(!continuar)
					break;
			}
		}
		else
			System.out.print("\n\nNao existem exposicoes");
	}
	
	public void listarExposicaoComObras(){
		boolean continuar = false;
		ArrayList<Exposicao> exp = new ArrayList<Exposicao>();
		
		exp = GestorExposicao.getExposicao();
		
		if(exp.size() > 0){
			for(int i = 0; i < exp.size(); i++){
				System.out.print("\n\nNome da Exposicao: " +exp.get(i).getNomeExposicao());
				System.out.print("\nID: " +exp.get(i).getId());
				System.out.print("\nQuantidade de Visitantes: " +exp.get(i).getQtdVisitantes());
				System.out.print("\nPreco de entrada: " +exp.get(i).getPreco());
				System.out.print("\nData de Inicio: " +exp.get(i).getDataInicio());
				System.out.print("\nData de Fim: " +exp.get(i).getDataFim());
				System.out.print("\n\n\nObras presentes na exposicao: ");
				
				for(int j = 0; j < exp.get(i).getObra().size(); j++){
					System.out.print("\n\n\nTitulo da Obra: " +exp.get(i).getObra().get(j).getTituloObra());
					System.out.print("\nNome do Artista: " +exp.get(i).getObra().get(j).getNomeArtista());
					System.out.print("\nCategoria: " +exp.get(i).getObra().get(j).getCategoria());
					System.out.print("\nTipo da Obra: " +exp.get(i).getObra().get(j).getTipoObra());
					System.out.print("\nDate de criacao: " +exp.get(i).getObra().get(j).getDataFeito());
				}
				
				if(i != exp.size()-1){
					continuar = Pausa.PausaLista();
					System.out.println("\n\n\n------------Proxima Exposicao------------\n\n");
				}
				
				if(!continuar)
					break;
			}
		}
		else
			System.out.print("\n\nNao existem exposicoes");
	}
	
	public void procurarExposicao(){
		int id;
		Scanner s = new Scanner(System.in);
		ArrayList<Exposicao> exp = new ArrayList<Exposicao>();
		
		exp = GestorExposicao.getExposicao();
		
		if(exp.size() > 0){
			System.out.print("\n\nInsira o id da Exposicao: ");
			id = s.nextInt();
			s.nextLine();
		
			System.out.print("\n\nNome da Exposicao: " +exp.get(id).getNomeExposicao());
			System.out.print("\nID: " +exp.get(id).getId());
			System.out.print("\nQuantidade de Visitantes: " +exp.get(id).getQtdVisitantes());
			System.out.print("\nPreco de entrada: " +exp.get(id).getPreco());
			System.out.print("\nData de Inicio: " +exp.get(id).getDataInicio());
			System.out.print("\nData de Fim: " +exp.get(id).getDataFim());
			System.out.print("\n\n\nObras presentes na exposicao: ");
			
			for(int i = 0; i < exp.get(id).getObra().size(); i++){
				System.out.print("\n\n\nTitulo da Obra: " +exp.get(id).getObra().get(i).getTituloObra());
				System.out.print("\nNome do Artista: " +exp.get(id).getObra().get(i).getNomeArtista());
				System.out.print("\nCategoria: " +exp.get(id).getObra().get(i).getCategoria());
				System.out.print("\nTipo da Obra: " +exp.get(id).getObra().get(i).getTipoObra());
				System.out.print("\nDate de criacao: " +exp.get(id).getObra().get(i).getDataFeito());
			}
		}
		else
			System.out.print("\n\nNao existem exposicoes");
	}
	
	public void apagarExposicao(){
		int id;
		Scanner s = new Scanner(System.in);
		ArrayList<Exposicao> exp = new ArrayList<Exposicao>();
		
		exp = GestorExposicao.getExposicao();
		
		if(exp.size() > 0){
			System.out.print("\n\nInsira o id da Exposicao: ");
			id = s.nextInt();
			s.nextLine();
			
			GestorExposicao.apagarExposicao(id);
			
			System.out.println("\n\nExposicao Apagada com sucesso!");
		}
		else
			System.out.print("\n\nNao Exposicoes");
	}
	
	public void apagarObraExposicao(){
		int idExp, idObra;
		Scanner s = new Scanner(System.in);
		ArrayList<Exposicao> exp = new ArrayList<Exposicao>();
		
		exp = GestorExposicao.getExposicao();
		
		if(exp.size() > 0){
			System.out.print("\n\nInsira o id da Exposicao: ");
			idExp = s.nextInt();
			s.nextLine();
			
			System.out.print("\n\nInsira o id da Obra: ");
			idObra = s.nextInt();
			s.nextLine();
			
			GestorExposicao.removerObraExposicao(idExp, idObra);
			
			System.out.println("\n\nObra removida da Exposicao com sucesso!");
		}
		else
			System.out.print("\n\nNao Exposicoes");
	}
	
	public void exposicaoMaisLucrativa(){
		int id;
		ArrayList<Exposicao> exp = new ArrayList<Exposicao>();
		
		exp = GestorExposicao.getExposicao();
		id = GestorExposicao.getExposicaoMaisLucrativa();
		
		if(exp.size() > 0){
		System.out.print("\n\nA exposicao mais lucrativa foi: \"" +exp.get(id).getNomeExposicao()+ "\" com um total de " +(exp.get(id).getPreco()*exp.get(id).getQtdVisitantes())+ "€ obtidos!");
		}
		else
			System.out.print("\n\nNao existem exposicoes");
	}
}
