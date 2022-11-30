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
Ao herdar, você tomar cuidado com as prés e pós condições, pois o polimofirmo vai permitir que você coloque-os, mas vai ferir regras.

- PRÉ condições (regras antes do negócio) não podem ser reforçadas em subclasses ||| 
Regra anterior de calculo de imposto = imposto > 0, NOVA PRÉ CONDIÇÃO: imposto > -10. OK NESTE CASO.


- PÓS condições (regras de retorno do negócio) não podem enfraquecer em relação a anterior, sem regras mais fracas que a anterior.

Regra anterior, o retorno era maior que 0 NOVA PÓS CONDIÇÃO: O retorno devolve algum valor > 10. OK NESTE CASO

PORÉM, eu poderia botar um retorno maior que -50 por exemplo, o que quebra a regra anterior do número ser > 10

**Interface Segregation Principle** (Princípio da Segregação de Interfaces):
é um princípio que diz que nenhuma classe deve ser forçada a depender de métodos que ela não vai usar, ou seja, você
deve criar interfaces mais específicas, para que as classes que as implementam não sejam forçadas a implementar métodos que não irão utilizar.
Exemplo: Você usar um Reajuste e um ReajusteTributável, que vai herda-lo, ou seja, segregar as interfaces para ter funções específicas

O ReajusteTributável vai implementar o método de cálculo de imposto, e o Reajuste não.

**Dependency Inversion Principle** (Princípio da Inversão de Dependência):
Abstrair as dependências de uma classe, para que ela não dependa de implementações de outra classe, mas sim de interfaces (um exemplo de abstração).
Exemplo do robo, que deve ter a função de cortar, mas que pode fazer com uma faca, uma serra ou um facão.


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
 
# AWS
#### AWS LightSail
O Amazon Lightsail é um AWS com o propósito de simplificar o uso de vários recursos, é uma maneira 
mais fácil de começar a usar a AWS para que pessoas possam construir e hospedar suas aplicações na nuvem. 

- Serviços como:

- Snapshots: Cria uma "cópia" de segurança de seu servidor instância e armazena-a em um local seguro em tempo REAL, pode ser utilizado para 
permitir recuperação de desastres, imigração de arquivos entre regiões ou garantir backups de dados com observância.
- 
- Load Balance: Um load balancer serve como ponto único de contato para os clientes. O load balancer **DISTRIBUI** o tráfego de entrada do aplicativo por vários destinos
, como instâncias EC2, em várias Zonas de disponibilidade. Isso aumenta a disponibilidade do seu aplicativo. Você adiciona um ou mais listeners ao seu load balancer.

- Containers: Podem ser utilizados em conjunto com Lightsail, como por exemplo o: Nginx, o Redis etc. Permite também um versionamento dos containers, com funções de rollback por exemplo.

- Storage: Armazenamento de dados, como por exemplo, armazenar arquivos de mídia, como fotos e vídeos, ou arquivos de backup

É POSSÍVEL COM **BUCKET** (armazenamento de dados e metadados em cloud), seu nome também deve ser único independente da conta.

DISCOS (volumes de armazenamentos que podem ser montados como disco rigidos, ele vive independente da instancia que está ligado)

#### AWS S3
O Amazon S3 é um serviço de armazenamento de objetos (.txt, .jar, .zip, .jpeg) na nuvem, num local chamado BUCKET

- BUCKET - Repositório onde colocaremos nosso arquivo e trabalharemos nele.
Para permitir o acesso no bucket é necessário configurar a Bucket policy e mudar a opção de privacidade. Além disso também
é possível hospedar sites dentro do Bucket S3. PORÉM O SITE DEVE SER ESTATICO!!

- IAM - Podemos criar usuários por meio desta ferramente e conceder acesso a eles ao nosso BUCKETS.

- CLI - Command Line Interface - gerenciar a aws no próprio terminal

- Versionamento no bucket - Cada objeto tem uma ID única, inclusive para o mesmo objeto.

- Alguns comandos para usar no S3 CLI: 


- Com o comando sync, você sincroniza os dados de um diretório local com o bucket S3. Ou seja, ele copia somente os arquivos que não existam ou foram alterados.
- Você pode utilizar o cp para copiar um conteúdo local para um bucket . Ele serve para copiar um ou vários arquivos.
- O comando rm remove um arquivo ou um diretório do bucket S3.
- O comando ls lista os arquivos e diretórios do bucket S3.
- O comando mv move um arquivo ou diretório do bucket S3.
- O comando mb cria um novo bucket S3.
- O comando rb remove um bucket S3.
- O comando website habilita o bucket S3 para hospedar um site estático. 

### AWS LAMBDA
É um serviço de computação serverless, ou seja, não precisa se preocupar com a infraestrutura, apenas com o código.
configuramos um tempo máximo para nossa função. Caso ela não seja concluída dentro deste tempo, a mesma é encerrada!


Ele configura toda a infraestrutura para serviços.

** Resources configured - Mostra o quanto de memória foi alocado para a função.

