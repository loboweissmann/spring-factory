package itexto.integrator;

import java.sql.Connection;

public interface DataSource {
	
	Connection getConnection();
	
}
