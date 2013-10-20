package itexto.integrator;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class FactoryReflexao {
	
	public Integrador create(String nome, DataSource ds) {
		try {
			@SuppressWarnings("rawtypes")
			Class classe = Class.forName("itexto.integrator.impl.IntegradorPra" + nome);
			Constructor construtor = classe.getConstructor(DataSource.class);
			Object obj = construtor.newInstance(ds);
			return (Integrador) obj;
		} catch (InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}
	
	public String toString() {
		return "Reflexão fancy";
	}
	
}
