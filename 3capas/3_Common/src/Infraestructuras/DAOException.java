package Infraestructuras;

/**
 * Excepci�n creada a petici�n de Sergio para generalizar las excepciones y mostrar mensajes personalizados
 * @author Ignacio
 *
 */
public class DAOException extends Exception  {

	private static final long serialVersionUID = 1L;
	/** 
	 * Construye una nueva excepci�n DAO con un mensaje predeterminado.
	 */
	public DAOException(){ super("Se ha producido una excepci�n DAO"); }
	/** 
	 * Construye una nueva excepci�n DAO con un mensaje dado por el programador.
	 * @param mensaje Mensaje detallado
	 */
	public DAOException(String mensaje){ super(mensaje); }
	/** 
	 * Construye una nueva excepci�n DAO con la excepci�n causante.
	 * @param excepcion Causante
	 */
	public DAOException(Exception excepcion){ super(excepcion); }
	/** 
	 * Construye una nueva excepci�n con el mensaje especificado y la causa.
	 * @param mensaje Mensaje detallado 
	 * @param excepcion Causante
	 */
	public DAOException(String mensaje, Exception excepcion){ super(mensaje, excepcion); }
	
}
