<h1 align="center">
    <img src="https://i.imgur.com/SDlSy0P.png" alt="Home page Costs"/>
</h1>
<h2 align="center">Spring AI e Groq: Guia Completo para Criar um Assistente Inteligente</h2>
<p> 
  Implementação completa de um assistente com Spring AI e Groq, configuração de Beans, uso de PromptTemplate e integração com LLMs de alta performance. Projeto de estudo e compartilhamento de conhecimento através do <strong>Blog Tech - Luiz Eduardo Bilotta</strong>.</br>
  <a href = "https://luizeduardobilotta.com.br/post/java/spring-ai-e-groq-guia-completo-para-criar-um-assistente--inteligente/">
      Acesse o artigo clicando aqui
  </a>
</p>

## :dart: Índice

- [Status](#status)
- [Tecnologias](#tecnologias)
- [Executando o projeto](#executando-o-projeto)
- [Licença](#licença)

## :game_die: Status

<p align="center">

 <a href="https://github.com/LuizEduardoBilotta/demo-springai-groq">
    <img src="https://img.shields.io/badge/Repo-demo--springai--groq-2b82c9?style=for-the-badge&logo=github" alt="Repo">
  </a>
  <img src="https://img.shields.io/badge/License-MIT-brightgreen?style=for-the-badge&logo=github" alt="License">
  <img src="https://img.shields.io/badge/Language-Java-007396?style=for-the-badge&logo=openjdk" alt="Language">
  <img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=java" alt="Java">
  <img src="https://img.shields.io/badge/Spring-3.4.7-6DB33F?style=for-the-badge&logo=spring" alt="Spring">
  <img src="https://img.shields.io/badge/Maven-3.9.10-007396?style=for-the-badge&logo=apachemaven" alt="Maven">
  <img src="https://img.shields.io/badge/Status-Study-blue?style=for-the-badge" alt="Status">
</p>

## :toolbox: Tecnologias

- Java 21.0.4
- Spring 3.4.7
- Maven 3.9.10

## :gear: Executando o projeto

1. _Faça o clone do repositório:_

```sh
$ git clone https://github.com/LuizEduardoBilotta/demo-springai-groq
```

2. _Realize o build do projeto:_

```sh
# Acesse o diretório do projeto:
$ cd demo-springai-groq

# Realize o build:
$ mvn clean install
```

3. _Configure a API Key do Groq como variável de ambiente utilizando uma das opções abaixo:_

Linux / macOS:
```sh
export GROQ_API_KEY="sua_groq_api_key_aqui"
```

PowerShell (Windows):
```ps1
$env:GROQ_API_KEY = "sua_groq_api_key_aqui"
```

Persistente no Windows (cmd / global):
```cmd
setx GROQ_API_KEY "sua_groq_api_key_aqui"
```

No Intellij IDEA:
```Run > Edit Configurations...``` → em Environment variables adicione GROQ_API_KEY=seu_valor

4. _Execute a aplicação:_

```sh
# Usando plugin do Spring Boot:
$ mvn spring-boot:run

# ou executando o artefato empacotado (após `mvn package`):
$ java -jar target/*.jar
```
Pronto! sua aplicação estará rodando em: `localhost:3000`

5. _Realizando requisição no endpoint do assistente:_
```curl
curl -X POST "http://localhost:3000/demo-springai-groq/chat/generate" \
  -H "Content-Type: application/json" \
  -d '{"message":"Sua pergunta"}'
```
Substitua "Sua pergunta" pelo texto no qual quer enviar para o assistente.  
Execute o curl em seu terminal ou importe em uma ferramenta como Postman, Insomnia por exemplo.

## :bookmark_tabs: Licença

Este projeto está licenciado nos termos da licença MIT. Veja o arquivo [LICENSE](./LICENSE) para mais detalhes.

## :jigsaw: Contato

- :mailbox_with_mail: E-mail: <a href="mailto:luizeduardobilotta@gmail.com">luizeduardobilotta@gmail.com</a>
- :pushpin: Linkedin: [in/luizeduardobilotta](https://www.linkedin.com/in/luizeduardobilotta)

<sup>Desenvolvido por <i><strong>Luiz Eduardo Bilotta.</i></strong></sup>
