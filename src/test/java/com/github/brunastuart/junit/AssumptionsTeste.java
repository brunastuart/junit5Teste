package com.github.brunastuart.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarAlgoSomenteNoUsuario() {
        Assumptions.assumeTrue("bruna".equals (System.getenv("USERNAME")));
        //Assumptions.assumeFalse("root".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
        System.out.println("Teste executado para o usuário: bruna;

        /*
        Para descobrir o nome da variável de ambiente do seu usuário, rode o código abaixo: 
        String userVariavel = System.getenv("USER");
        String userNomeVariavel = System.getenv("USERNAME");
        System.out.println("USER: " + userVariavel);
        System.out.println("USERNAME: " + userNomeVariavel);
        */
    }
}
