# Repositório da turma de Spring (120322) na Fuctura
## Instrutor: @ericmoraess

# H2:
http://www.h2database.com/html/features.html#database_only_if_exists

# JPA

https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#preface

# Atividade 2 

### 1 - Utilizando o JogadorController (Atividade 1)

##### criar a rota abaixo:

- /jogador/listar/todos

1. Utilize o método **findAll()** para recuperar todos os jogadores
2. Adicione o HTML abaixo na sua página:

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
	<div class="container">
		<div class="row">
			<div class="col col-md-3" th:each="jogador : ${jogadores}">
				<div>
					<p>Nome: <span th:text=${jogador.nome}>???</span></p>
					<p>Idade:<span th:text=${jogador.idade}>???</span></p>
					<p>Altura:<span>???</span></p>
					<p>Peso:<span>???</span></p>
					<img th:src=${jogador.img}> 
				</div>
			</div>
		</div>
	</div>
```

### 2 - Pesquise e estude sobre (não precisa entregar): 
- th:each
- formulários HTML
- Métodos HTTP

### 3 - Entrega da atividade:
- Prazo: 26/04/22 (23:59)
- Formas de entrega: **GitHub** ou **Google Drive**
- 1 Ponto extra será dado para os alunos que enviar via Github