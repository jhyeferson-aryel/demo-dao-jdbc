package db;

public class DbIntegrityException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	//Exceção personalizada, mas é possível usar a SQLException do prórpio java.util.sql para isso
	//Essa classe retorna exceção sobre integridade relacional
	public DbIntegrityException(String msg) {
		super(msg);
	}
}
