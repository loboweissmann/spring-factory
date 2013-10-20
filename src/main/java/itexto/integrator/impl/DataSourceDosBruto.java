package itexto.integrator.impl;

import itexto.integrator.DataSource;

import java.sql.Connection;

import org.springframework.stereotype.Component;

@Component
public class DataSourceDosBruto implements DataSource {

	@Override
	public Connection getConnection() {
		// Retornaria um datasource dos brutos
		return null;
	}

}
