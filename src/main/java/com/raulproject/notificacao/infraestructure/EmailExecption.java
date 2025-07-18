package com.raulproject.notificacao.infraestructure;

public class EmailExecption extends RuntimeException {
    public EmailExecption(String message) {
        super(message);
    }

    public EmailExecption(String mensagem, Throwable throwable) {
        super(mensagem, throwable);

    }
}
