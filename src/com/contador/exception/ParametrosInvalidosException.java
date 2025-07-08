package com.contador.exception;

public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("Parâmetros inválidos fornecidos.");
    }

    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
