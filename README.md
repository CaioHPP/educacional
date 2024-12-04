# Sistema Educacional

Este projeto é um sistema educacional desenvolvido com **Spring Boot** e organizado em quatro principais camadas para
facilitar a manutenção e a escalabilidade: **controller**, **dto**, **model** e **repository**. Além disso, ele conta
com uma documentação gerada automaticamente pelo **SpringDoc OpenAPI**.

## Funcionalidades

- Cadastro e gerenciamento de Alunos, Professores, Cursos, Turmas, Disciplinas, Matrículas e Notas.
- Visualização de boletim de alunos.
- Cálculo de desempenho de disciplinas e turmas.
- Endpoints REST para operações CRUD.
- Documentação Swagger acessível via navegador.

## Estrutura do Projeto

### Camadas

1. **Controller**: Contém os endpoints do backend, implementando os métodos para GET, POST, PUT e DELETE.
2. **DTO**: Contém os objetos de transferência de dados (requests e responses) para manipular e retornar informações
   específicas em requisições HTTP.
3. **Model**: Contém as classes que representam as entidades do sistema.
4. **Repository**: Contém as interfaces que estendem a biblioteca JPA para manipulação de dados no banco.

## Tecnologias Utilizadas

- **Spring Boot**
- **Spring Data JPA**
- **Flyway**
- **MySQL**
- **SpringDoc OpenAPI** (versão 2.6.0)

## Endpoints Disponíveis

Acesse a documentação Swagger para explorar os endpoints:

```
http://localhost:8080/swagger-ui/index.html
```

### Principais Controladores

#### Professor Controller

- `GET /api/professores`
- `POST /api/professores`
- `GET /api/professores/{id}`
- `PUT /api/professores/{id}`
- `DELETE /api/professores/{id}`

#### Disciplina Controller

- `GET /api/disciplinas`
- `POST /api/disciplinas`
- `GET /api/disciplinas/{id}`
- `PUT /api/disciplinas/{id}`
- `DELETE /api/disciplinas/{id}`
- `GET /api/disciplinas/{id}/notas`
- `GET /api/disciplinas/{id}/desempenho`
- `GET /api/disciplinas/desempenho`

#### Aluno Controller

- `GET /api/alunos`
- `POST /api/alunos`
- `GET /api/alunos/{id}`
- `PUT /api/alunos/{id}`
- `DELETE /api/alunos/{id}`
- `POST /api/alunos/{aluno_id}/matricula`
- `GET /api/alunos/{aluno_id}/boletim`

E muitos outros! Consulte o Swagger para uma lista completa.

## Banco de Dados

Para o funcionamento correto, é necessário:

1. Iniciar um banco de dados MySQL.
2. Criar um banco chamado `educacional` antes de rodar a aplicação.

## Dependências do Projeto

```xml

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
<groupId>org.flywaydb</groupId>
<artifactId>flyway-core</artifactId>
</dependency>
<dependency>
<groupId>org.flywaydb</groupId>
<artifactId>flyway-mysql</artifactId>
</dependency>
<dependency>
<groupId>org.springdoc</groupId>
<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
<version>2.6.0</version>
</dependency>
<dependency>
<groupId>com.mysql</groupId>
<artifactId>mysql-connector-j</artifactId>
<scope>runtime</scope>
</dependency>
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-test</artifactId>
<scope>test</scope>
</dependency>
```

## Como Executar

1. Clone este repositório.
2. Configure um banco de dados MySQL e crie o banco `educacional`.
3. Ajuste as configurações de conexão no arquivo `application.properties`.
4. Execute a aplicação a partir do arquivo `EducacionalApplication.java`.
5. Acesse o Swagger em:

```
http://localhost:8080/swagger-ui/index.html
```

## Contribuição

Contribuições são bem-vindas! Fique à vontade para abrir issues ou enviar pull requests.

