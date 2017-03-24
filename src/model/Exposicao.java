package model;

import java.util.ArrayList;

public class Exposicao {
	private int id;
	private int qtdVisitantes;
	private double preco;
	private String nomeExposicao;
	private String dataInicio;
	private String dataFim;
	private ArrayList<Obra> obra;

	public Exposicao(int id, int qtdVisitantes, double preco, String nomeExposicao, String dataInicio, String dataFim, ArrayList<Obra> obra) {
		super();
		this.id = id;
		this.qtdVisitantes = qtdVisitantes;
		this.preco = preco;
		this.nomeExposicao = nomeExposicao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.obra = obra;
	}
	
	public Exposicao(){
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getQtdVisitantes() {
		return qtdVisitantes;
	}
	public void setQtdVisitantes(int qtdVisitantes) {
		this.qtdVisitantes = qtdVisitantes;
	}

	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNomeExposicao() {
		return nomeExposicao;
	}
	public void setNomeExposicao(String nomeExposicao) {
		this.nomeExposicao = nomeExposicao;
	}

	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public ArrayList<Obra> getObra() {
		return obra;
	}
	public void setObra(ArrayList<Obra> obra) {
		this.obra = obra;
	}
}
