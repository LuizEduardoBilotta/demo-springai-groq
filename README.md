<h1 align="center">
    <img src="https://i.imgur.com/lYLd4V2.png" alt="Home page Costs"/>
</h1>
<h2 align="center">Spring AI e Groq: Guia Completo para Criar um Assistente Inteligente</h2>
<p> 
  Implementação completa de um assistente com Spring AI e Groq, configuração de Beans, uso de PromptTemplate e integração com LLMs de alta performance. Projeto de estudo e compartilhamento de conhecimento através do Blog Tech - Luiz Eduardo Bilotta.
</p>

## :dart: Índice

- [Status](##status)
- [Tecnologias](#tecnologias)
- [Executando o projeto](#executando-o-projeto)
- [Licença](#licença)

## :game_die: Status

<p align="center">
  <img src="https://img.shields.io/github/repo-size/LuizEduardoBilotta/demo-springai-groq?style=for-the-badge" alt="Repository size">
  <img src="https://img.shields.io/github/license/LuizEduardoBilotta/demo-springai-groq?style=for-the-badge" alt="License">
  <img src="https://img.shields.io/github/languages/count/LuizEduardoBilotta/demo-springai-groq?style=for-the-badge&color=eb152a" alt="Counter Languages">
  <img src="https://img.shields.io/github/last-commit/LuizEduardoBilotta/demo-springai-groq?style=for-the-badge&color=f50cbb" alt="Last commit">
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

3. _Configure a API Key do Groq como variável de ambiente:_
```sh
# Se estiver utilizando o Intellij, acesse Edit Configurations.

# Em Environments Variables defina uma variável com o nome GROQ_API_KEY e em valor insira a API Key gerada no site do Groq.
```

4. _Execute a aplicação:_

```sh
$ mvn spring-boot:run
```
Pronto! sua aplicação estará rodando em: `localhost:3000`

5. _Realizando requisição no endpoint do assistente:
```curl
curl --location 'localhost:3000/demo--springai-groq/chat/generate' \
--header 'Content-Type: application/json' \
--data '{
    "message": "Sua pergunta"
}'
```
Substitua "Sua pergunta" pelo texto no qual quer enviar para o chat

## :bookmark_tabs: Licença

Este projeto está licenciado nos termos da licença MIT. Veja o arquivo [LICENSE](./LICENSE) para mais detalhes.

## :jigsaw: Contato

- :mailbox_with_mail: E-mail: <a href="mailto:luizeduardobilotta@gmail.com">luizeduardobilotta@gmail.com</a>
- :pushpin: Linkedin: [in/luizeduardobilotta](https://www.linkedin.com/in/luizeduardobilotta)

<sup>Desenvolvido por <i><strong>Luiz Eduardo Bilotta.</i></strong></sup>
