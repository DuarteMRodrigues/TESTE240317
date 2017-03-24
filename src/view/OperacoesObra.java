package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.GestorExposicao;
import controller.GestorObra;
import model.Obra;

public class OperacoesObra {
	public OperacoesObra(){
		
	}
	
	public void inserirObra(){
		String nomeA, nomeO, catO, tipoO, data;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira o nome do Artista que criou a Obra: ");
		nomeA = s.nextLine();
		
		System.out.println("Insira o nome da Obra: ");
		nomeO = s.nextLine();
		
		System.out.println("Insira a categoria da Obra: ");
		catO = s.nextLine();
		
		System.out.println("Insira o tipo da Obra: ");
		tipoO = s.nextLine();
		
		System.out.println("Insira a data de criacao da Obra: ");
		data = s.nextLine();
		
		GestorObra.addObra(nomeA, nomeO, catO, tipoO, data);
	}
	
	public void listarObra(){
		boolean continuar = false;
		ArrayList<Obra> obra = new ArrayList<Obra>();
		
		obra = GestorObra.getObra();
		
		if(obra.size() > 0){
			for(int i = 0; i < obra.size(); i++){
				System.out.print("\n\n\nTitulo da Obra: " +obra.get(i).getTituloObra());
				System.out.print("\nID: " +obra.get(i).getId());
				System.out.print("\nNome do Artista: " +obra.get(i).getNomeArtista());
				System.out.print("\nCategoria: " +obra.get(i).getCategoria());
				System.out.print("\nTipo da Obra: " +obra.get(i).getTipoObra());
				System.out.print("\nData de criacao: " +obra.get(i).getDataFeito());
				
				if(i != obra.size()-1)
					continuar = Pausa.PausaLista();
				
				if(!continuar)
					break;
			}
		}
		else
			System.out.print("\n\nNao existem obras");
	}
	
	public void procurarObra(){
		int id;
		Scanner s = new Scanner(System.in);
		ArrayList<Obra> obra = new ArrayList<Obra>();
		
		obra = GestorObra.getObra();
		
		if(obra.size() > 0){
			System.out.print("\n\nInsira o id da obra: ");
			id = s.nextInt();
			s.nextLine();
			
			System.out.print("\n\nID: " +obra.get(id).getId());
			System.out.print("\nNome do Artista: " +obra.get(id).getNomeArtista());
			System.out.print("\nTitulo da Obra: " +obra.get(id).getTituloObra());
			System.out.print("\nCategoria: " +obra.get(id).getCategoria());
			System.out.print("\nTipo da Obra: " +obra.get(id).getTipoObra());
			System.out.print("\nData de criacao: " +obra.get(id).getDataFeito());
		}
		else
			System.out.print("\n\nNao existem obras");
	}
	
	public void apagarObra(){
		int id;
		Scanner s = new Scanner(System.in);
		ArrayList<Obra> obra = new ArrayList<Obra>();
		
		obra = GestorObra.getObra();
		
		if(obra.size() > 0){
			System.out.print("\n\nInsira o id da obra: ");
			id = s.nextInt();
			s.nextLine();
			
			GestorObra.apagarObra(id);
			GestorExposicao.removerObraExposicaoObra(id);
			
			System.out.println("\n\nObra Apagada com sucesso!");
		}
		else
			System.out.print("\n\nNao existem obras");
	}
}
