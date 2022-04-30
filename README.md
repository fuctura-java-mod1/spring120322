# Repositório da turma de Spring (120322) na Fuctura
## Instrutor: @ericmoraess

### Formulário HTML

O que são formulários HTML?
Formulários HTML são um dos principais pontos de interação entre um usuário e um web site ou aplicativo. Eles permitem que os usuários enviem dados para o web site. Na maior parte do tempo, os dados são enviados para o servidor da web, mas a página da web também pode interceptar para usá-los por conta própria.

Um formulário HTML é feito de um ou mais widgets. Esses widgets podem ser campos de texto (linha única ou de várias linhas), caixas de seleção, botões, checkboxes ou radio buttons. A maior parte do tempo, estes elementos são emparelhados com uma legenda que descreve o seu objetivo.

### O Elemento ```<form>``` 
Todos formulários HTML começam com um elemento <form> como este:

```html
<form action="/pagina-processa-dados-do-form" method="post">
```
</form>

Este elemento define um formulário. É um elemento de container como um elemento mas ele também suporta alguns atributos específicos para configurar a forma como o formulário se comporta. Todos os seus atributos são opcionais, mas é considerada a melhor prática sempre **definir pelo menos o atributo action e o atributo method**.

- O atributo **action** define o local (uma URL ou rota) em que os dados recolhidos do formulário devem ser enviados.

- O atributo **method** define qual o método HTTP para enviar os dados (ele pode ser "GET" ou "POST" (veja as diferenças aqui).

Exemplo de um formulário de cadastro de jogador:

```html
<form action="/pagina-processa-dados-do-form" method="post">
    <div>
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" />
    </div>
    <div>
        <label for="idade">Idade:</label>
        <input type="text" id="idade" name="idade" />
    </div>
    <div>
        <label for="altura">Altura:</label>
        <input type="text" id="altura" name="altura" />
    </div>

    <input type="submit" value="Enviar">

</form>
```

Os elementos ```<div>``` estão lá para estruturar nosso código e deixar a estilização mais fácil.

Observe o uso do atributo for em todos os elementos ```<label>```; é uma maneira para vincular uma label à um campo do formulário. 

No  elemento ```<input>```, o atributo mais importante é o atributo type. Esse atributo é extremamente importante porque define a forma como o elemento ```<input>``` se comporta. 


Ele pode mudar radicalmente o elemento,  então preste atenção a ele. Em nosso exemplo, nós usamos somente o  ```type="text"```, valor padrão para este atributo.

Podemos utilizar os types abaixo:

```html
    <input type="button">
    <input type="checkbox">
    <input type="color">
    <input type="date">
    <input type="datetime-local">
    <input type="email">
    <input type="file">
    <input type="hidden">
    <input type="image">
    <input type="month">
    <input type="number">
    <input type="password">
    <input type="radio">
    <input type="range">
    <input type="reset">
    <input type="search">
    <input type="submit">
    <input type="tel">
    <input type="text">
    <input type="time">
    <input type="url">
    <input type="week">
```

### Botão submit

O código ```<input type="submit" values="Enviar meu dados">``` cria um botão para envio dos dados preenchidos no seu formulário para uma rota definida no controlador.

### Tópicos visto na aula:

- @RequestParam
- @ModelAttribute

# Atividade 3

Utilize o controlador **JogadorController** e **cadastrar.html** que criamos durante a aula.

* Finalizar o formulário de cadastro de jogador

* Adicione uma lista de opções (**drop-down list**) utilizando a tag HTML ```<select>``` com as posições de um jogador. <a href="https://developer.mozilla.org/pt-BR/docs/Web/HTML/Element/select">Referência.</a>


* Salvar no banco de dados o jogador com a sua respectiva posição.

#### Exemplo de um drown-down list:

```<div>
<select name="select">
  <option value="valor1">Valor 1</option>
  <option value="valor2" selected>Valor 2</option>
  <option value="valor3">Valor 3</option>
</select>
</div>```

#### Representação das posições de jogadores em campo de futebol:

- G: Goleiro; 
- Z: Zagueiro; 
- L: Lateral; 
- V: Volante; 
- A: Ala; 
- M: Meio Campo; 
- MC: Meia central; 
- ML: Meia Lateral; 
- MA: Meia Atacante; 
- P: Ponta; 
- AT: Atacante. 

<img src="https://www.researchgate.net/profile/Milton-Erthal-2/publication/326353906/figure/fig1/AS:647595860963329@1531410293471/Figura-1-Representacao-das-posicoes-de-jogadores-em-campo-de-futebol-G-Goleiro-Z.png">

### 2 - Entrega da atividade:
- Prazo: 30/04/22 (23:59)
- Formas de entrega: **GitHub** ou **Google Drive**
- 1 Ponto extra será dado para os alunos que enviar via Github