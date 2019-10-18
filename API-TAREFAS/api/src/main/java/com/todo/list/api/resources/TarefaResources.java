package com.todo.list.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.list.api.models.Tarefa;
import com.todo.list.api.repository.TarefaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Tarefas")
@CrossOrigin(origins="*")
public class TarefaResources {
	
	@Autowired
	TarefaRepository tarefaRepository;
	
	@GetMapping("/todo")
	@ApiOperation(value="Retorna uma lista de tarfas")
	public List<Tarefa>  listaTarefas(){
		return tarefaRepository.findAll();
	}
	
	@ApiOperation(value="Retorna tarefa com base no Id")
	@GetMapping("/todo/{id}")
	public Tarefa getTarefa(@PathVariable(value="id") long id) {
		return tarefaRepository.findById(id);
	}
	
	@ApiOperation(value="Cadastra uma nova tarefa")
	@PostMapping("/todo")
	public Tarefa salvarTarefa(@RequestBody Tarefa tarefa){
		return tarefaRepository.save(tarefa);
	}
	
	@ApiOperation(value="Atuliza uma terefa")
	@PutMapping("/todo") 
	public Tarefa atualizarTarefa(@RequestBody Tarefa tarefa) {
		return tarefaRepository.save(tarefa);
	}
	
	@ApiOperation(value="Delata uma tarefa passando somente o Id")
	@DeleteMapping("/todo/{id}")
	public void deletarPorId(@PathVariable(value="id") long id) {
		tarefaRepository.deleteById(id);
	}
	
	@ApiOperation(value="Delata uma tarefa")
	@DeleteMapping("/todo")
	public void deletarTarefa(@RequestBody Tarefa tarefa) {
		tarefaRepository.delete(tarefa);
	}
	
	@ApiOperation(value="Lista tarefas completas")
	@GetMapping("/todo/completed")
	public List<Tarefa> listaTarefasCompletas(){
		return tarefaRepository.findAllCompleted();
	}
	
	@ApiOperation(value="Lista tarefas pendidas")
	@GetMapping("/todo/pending")
	public List<Tarefa> listaTarefasPendidas(){
		return tarefaRepository.findAllPending();
	}
	
	

}