** Max memory used - Mostra o quanto de memória sua função realmente utilizou.

Para criar a função, no campo Handler, deve-se respeitar:  **nome_do_arquivo.nome_da_classe.nome_do_metodo**

##### Triggers

Você cria um agendamento para função disparar X ou Y hora, como backup, reinicio etc.

Você pode utilizar o bucket por exemplo da S3 para trabalhar com o trigger do Lambda

O Cloudwatch tem o histórico das vezes utilizadas, faz o management.

#### AWS IAM
Serviço que gerencia usuários e grupos para acessar os serviços.

### AWS EC2

Elastic Compute Cloud -  Serviço de computação na nuvem, que permite criar máquinas virtuais na nuvem e várias instâncias de diversos tamanhos.
É possivel também utilizar instâncias pré configuradas.

 **Diferença pro S3** - O S3 é um serviço de armazenamento de objetos, enquanto o EC2 é um serviço de computação, permitindo criação de VM na nuvem
e também por exemplo, podemos colocar uma aplicação JAVA, ANGULAR, PHP para rodar pois permite conteúdo DINÂMICO, diferente da S3 que é estática.

- Security Groups: Grupos de segurança que agem como firewall bloqueando ou permitindo trafégo as instâncias EC2.

- Região x Zonas: Uma região geralmente recebe o nome da cidade onde se encontra. São Paulo, por exemplo, é uma região da AWS
no momento da gravação desse treinamento. E dentro dessa região, há 3 espaços físicos que possuem sub-redes conectadas entre si.
Estes espaços físicos são chamados de zonas de disponibilidade. Cada zona de disponibilidade pode ser uma sala,
um andar ou até um prédio diferente dentro da região em questão.

- Imagem x Modelo : Ao criarmos uma instância a partir de uma imagem, podemos selecionar todo o hardware (tipo de instância, rede, etc) e 
algum software já vem pré-instalado. Já com o Modelo, nós podemos selecionar qualquer imagem (software)
e o hardware já estará pré-configurado. Inclusive nós criaremos um modelo mais adiante no curso para que a AWS possa criar 
instâncias automaticamente para nós.

- Amazon RDS: É um serviço de banco **RELACIONAL** de dados gerenciado, ou seja, não precisamos nos preocupar com a infraestrutura para sua criação e uso.

- Amazon AutoScaling: Duas instâncias estão rodando, uma cai e ele recoloca ela no ar automaticamente, duas instâncias estão recebendo muito acesso,
ele cria uma terceira para ajudar a atender a demanda, ou seja, é um serviço de autogerenciamento. Pode ser associado a um Load Balancer.

### AWS SQS

O SQS é um serviço de filas de mensagens. Ele permite que você envie mensagens de um aplicativo para outro, realizando uma função de integração.

As comunicações sincronas podem ter problemas como perca de conexão, pacotes, servidor indisponível e várias requisições repetitivas. 
Já na assincrona, nós colocamos um sistema de filas de mensagens (BROKER), fazendo com que o sistema B pergunte para ele quando ele estiver disponível se há mensagens novas
para ele processar. A mensagem ficará no Broker, trazendo mais resiliencia e disponibilidade para aplicação.

O SQS pode enviar a mesma mensagem para duas ou mais FILAS por meio do uso de **TÓPICOS SNS**, agem por um sistema de "subscrição", onde filas "filhas" inscrevem-se nela e 
recebem cópia das mensagens, sem que ocorram percas.

No SNS, os tipos de inscrições disponíveis são, entre outros: endpoints HTTP, filas SQS e números para envio de SMS.

A SQS recebe a mensagem, depois processa, depois exclui a mesma da fila.  **Não é possível recuperar uma mensagem excluída da fila.** 
- Visibility timeout: É o tempo que a mensagem fica disponível para ser processada. Caso o processamento não seja concluído dentro deste tempo, a mensagem volta para a fila.
- polling: É o tempo que o sistema B espera para perguntar se há mensagens novas para ele processar. Caso não haja mensagens, o sistema B fica em espera, 
você define com o --wait-time-seconds. O Long Polling é preferencial pois você busca casualmente as mensagens, diferente do short que busca com frequencia e gera mais requisições.-
- Dead Letter Queue: É uma fila de mensagens que recebe as mensagens que não foram processadas com sucesso, permitindo que você faça o tratamento correto para elas.


**FILAS FIFO** FIRST IN, FIRST OUT - É uma fila que garante que as mensagens serão processadas na ordem em que foram enviadas. Filas FIFO garantem a ordem de mensagens que possuem o mesmo MessageGroupId.
Filas FIFO são importantes em cenários onde a ordem das mensagens é importante. Exemplos reais incluem: estoque, transações financeiras, processamento de logs etc.


Diferenças - Vantagens da fila padrão: Taxa de transferência ilimitada, entrega PELO MENOS 1x, melhor ordenação
Diferenças - Vantagens da fila FIFO: Alta taxa de transferência, processa exatamente 1x (ou seja, se chegar repetido traz só 1), entrega fifo.

