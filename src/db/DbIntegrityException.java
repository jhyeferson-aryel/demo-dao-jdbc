package db;

public class DbIntegrityException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	//Exce��o personalizada, mas � poss�vel usar a SQLException do pr�rpio java.util.sql para isso
	//Essa classe retorna exce��o sobre integridade relacional
	public DbIntegrityException(String msg) {
		super(msg);
	}
}
