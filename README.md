# API REST Filtro de Gasto por Data
API RESTful com Spring Boot, Java 8, MongoDB

### Como executar a aplicação
Certifique-se de ter o Maven instalado e adicionado ao PATH de seu sistema operacional, assim como o Git.

git clone https://github.com/sricardo97/api-rest-listagem-gasto.git

cd api-rest-listagem-gasto

mvn spring-boot:run

Acesse http://localhost:8080/api/gastos

Utilize o usuário "user" e a senha que é impressa no terminal ao executar a aplicação para autenticar.


### APIs endpoints para Teste
GET http://localhost:8080/api/gastos/{data}


### Importando o projeto no Eclipse ou STS
mvn eclipse:eclipse