### AWS SDK
https://www.youtube.com/watch?v=-4fOwmWdoYQ

https://github.com/aws/aws-sdk-java-v2/

Para utilizar ele, basta puxar a dependencia no pom.xml, ele permite que você adicione diversos serviços relacionados
a AWS em sua aplicação para uso.

#### Programação Assincrona | Async/Await

https://www.youtube.com/watch?v=ZiuBfpI-z10

https://www.youtube.com/watch?v=HAeNZqqmEGY

https://www.educba.com/java-async-await/

https://www.baeldung.com/java-asynchronous-programming

https://www.devmedia.com.br/processamento-assincrono-em-java-com-future-e-futuretask/33851


Você pode usar métodos síncronos ou assíncronos para chamar operações AWS serviços. 
- Os métodos **síncronos** bloqueiam a execução do seu thread até o cliente receber uma resposta do serviço.
- Os métodos **assincronos**  impedem o browser, caso seja uma api, de ficar esperando a resposta e pode executar tarefas mais demoradas paralelamente. 

Alguns metods requerem um tempo maior de processamento, normalmente em ambientes de terceiros, como por exemplo, a Api dos correios, portanto,
você pode utilizar métodos assincronos para que possam ser executados em paralelo, sem ter que aguardar a resposta do serviço para prosseguir.


- Objetos futuros: 
Classe que encapsula uma chamada feita em paralelo, sendo possível cancelar a execução de uma tarefa, descobrir se a execução 
já terminou com sucesso ou erro, entre outras operações;

- ExecutorService: 
Classe para o gerenciamento de execuções em paralelo, já que cria um pool de threads, iniciando e cancelando 
as execuções. Também é possível cancelar este, evitando assim a criação de novas tarefas.

##### Diferença entre concorrência e paralelismo

- Concorrência: você tem 1 CPU fazendo as 2 task de forma dividida, ou seja, ela faz uma task e depois a outra, mas não ao mesmo tempo.
- Paralelismo: você tem 2 CPUs fazendo as 2 task concomitantemente.

**Armazenamento e Cache**

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

# Extras

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

## Java Reflection

https://www.oracle.com/technical-resources/articles/java/javareflection.html#:~:text=Reflection%20is%20a%20feature%20in,its%20members%20and%20display%20them.

http://www.baeldung.com/java-reflection

http://www.dsc.ufcg.edu.br/~pet/jornal/novembro2012/materias/coluna_java.html#:~:text=Reflection%20é%20um%20pacote%20JAVA,quando%20estamos%20escrevendo%20nosso%20código.

### O que é o Java Reflection?

Java reflection é um recurso que permite analisar classes, interfaces, atributos e métodos em tempo de execução
sem precisar conhecermos as classes envolvidas.

No exemplo citado, temos o reflection sendo utilizado para obter o nome da classe Pessoa, o nome de seus métodos, parâmetros que eles recebem e retornos.
Também é possível realizar a invocação destes métodos, como demonstrado no console pelo método invoke().


### O que é BFF?

https://learn.microsoft.com/pt-br/azure/architecture/patterns/backends-for-frontends

https://samnewman.io/patterns/architectural/bff 

BFF é uma abreviação para Back-end for Front-end, ou seja, um back-end que foi projetado 
para atender as necessidades de um front-end específico. 

Imagine uma tela de cadastro, onde é preciso apenas o email do usuário. O frontend consome uma API inteira
que possui todos os campos (nome, CPF, RG, nome da mãe, telefone, CEP, demais campos de endereço, etc) para 
depois exibir somente o input do email na tela. O JSON disso é grande. Através do backend, o BFF faz um filtro e 
entrega para o front somente o necessário, deixando tudo bem mais leve.

Crie serviços de back-end separados a serem consumidos por aplicativos de front-end específico ou interfaces.
Esse padrão é útil quando você deseja evitar a personalização de um único back-end para várias interfaces. 
Esse padrão foi descrito pela primeira vez por Sam Newman.

Leia Contexto e problema do link. 
Os requisitos aumentam com o tempo, pois é utilizado o msm BE para vários front-ends, mobile e desktop, apesar de 
cada um dos dois possuir específidades. Com isso, há uma sobrecarga no backend de trabalho, pois é difícil
de manter a compatibilidade com todos os front-ends, logo, torna-se o BE o problema, pois exige constantes atualizações
para manter as entregas em ambos os FE.

A solução seria o modelo BFF, onde cada FE teria seu BE específico. Cada equipe de interface vai possuir autonomia para 
controlar seu backend, permitindo assim um melhor gerênciamento e desenvolvimento.

PROS - maior velocidade, menos incompatabilidade e dependência entre ambos, maior escalabilidade, maior flexibilidade

CONS - maior duplicação de código, maior gasto com equipes, quando vários backend forem criados, pode acabar gerando mais complexidade.

Quando usar? Quando houver grande sobrecarga de trabalho em somente um backend, quando as solicitações 
das interfaces front x back forem diferentes, com diversas específidades, quando uma linguagem diferente
desempenhar melhor em determinado cenário.
