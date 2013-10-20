package itexto.integrator;

public abstract class Integrador {
	
	protected DataSource dataSource;
	
	public Integrador(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public abstract String enviarParaDestino(String dados);
	
}
