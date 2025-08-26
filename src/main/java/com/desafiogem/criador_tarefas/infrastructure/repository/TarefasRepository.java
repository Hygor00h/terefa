package com.desafiogem.criador_tarefas.infrastructure.repository;

import com.desafiogem.criador_tarefas.infrastructure.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefasRepository extends JpaRepository <Tarefa, Long> {
}
