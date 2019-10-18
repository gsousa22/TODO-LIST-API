# TODO-LIST-API

API REST FULL desenvolvida com o framework Spring Boot 2.2.0 junto com as ferramentas Java Persistence API(JPA), Spring Boot Actuator, SWAGGER para a documentação e melhor intendimeno da funcionalidades e utilizando banco de dados SqlServer para a persistência de dados,basta apenas criar um banco de dados com o nome TODO-LIST-API e informar usuário valido com permissão necessária para alteração e criação de tabelas passando as informações para o application.properties que a spring cria e altera automaticamente as tabelas com o intuito de cadastrar, atualizar, listar e apagar tarefas.

Exemplos de requisição:

SWAGGER: http://localhost:8080/swagger-ui.html
  - Documentação de cada metodo.

GET: http://localhost:8080/api/todo
 - lista todas as tarefas.
 
GET: http://localhost:8080/api/todo/1
 - lista taref por Id.
 
POST: http://localhost:8080/api/todo
 - Cadastra uma nova tarefa.
  
  Exemplo de Body:  
   {
      "nome_tarefa":"Nova tarefa",
      "desc_tarefa":"Nova tarefa de teste",
      "status":"pending"
   }
 
  
PUT: http://localhost:8080/api/todo
 - Atualiza uma tarefa.
  
  Exemplo de Body:  
   {
      "id_terefa": 1,
      "nome_tarefa":"Nova tarefa1",
      "desc_tarefa":"Nova tarefa de teste1",
      "status":"completed"
    }
 
 DELETE: http://localhost:8080/api/todo/1
  - Deleta uma tarefa por id.
  
 DELETE: http://localhost:8080/api/todo
  - Deleta uma tarefa. 
 
  Exemplo de Body:  
   {  
      "id_terefa": 1,
      "nome_tarefa":"Nova tarefa1",
      "desc_tarefa":"Nova tarefa de teste1",
      "status":"completed"
    }
  
 GET: http://localhost:8080/api/todo/pending
   - Lista as tarefas pendidas.
   
 GET: http://localhost:8080/api/todo/completed
   - Lista as tarefas concluídas.
