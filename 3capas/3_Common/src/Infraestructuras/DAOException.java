package Infraestructuras;

/**
 * Excepción creada a petición de Sergio para generalizar las excepciones y mostrar mensajes personalizados
 * @author Ignacio
 *
 */
public class DAOException extends Exception  {

	private static final long serialVersionUID = 1L;
	/** 
	 * Construye una nueva excepción DAO con un mensaje predeterminado.
	 */
	public DAOException(){ super("Se ha producido una excepción DAO"); }
	/** 
	 * Construye una nueva excepción DAO con un mensaje dado por el programador.
	 * @param mensaje Mensaje detallado
	 */
	public DAOException(String mensaje){ super(mensaje); }
	/** 
	 * Construye una nueva excepción DAO con la excepción causante.
	 * @param excepcion Causante
	 */
	public DAOException(Exception excepcion){ super(excepcion); }
	/** 
	 * Construye una nueva excepción con el mensaje especificado y la causa.
	 * @param mensaje Mensaje detallado 
	 * @param excepcion Causante
	 */
	public DAOException(String mensaje, Exception excepcion){ super(mensaje, excepcion); }
	
}
