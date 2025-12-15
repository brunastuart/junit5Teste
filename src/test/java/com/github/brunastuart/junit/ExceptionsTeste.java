package com.github.brunastuart.junit;

import org.junit.jupiter.api.*;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456548", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
            transferenciaEntreContas.transfere(contaOrigem, contaDestino, -10));


        // Verifica que nenhuma exceção é lançada quando o saldo é suficiente        
        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));
        }
}