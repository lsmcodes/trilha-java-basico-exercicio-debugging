# DIO - Trilha Java Básico
<div style="display:inline-block">
        <picture  title="Java">
                <source height="40" width="40" media="(prefers-color-scheme: light)" srcset="https://cdn.simpleicons.org/openjdk/000000">
                <img height="40" width="40" src="https://cdn.simpleicons.org/openjdk/FFFFFF" />
        </picture>
        <picture  title="Apache Maven">
                <source height="40" width="40" media="(prefers-color-scheme: light)" srcset="https://cdn.simpleicons.org/apachemaven/000000">
                <img height="40" width="40" src="https://cdn.simpleicons.org/apachemaven/FFFFFF" />
        </picture>
        <picture  title="Spring Boot">
                <source height="40" width="40" media="(prefers-color-scheme: light)" srcset="https://cdn.simpleicons.org/springboot/000000">
                <img height="40" width="40" src="https://cdn.simpleicons.org/springboot/FFFFFF" />
        </picture>
</div>

## Autora do Exercício e Repositório Original
- [Camila Cavalcante](https://github.com/cami-la)
- [Debugging Java](https://github.com/cami-la/debugging-java)

## Depuração/Debugging
`Depuração` é o processo de identificar erros nas aplicações, localizá-los no código e tratá-los. Erros de programação são denominados bugs e compõem duas categorias:

- `Erros de sintaxe`: as linguagens de programação possuem regras de como as instruções devem ser escritas, esses erros ocorrem quando o código não segue essas regras;
- `Erros de semântica`: são os erros provenientes de uma lógica incorreta que ocorrem independente da sintaxe, como por exemplo quando uma variável é utilizada antes de ser iniciada.

`Depuradores` são ferramentas que assumem o controle do tempo de execução do código e permitem a inspeção dele.

## Pilha de Execução de um Programa/Stack Trace
A `pilha de execução` coleta informações sobre todos os métodos invocados pelo programa, de modo que cada invocação de método é empilhada nela e, tratando-se de uma pilha, os métodos são listados de forma inversa à sua execução.

Quando um programa lança uma exceção (lança um erro), a pilha é impressa no console e descreve os métodos invocados até o erro, o que ajuda o desenvolvedor a localizá-lo.

## Exercício
O exercício consiste em criar uma calculadora para cálculo da média das notas de alunos. A calculadora deverá ter o seguinte comportamento através do terminal/console:

- Solicitar os nomes dos alunos;
- Solicitar a nota de cada um dos alunos;
- Calcular a média e exibi-la;
- Imprimir a Stack Trace.

O objetivo do projeto é visualizar a pilha de execução do programa e depurá-lo.

## Referências
- What is Debugging? - Microsoft Learn: https://learn.microsoft.com/pt-br/visualstudio/debugger/what-is-debugging?view=vs-2022
- Exceptions - Dev Java: https://dev.java/learn/exceptions/