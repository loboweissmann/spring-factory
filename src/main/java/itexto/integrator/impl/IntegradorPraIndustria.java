package itexto.integrator.impl;

import itexto.integrator.DataSource;
import itexto.integrator.Integrador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("integradorIndustria") @Scope("prototype")
public class IntegradorPraIndustria extends Integrador {

	@Autowired
	public IntegradorPraIndustria(DataSource dataSource) {
		super(dataSource);
	}

	
	public String enviarParaDestino(String dados) {
		return "Pra Stark! " + dados;
		
	}

}
