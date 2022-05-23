package br.com.gerenciamento.exception;

public class CriptoExistsException extends Exception {

    public CriptoExistsException(String message) {
        super(message);
    }

    private static final long serialVersionUID = 1L;

}
