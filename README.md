# TODO-LIST-API
A
API REST FULL desenvolvida com o framework Spring Boot 2.2.0 junto com as ferramentas Java Persistence API(JPA), Spring Boot Actuator e SWAGGER para a documentação e melhor intendimeno da funcionalidades com o intuito de cadastrar, atualizar, listar e apagar tarefas.

Exemplos de requisição:

SWAGGER: http://localhost:8080/swagger-ui.html
  - Documentação de cada metodo.

GET: http://localhost:8080/api/todo
 - lista todas as tarefas.
 
POST: http://localhost:8080/api/todo
  - Cadastra uma nova tarefa.
  
PUT: http://localhost:8080/api/todo
 - Atualiza uma tarefa.
 
DELETE: http://localhost:8080/api/todo
  - Deleta uma tarefa.
  
 GET: http://localhost:8080/api/todo/pending
   - Lista as tarefas pendidas.
   
 GET: http://localhost:8080/api/todo/completed
   - Lista as tarefas concluídas.
