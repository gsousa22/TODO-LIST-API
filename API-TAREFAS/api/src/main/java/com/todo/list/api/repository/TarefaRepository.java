package com.todo.list.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.todo.list.api.models.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
	
	@Query(value="SELECT * FROM TB_TAREFAS WHERE status='completed' ",nativeQuery = true)
	List<Tarefa> findAllCompleted();
	
	@Query(value="SELECT * FROM TB_TAREFAS WHERE status='pending' ",nativeQuery = true)
	List<Tarefa> findAllPending();
	
	Tarefa deleteById(long id);
	Tarefa findById(long id);
}
