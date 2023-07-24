package br.com.bytebank.banco.modelo;

/**
 * Classe que representa um Cliente no Bytebank
 * 
 * @author flavio
 * @version 1.0
 *
 */
public class SaldoInsuficienteException extends Exception {
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
