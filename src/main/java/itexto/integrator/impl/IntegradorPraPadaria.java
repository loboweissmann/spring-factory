package itexto.integrator.impl;

import itexto.integrator.DataSource;
import itexto.integrator.Integrador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("integradorPadaria")
public class IntegradorPraPadaria extends Integrador {

	@Autowired
	public IntegradorPraPadaria(DataSource ds) {
		super(ds);
	}
	
	@Override
	public String enviarParaDestino(String dados) {
		return "Pro cara que faz pão! " + dados;
		
	}

}
