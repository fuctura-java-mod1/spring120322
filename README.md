# Repositório da turma de Spring (120322) na Fuctura
## Instrutor: @ericmoraess

# JDK:
https://www.oracle.com/java/technologies/downloads/#jdk18-windows

# Eclipse:
https://www.eclipse.org/downloads/packages/

# Lombok:
https://projectlombok.org/download

# Spring Projects:
https://spring.io/projects

# Spring Reference Docs:
https://docs.spring.io/spring-boot/docs/current/reference/html/

# Spring Initializr:
https://start.spring.io/

# DBeaver:
https://dbeaver.io/download/

# Thymeleaf:
https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#introducing-thymeleaf

# Posições:
https://www.researchgate.net/figure/Figura-1-Representacao-das-posicoes-de-jogadores-em-campo-de-futebol-G-Goleiro-Z_fig1_326353906

# Atividade 1 

### 1 - Vamos criar um CRUD para a nossa classe Jogador

##### criar um controller :

- JogadorController


##### criar as rotas abaixo:

- /jogador/cadastrar
- /jogador/listar
- /jogador/atualizar
- /jogador/excluir

1. cada rota deve exibir uma página com títulos diferentes. 
2. Em cada página adicione o **Bootstrap** dentro da tag html **head** 
3. dentro da tag html **body** cole o seguinte conteúdo:

```html
<div>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<div class="container-fluid">
		    <a class="navbar-brand" href="#">Fuctura</a>
		    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
		      <div class="navbar-nav">
		        <a class="nav-link active" aria-current="page" href="#">Home</a>
		        <a class="nav-link" href="#">Cadastrar</a>
		        <a class="nav-link" href="#">Listar</a>
                <a class="nav-link" href="#">Atualizar</a>
                <a class="nav-link" href="#">Excluir</a>
		      </div>
		    </div>
		  </div>
		</nav>
	</div>
```

### 2 - Adicione a seguinte dependência no seu projeto: 
- Spring Boot DevTools

### 3 - Entrega da atividade:
- Prazo: 18/04/22
- Formas de entrega: GitHub ou Google Drive
- 1 Ponto extra será dado para os alunos que enviar via Github

