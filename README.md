<div align="center">
  <h1 align="center">
    <code>─── CAMI-PROJETO-MONGO ───</code>
  </h1>
  <p>API backend em Java com Spring Boot e MongoDB, criada para praticar <br> integração com banco NoSQL e operações CRUD via API REST.</p>
</div>

## 🛠 Tecnologias
- **Java** (JDK 17+)
- **Spring Boot**
- **Spring Data MongoDB**
- **MongoDB**
- **Maven Wrapper** (mvnw)
- **Postman**
- **Git/GitHub**

## ⚙️ Funcionalidades
- Operações CRUD via API REST (GET/POST/PUT/DELETE)
- Persistência de dados em MongoDB (NoSQL)
- Estrutura organizada por camadas (controller/service/repository)

## 🟣 Como executar (local)

### 1) Pré-requisitos
Instale e confirme que estão funcionando:
- Java JDK 17 (ou superior)
- MongoDB rodando localmente na porta ```27017```

### 2) Clonar o repositório
No terminal:

```bash
git clone https://github.com/camillifidelis/cami-projeto-mongo.git
cd cami-projeto-mongo
```

### 3) Configurar a conexão com o MongoDB
A aplicação está configurada para conectar em `localhost:27017`.

Se precisar conferir ou alterar a conexão, edite:
`src/main/resources/application.properties`

Procure por uma destas configurações:
- `spring.data.mongodb.uri`
ou
- `spring.data.mongodb.host`, `spring.data.mongodb.port`, `spring.data.mongodb.database`

### 4) Compilar e executar

**Linux/Mac**
```bash
./mvnw clean install
./mvnw spring-boot:run
```

**Windows (PowerShell ou CMD)**
```bash
.\mvnw.cmd clean install
.\mvnw.cmd spring-boot:run
```

### 5) Acessar a aplicação
Com a aplicação rodando, a API ficará disponível em:
http://localhost:8080

### Testar a API
Após iniciar a aplicação, utilize o Postman para testar os endpoints (GET/POST/PUT/DELETE).

### 🎓 Créditos
Este é um projeto prático desenvolvido sob a orientação do professor Nelio Alves, como parte do curso Java Completo na Udemy. A implementação foi realizada de forma guiada para fins de estudo, prática de codificação e compreensão da integração entre Spring Boot e MongoDB.

---
<div align="center">
  <picture>
    <source media="(prefers-color-scheme: light)" srcset="https://raw.githubusercontent.com/camillifidelis/cami-projeto-mongo/main/assets/logo-dark.svg">
    <source media="(prefers-color-scheme: dark)" srcset="https://raw.githubusercontent.com/camillifidelis/cami-projeto-mongo/main/assets/logo-light.svg">
    <img alt="CamiDev Logo" src="https://raw.githubusercontent.com/camillifidelis/cami-projeto-mongo/main/assets/logo-dark.svg" width="300">
  </picture>
</div>
