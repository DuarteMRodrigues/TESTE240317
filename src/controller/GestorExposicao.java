package controller;

import java.util.ArrayList;

import model.Exposicao;
import model.Obra;

public class GestorExposicao {
	public static ArrayList<Exposicao> alExposicao;
	
	public GestorExposicao(){
		alExposicao = new ArrayList<Exposicao>();
	}
	
	public static void addExposicao(int qtdVisi, double preco, String nomeE, String dataIni, String dataFim, int[] idsObra, int qtdIds){
		ArrayList<Obra> alObra = new ArrayList<Obra>();
		ArrayList<Obra> addExp = new ArrayList<Obra>();
		
		alObra = GestorObra.getObra();
		
		//Adicionar apenas as obras escolhidas à exposicao.
		for(int i = 0; i < qtdIds; i++)
			addExp.add(alObra.get(idsObra[i]));
		
		Exposicao exposicao = new Exposicao(alExposicao.size(), qtdVisi, preco, nomeE, dataIni, dataFim, addExp);
		
		alExposicao.add(exposicao);
	}	
	
	public static ArrayList<Exposicao> getExposicao(){
		return alExposicao;
	}
	
	public static int getExposicaoMaisLucrativa(){
		int id = 0;
		double max=0;
		
		if(alExposicao.size() > 0){
			for(int i = 0; i < alExposicao.size(); i++){
				if(alExposicao.get(i).getQtdVisitantes() * alExposicao.get(i).getPreco() > max){
					max = alExposicao.get(i).getQtdVisitantes() * alExposicao.get(i).getPreco();
					id = i;
				}
			}
		}
		
		return id;
	}
	
	public static void apagarExposicao(int id){
		alExposicao.remove(id);
	}
	
	//Remove a obra da exposicao, mas a obra nao é apagada
	public static void removerObraExposicao(int idExp, int idObra){
		for(int i = 0; i < alExposicao.get(idExp).getObra().size(); i++){
			if(alExposicao.get(idExp).getObra().get(i).getId() == idObra){
				alExposicao.get(idExp).getObra().remove(i);
				break;
			}
		}
	}
	
	//Se uma obra for apagada, remove a obra de todas as exposicoes onde esta estiver inserida
	public static void removerObraExposicaoObra(int id){
		for(int i = 0; i < alExposicao.size(); i++){
			for(int j = 0; j < alExposicao.get(i).getObra().size(); j++){
				if(alExposicao.get(i).getObra().get(j).getId() == id){
					alExposicao.get(i).getObra().remove(id);
					break;
				}
			}
		}
	}
	
}
