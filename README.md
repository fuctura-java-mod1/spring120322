# Repositório da turma de Spring (120322) na Fuctura
## Instrutor: @ericmoraess

### Spring IOC (Inversion of Control) Container  

<img src="https://docs.spring.io/spring-framework/docs/4.1.x/spring-framework-reference/html/images/container-magic.png">

- No Spring, os objetos que formam a espinha dorsal do seu aplicativo e que são gerenciados pelo contêiner Spring IoC são chamados de beans. Um bean é um objeto que é instanciado, montado e gerenciado por um contêiner Spring IoC.

- Quando definimos um bean com **escopo singleton**, o contêiner cria uma única instância desse bean; todas as solicitações para esse nome de bean retornarão o mesmo objeto, que é armazenado em cache. Quaisquer modificações no objeto serão refletidas em todas as referências ao bean. 
- **O escopo singleton é o valor padrão se nenhum outro escopo for especificado**.

- Tarefa de casa: pesquisar sobre Inversão de Controle e Injeção de Dependência

### Layers 

<img src="https://static.javatpoint.com/springboot/images/spring-boot-architecture2.png">

<img src="https://anchormen.nl/wp-content/uploads/2018/07/implementation-1.png">

### Spring Sterotypes Annotations

- @Controller: especificamos uma classe com @Controller para indicar que eles são **front controllers** e responsáveis por lidar com solicitações de usuários e retornar a resposta apropriada;

- @Service: especificamos uma classe com @Service para indicar que eles estão mantendo a lógica de negócios. Além de ser utilizada na camada de serviço (regra de negócio), não há outro uso especial para esta anotação. As classes de utilitários podem ser marcadas como classes de serviço;
 
- @Repository - Utilizada para a camada de persistência. Normalmente anotamos classes que representam um DAO, Repositório etc;

- @Component é uma anotação de **nível de classe**. É usado para denotar uma classe como um Componente. Podemos usar @Component para marcar os beans como componentes gerenciados do Spring. E marcar classes que não se enquadrou em nenhum dos outros *sterotypes*;

<img src="https://media.geeksforgeeks.org/wp-content/uploads/20211129123743/SpringComponentAnnotations.jpg">

### Criando Beans

- No Spring, os objetos que formam a espinha dorsal do seu aplicativo e que são gerenciados pelo contêiner Spring IoC são chamados de beans. Um bean é um objeto que é instanciado, montado e gerenciado por um contêiner Spring IoC. 

- @Configuration: podemos utilizá-lo para declarar 1 ou mais **Bean**.

- @Bean: informa que um método produz um bean para ser gerenciado pelo contêiner Spring.

### Boas Práticas com Injeção de Dependências

As melhores práticas para injeção de dependência são utilizar interfaces, construtores e propriedades finais.