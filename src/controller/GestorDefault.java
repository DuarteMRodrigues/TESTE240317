package controller;

import java.util.ArrayList;

import model.Obra;

public class GestorDefault {
	public GestorDefault(){
		
	}
	
	public boolean criarDefault(){
		int[] ids = new int[100];
		
		ArrayList<Obra> obra = new ArrayList<Obra>();
		
		obra = GestorObra.getObra();
	
		if(obra.size() == 0){
			GestorObra.addObra("Duarte Rodrigues", "The Thing", "Arte Abstrata", "Pintura", "20/11/2013");
			GestorObra.addObra("Bogdan Lozhkin", "Kappa", "Arte Moderna", "Pintura", "15/08/2012");
			GestorObra.addObra("Filipe Cunha", "Masterpiece", "Arte Classica", "Pintura", "18/07/2015");
			GestorObra.addObra("Bruno Silva", "Lost", "Arte Surreal", "Pintura", "31/12/2013");
			GestorObra.addObra("Rui Santana", "Rice", "Arte do Arroz", "Pintura", "02/03/2013");
			GestorObra.addObra("Pedro Eugenio", "The Best", "Arte Moderna", "Pintura", "08/04/2014");
			GestorObra.addObra("Mario Agostinho", "Easy", "Arte Abstrata", "Pintura", "12/02/2016");
			GestorObra.addObra("Andre Silva", "The Alleyway", "Arte Moderna", "Pintura", "05/04/2012");
			GestorObra.addObra("Mafalda Barbosa", "Potatoes", "Arte Abstrata", "Pintura", "14/01/2010");
			
			ids[0] = 0;ids[1] = 6;ids[2] = 8;
			
			GestorExposicao.addExposicao(5000, 15, "Abstratismo", "15/01/2017", "30/01/2017", ids, 3);
			
			
			for(int i = 0; i < 9; i++)
				ids[i] = i;
			
			GestorExposicao.addExposicao(15000, 7, "All Together", "18/08/2017", "18/09/2017", ids, 9);
			
			return true;
		}
		else
			return false;
	}
}
