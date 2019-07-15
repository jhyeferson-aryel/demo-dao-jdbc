package db;

public class DbException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	//Exceção personalizada, mas é possível usar a SQLException do prórpio java.util.sql para isso
	public DbException(String msg) {
		super(msg);
	}
}
