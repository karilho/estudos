# Curso OO
https://www.alura.com.br/formacao-arquitetura-design-projetos-java

### 4 PILARES DA OO

A **ABSTRAÇÃO** é a capacidade de uma classe abstrair o que é necessário para o seu funcionamento, escondendo detalhes de implementação.

O **ENCAPSULAMENTO** busca proteger as classes de possíveis violações, como por exemplo um
método Setter ser acessado por outra classe que instânciou a classe anterio, aumentando acoplamento
e permitindo violações.

A **HERANÇA** é a capacidade de uma classe herdar atributos e métodos de outra classe, porém deve-se ter muito cuidado ao utiliza-la
pois podemos herdar coisas indesejadas, por isso, busque utilizar o polimorfismo por meio da composição.

O **POLIMORFISMO** é a capacidade de uma classe se comportar de forma diferente, de acordo com o contexto.

### Outros conceitos.
A *COESÃO* está relacionada ao sentido das classes, relacionado com a resp única. 
Uma classe deve ter um único motivo para mudar. 
Se ela tem mais de uma responsabilidade, ela deve ser dividida em mais de uma classe.

O *ACOPLAMENTO* é a dependência entre as classes, quanto mais dependências, mais difícil de manter, pois
uma pode afetar o funcionamento da outra.

A *COMPOSIÇÃO* é a capacidade de uma classe ter uma outra classe como atributo, permitindo que ela
tenha acesso aos métodos e atributos da classe que a compõe.




## Base SOLID
https://medium.com/mindorks/solid-principles-explained-with-examples-79d1ce114ace

Curso SOLID na plataforma ALURA.

SOLID é um acrônimo que representa cinco princípios da programação orientada a objetos e design de código.

**Single Responsibility Principle** (Princípio da Responsabilidade Única):
é um princípio que diz que uma classe deve ter um, e somente um, motivo para mudar.

Exemplo no código - Uma classe com mais de uma responsabilidade, como por exemplo, uma classe 
que faz a leitura de um arquivo e a escrita em um banco de dados, deve ser dividida em duas. Uma classe entidade
e uma classe de serviço em uma só também não deve existir.

**Open/Closed Principle** (Princípio Aberto/Fechado):
é um princípio que diz que as classes de um software ( módulos, funções, entidades, etc.)
devem estar abertas para extensão, mas fechadas para modificação, como por exemplo, evitar criação de Setters desnecessários,
possibilitar a extensão de uma classe sem a necessidade de alterar o código dela, e buscar ao máximo o desacoplamento.

Exemplo no código - Adicionar novos tipos de validações sem interferir em cada um deles indivídualmente.

**Liskov Substitution Principle** (Princípio da Substituição de Liskov):
é um princípio que diz que as classes derivadas devem ser substituíveis por suas classes base. MUITO CUIDADO: heranças herdadas de interfaces podem quebrar
alguns códigos anteriores, pois será permitido implementações novas das classes herdadas.
Priorizar a composição se possivel ao invés de herança, sempre usa-la com cuidado.

