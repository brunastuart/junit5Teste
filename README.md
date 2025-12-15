# junit5

Projeto de exemplo demonstrando recursos básicos do JUnit 5.

## Descrição

Este repositório contém exemplos de testes unitários usando JUnit 5, cobrindo as principais funcionalidades do framework: assertions, lifecycle (Before/After), assumptions, testes condicionais, tratamento de exceções e organização/ordenação de testes.

## Principais funcionalidades

- **Assertions:** exemplos em `AssertionsTeste.java` mostrando asserções comuns.
- **Before / After:** ciclo de vida de testes em `AfterBeforeTeste.java`.
- **Assumptions:** testes que só rodam quando certas condições são verdadeiras (`AssumptionsTeste.java`).
- **Testes condicionais:** como pular ou condicionar testes (`CondicionaisTeste.java`).
- **Ordenação de testes:** controle da ordem com `EscolhendoAOrdemTeste.java`.
- **Testes de exceção:** verificação de exceções esperadas em `ExceptionsTeste.java`.
- **Exemplos de domínio:** classes `Conta.java`, `Pessoa.java` e `TransferenciaEntreContas.java` usadas pelos testes.
- **Gerenciamento de recurso:** `GerenciadorDeConexaoComBancoDeDados.java` demonstra padrões para recursos externos.

## Estrutura do projeto

- `src/main/java` — código de exemplo (modelo/dominio).
- `src/test/java` — testes JUnit 5 (exemplos listados acima).

## Requisitos

- JDK instalado (Java 11+ recomendado).
- Maven instalado.
