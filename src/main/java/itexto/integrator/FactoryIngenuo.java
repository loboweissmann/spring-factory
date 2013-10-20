package itexto.integrator;

import itexto.integrator.impl.IntegradorPraIndustria;
import itexto.integrator.impl.IntegradorPraLivraria;
import itexto.integrator.impl.IntegradorPraPadaria;


public class FactoryIngenuo {
	
	public Integrador create(String nome, DataSource ds) {
		switch (nome) {
			case "Padaria":
				return new IntegradorPraPadaria(ds);
			case "Industria":
				return new IntegradorPraIndustria(ds);
			case "Livraria":
				return new IntegradorPraLivraria(ds);
			default:
				return null;
		}
	}
	
	
	public String toString() {
		return "Ingenuo";
	}

}
