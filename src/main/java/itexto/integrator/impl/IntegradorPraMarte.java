package itexto.integrator.impl;

import itexto.integrator.DataSource;
import itexto.integrator.Integrador;
import itexto.integrator.Servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("integradorMarte")
public class IntegradorPraMarte extends Integrador {

	private final Servico servico;
	
	@Autowired
	public IntegradorPraMarte(DataSource dataSource, Servico servico) {
		super(dataSource);
		this.servico = servico;
	}

	@Override
	public String enviarParaDestino(String dados) {
		return "Pra marte! " + dados;
		
	}

}
