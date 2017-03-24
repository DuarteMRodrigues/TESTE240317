package controller;

import java.util.ArrayList;

import model.Obra;

public class GestorObra {
	public static ArrayList<Obra> alObra;
	
	public GestorObra(){
		alObra = new ArrayList<Obra>();
	}
	
	public static void addObra(String nomeArtista, String tituloObra, String categoria, String tipoObra, String dataFeito){
		Obra obra = new Obra(alObra.size(), nomeArtista, tituloObra, categoria, tipoObra, dataFeito);
		
		alObra.add(obra);
	}

	public static ArrayList<Obra> getObra() {
		return alObra;
	}
	
	public static void apagarObra(int id){
		alObra.remove(id);
	}
	
}