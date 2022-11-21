# Curso OO
https://www.alura.com.br/formacao-arquitetura-design-projetos-java

A *COESÃO* está relacionada ao sentido das classes, relacionado com a resp única. 
Uma classe deve ter um único motivo para mudar. 
Se ela tem mais de uma responsabilidade, ela deve ser dividida em mais de uma classe.

O *ENCAPSULAMENTO* busca proteger as classes de possíveis violações, como por exemplo um 
método Setter ser acessado por outra classe que instânciou a classe anterio, aumentando acoplamento
e permitindo violações.

O *ACOPLAMENTO* é a dependência entre as classes, quanto mais dependências, mais difícil de manter, pois
uma pode afetar o funcionamento da outra.

## Base SOLID
https://medium.com/mindorks/solid-principles-explained-with-examples-79d1ce114ace

SOLID é um acrônimo que representa cinco princípios da programação orientada a objetos e design de código.

*S*ingle Responsibility Principle (Princípio da Responsabilidade Única):
é um princípio que diz que uma classe deve ter um, e somente um, motivo para mudar.

Exemplo no código - Uma classe com mais de uma responsabilidade, como por exemplo, uma classe 
que faz a leitura de um arquivo e a escrita em um banco de dados, deve ser dividida em duas. Uma classe entidade
e uma classe de serviço em uma só também não deve existir.

*O*pen/Closed Principle (Princípio Aberto/Fechado):
é um princípio que diz que as classes de um software ( módulos, funções, entidades, etc.)
devem estar abertas para extensão, mas fechadas para modificação, como por exemplo, evitar criação de Setters desnecessários,
possibilitar a extensão de uma classe sem a necessidade de alterar o código dela, e buscar ao máximo o desacoplamento.

Exemplo no código - Adicionar novos tipos de validações sem interferir em cada um deles indivídualmente.


## Design Patterns
https://refactoring.guru

Curso anterior

## Banco de dados
Banco de dadosSQL ANSI (sql server)

## Cloud 
Programação Assincrona | Async/Await

Armazenamento e Cache

## Clean Code 
Java Effective e Clean Architeture

## Gerenciadores de dependências
Maven | Gradle

## Java Puro
Java 8 

Collections | Streams

https://www.devmedia.com.br/java-streams-api-manipulando-colecoes-de-forma-eficiente/37630
https://www.devmedia.com.br/java-collections-como-utilizar-collections/18450
https://www.baeldung.com/java-8-collectors
https://acervolima.com/diferenca-entre-streams-e-colecoes-em-java/



## Testes em Java
Testes unitários | Testes de integração | JUNIT e Mockito

## Metodologias Ágeis
Scrum | Kamban

https://agilemanifesto.org


