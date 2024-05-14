# DIO - Trilha Java Básico
www.dio.me

## Autora do exercício e repositório com a proposta original
- [Camila Cavalcante](https://github.com/cami-la)
- [Debugging Java](https://github.com/cami-la/debugging-java)

## Depuração/Debugging
A depuração é o processo de identificar erros no código, localizá-los e tratá-los. Erros de programação são denominados bugs e compõem duas categorias de erros:

- **Erros de sintaxe**: as linguagens de programação possuem regras de como as instruções devem ser escritas, estes erros ocorrem quando o código não segue essas regras;

- **Erros de semântica**: são os erros provenientes de uma lógica incorreta que ocorrem independente da sintaxe, como por exemplo utilizar uma variável antes de inicializá-la.

Depuradores são ferramentas que assumem o controle do tempo de execução do código e permitem a inspeção dele.


## Pilha de execução de um programa/Stack Trace
A pilha de execução coleta informações sobre todos os métodos invocados pelo programa. Quando o programa lança uma exceção (lança um erro), ela é impressa no console e descreve a pilha de métodos invocados até o erro, o que ajuda os desenvolvedores a localizá-lo.

## Exercício
O exercício consiste em criar uma calculadora para cálculo da média das notas de alunos. A calculadora deverá ter o seguinte comportamento através do terminal/console:

- Solicitar os nomes dos alunos;

- Solicitar a nota de cada um dos alunos;

- Calcular a média e exibí-la.

O objetivo do exercício é observar a pilha de execução do programa, a ordem na qual os métodos são invocados.

## Referências
- What is Debugging? - Microsoft Learn: https://learn.microsoft.com/pt-br/visualstudio/debugger/what-is-debugging?view=vs-2022

- Exceptions - Dev Java: https://dev.java/learn/exceptions/
