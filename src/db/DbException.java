package db;

public class DbException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	//Exce��o personalizada, mas � poss�vel usar a SQLException do pr�rpio java.util.sql para isso
	public DbException(String msg) {
		super(msg);
	}
}
