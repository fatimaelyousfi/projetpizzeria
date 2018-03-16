package fr.pizzeria.exception;

/**
 * 
 * gere les exception des sous classe Save Update et Delete
 */
public class StockageException extends Exception { // la classe exeption est sur java.lang.exception
	public StockageException() {
	}

	public StockageException(String msg) {
		super(msg);
	}
}
