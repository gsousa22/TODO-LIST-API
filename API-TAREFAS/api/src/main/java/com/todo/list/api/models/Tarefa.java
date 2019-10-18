package com.todo.list.api.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_TAREFAS")
public class Tarefa  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_tarefa;
	
	private String nome_tarefa;
	
	private String desc_tarefa;
	
	private String status;

	public long getId_tarefa() {
		return id_tarefa;
	}

	public void setId_tarefa(long id_tarefa) {
		this.id_tarefa = id_tarefa;
	}

	public String getNome_tarefa() {
		return nome_tarefa;
	}

	public void setNome_tarefa(String nome_tarefa) {
		this.nome_tarefa = nome_tarefa;
	}

	public String getDesc_tarefa() {
		return desc_tarefa;
	}

	public void setDesc_tarefa(String desc_tarefa) {
		this.desc_tarefa = desc_tarefa;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

		
	
	
	
	
	

}
