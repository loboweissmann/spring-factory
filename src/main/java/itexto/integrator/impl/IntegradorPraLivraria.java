package itexto.integrator.impl;

import itexto.integrator.DataSource;
import itexto.integrator.Integrador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("integradorLivraria")
public class IntegradorPraLivraria extends Integrador {
	
	@Autowired
	public IntegradorPraLivraria(DataSource dataSource) {
		super(dataSource);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String enviarParaDestino(String dados) {
		return "Pra livraria! " + dados;
		
	}

}
