# Laboratorio-4-MPS
Laboratório 4 MPS
Laboratório de Padrões de Projeto 4: Composite (25/05/2023 - 25/05/2023)

Aluno: 
Matrícula: 

O diagrama de classes abaixo projeto um sistema de gerenciamento de elementos de redes que utiliza o padrão de projeto Composite que pode ser utilizado para obter informações dos elemenntos para exibí-los em interfaces de interaração (por exemplo, um Mapa). Escreva um código-fonte em qualquer linguagem de programação O.O que ilustre o uso dessas estruturas e explique as vantagens de utilizar o padrão de projeto.


Resposta:

De forma geral, o padrão Composite pode ser usado quando o modelo central de uma aplicação pode ser representado em forma de árvore, permitindo que objetos sejam estruturados como uma árvore e tratados de forma individual. Para isso, usa-se uma interface. Esse padrão respeita o Princípio Open Closed, pois permite introduzir novos elementos na aplicação sem que hajam problemas.

Sobre o código que eu escrevi, tanto SingleElement quanto ComposedElement herdam da interface GraphElement uma função return_x(). Para esses objetos, criei um atributo de inteiro x. Para SingleElement, return_x simplesmente retorn o seu x. Para ComposedElement, return_x irá usar da classe ElementGraphIterator, que por sua vez irá iterar sobre a lista de objetos que usam a interface GraphElements contidos em ComposedElement, retornando o seu somatório.
Ou seja, na prática, ambos por usarem a interface GraphElement, estão realizando a mesma operação (embora a implementação varie, mas isso não importa a quem chama tais funções). E tem-se uma estrutura de árvore pois, qualquer objeto que seja SingleElement ou ComposedElement (que herde deles) terá a mesma implementação para return_x