Exemplo: O exemplo do terceirizado ou de uma regra de calculo de imposto (vídeo: https://www.youtube.com/watch?v=tIcfvP9jf9k) 
Ao herdar, você deve tomar cuidado com as prés e pós condições, pois o polimorfirsmo vai permitir que você coloque-os, mas vai ferir regras.

- PRÉ condições (regras antes do negócio) não podem ser reforçadas em subclasses ||| 
Regra anterior de calculo de imposto = imposto > 0, NOVA PRÉ CONDIÇÃO: imposto > -10. OK NESTE CASO.


- PÓS condições (regras de retorno do negócio) não podem enfraquecer em relação a anterior, sem regras mais fracas que a anterior.

Regra anterior, o retorno era maior que 0 NOVA PÓS CONDIÇÃO: O retorno devolve algum valor > 10. OK NESTE CASO

PORÉM, eu poderia botar um retorno maior que -50 por exemplo, o que iria quebrar a regra anterior do número seria colocar > 10

**Interface Segregation Principle** (Princípio da Segregação de Interfaces):
é um princípio que diz que nenhuma classe deve ser forçada a depender de métodos que ela não vai usar, ou seja, você
deve criar interfaces mais específicas, para que as classes que as implementam não sejam forçadas a implementar métodos que não irão utilizar.
Exemplo: Você usar um Reajuste e um ReajusteTributável, que vai herda-lo, ou seja, segregar as interfaces para ter funções específicas

O ReajusteTributável vai implementar o método de cálculo de imposto, e o Reajuste não.

**Dependency Inversion Principle** (Princípio da Inversão de Dependência):
Abstrair as dependências de uma classe, para que ela não dependa de implementações de outra classe, mas sim de interfaces (um exemplo de abstração).
Exemplo do braço de um robo, que deve ter a função de cortar, mas que pode fazer com uma faca, uma serra ou um facão.


Geralmente quando se aplica o Openclosed, o S,O e D são indiretamente aplicados, pois você separa as implementações em classes diferentes. 


## Conclusões
- Que é mais interessante e mais seguro para o nosso código depender de interfaces
(classes abstratas, assinaturas de métodos e interfaces em si) do que das implementações de uma classe;


- Que as interfaces são menos propensas a sofrer mudanças enquanto implementações podem mudar a qualquer momento;



## Design Patterns
https://refactoring.guru

Curso anterior

## Banco de dados
Banco de dadosSQL ANSI (sql server)

## Cloud 
Programação Assincrona | Async/Await

Armazenamento e Cache

SQS E LAMBDA
## Clean Code 

### Resumo inicial:
Quando falamos de um código com fácil manutenção estamos nos referindo à um código com Baixo Acoplamento, Alta Coesão,
usando SOLID, Imutabilidade (quando fizer sentido), aplicando Design Patterns, minimizando Side Effects,
maximizar o uso de Funções Puras e várias outras coisas.

- Legível

Um código compreensivo possibilita a identificação de pontos que precisam ser melhorados. Passamos mais tempo lendo código do que escrevendo então, quanto mais fácil for ler o código menos esforço fazemos para entendê-lo.
- Testável

Devemos testar nossos código, pois isso vai dar-nos segurança para podermos alterá-los. E garantir que os cenários que previmos estão de acordo com o esperado.
- Fácil de ser mantido

Nosso código deve passivo de alteração tanto para adição de novas funcionalidades, quanto para aumentar a legibilidade ou manutenibilidade.


**Java Effective e Clean Architeture**

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

## Extras

### String x StringBuilder x StringBuffer
Fonte de estudos 

https://www.youtube.com/watch?v=_drNcLWgUlE 

https://www.youtube.com/watch?v=oYcb0N1YfVw 

https://www.devmedia.com.br/diferencas-entre-string-stringbuilder-e-stringbuffer-em-java/29865

#### Strings

Strings são imutáveis, ou seja, toda vez que alteramos seu valor, criamos um novo objeto na memória.

Em um contexto de programação, isso pode ser um problema, pois a cada alteração, o objeto é recriado, e isso pode gerar um consumo de memória desnecessário.

Mas a imutabilidade é necessária mesmo com seu drawback em alguns casos.

#### - Builder x Buffer

Primeiro, cabe destacar que o BUILDER **NÃO** É SINCRONIZADO, enquanto o BUFFER **É**. 

O que quero dizer com isso?

- Diferenças do SBuilder SBuffer:

O StringBuilder desempenha melhor em aplicações com um único thread, pois não precisa sincronizar o acesso aos métodos, 
possui também maior perfomance porém sem garantia de sincronização, é utilizado em operações .insert e .append.

Já o StringBuffer é mais indicado para aplicações com vários threads, pois ele sincroniza o acesso aos métodos, 
por isso tb é considerado *Thread Safe*, ou seja, você garante a consistência do seu código quando há diversas
threads lendo ou modificando a mesma String.

Em termos de desempenho, o StringBuffer é mais lento que o StringBuilder entorno de 30%.



